package com.jghz.sh.service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc32Dao;
import com.jghz.sh.dao.Shjc32aDao;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh32;
import com.jghz.sh.entity.Tbsh32a;
import com.jghz.sh.entity.Tbwd02;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc32aaService  
* 类描述：  
* 创建人：Tom  
* 创建时间：3226-32-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：3226-32-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc32aService {
	
	@Resource
	private Shjc32aDao shjc32aDao;
	@Resource
	private Shjc32Dao shjc32Dao;
	
	@Resource
	private Shjc10Dao shjc10Dao;


	/**  
	* loadSh32 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3226-32-29 下午2:17:25 
	* 修改时间：3226-32-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh32a(Page<Tbsh32a> page, Map<String, Object> paramater)
			throws Exception {
		shjc32aDao.pagingQuery(page, paramater);
	}

	
	
	  
	/**  
	* executeConfirm 合并结算和结算 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-18 下午8:32:02 
	* 修改时间：2016-11-18 下午8:32:02 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh32a> sh32as){
		Properties prop = new Properties();
		boolean flag = true;
		BigDecimal wgtTotal = new BigDecimal("0");
		BigDecimal amtTotal = new BigDecimal("0");
		BigDecimal numTotal = new BigDecimal("0");
		Tbsh32a inSh32a = new Tbsh32a();
		try {
			for(Tbsh32a sh32a : sh32as){
				inSh32a = sh32a;
				String status = sh32a.getStatus();
				if("0".equals(status)){
					prop.put("msg", "取消成功");
					prop.put("flag", flag);
					shjc32aDao.update(sh32a);
				}else if("1".equals(status)){
					prop.put("msg", "确认成功");
					prop.put("flag", flag);
					shjc32aDao.update(sh32a);
					
					//计算总重量、总件数、总金额
//					wgtTotal = wgtTotal.add(AppUtils.getBigDecimal(sh32a.getWeight()));
//					amtTotal = amtTotal.add(AppUtils.getBigDecimal(sh32a.getMoney()));
//					numTotal = numTotal.add(AppUtils.getBigDecimal(sh32a.getNum()));
				}
			}
			Map inMap = new HashMap();
			inMap.put("settleWgtTotal", wgtTotal);
			inMap.put("settleAmtTotal", amtTotal);
			inMap.put("settleNumTotal", numTotal);

			//TODO 组主档TBSH32
			boolean boo = this.SaveSh32(inSh32a, inMap);
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	

	/**  
	* delSh32a
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3226-32-29 下午2:17:35 
	* 修改时间：3226-32-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties delSh32a(Collection<Tbsh32a> sh32as){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			BigDecimal subBackWgt = BigDecimal.ZERO;
			BigDecimal subArActMount = BigDecimal.ZERO;
			String settleNo = "";
			for (Tbsh32a sh32a : sh32as) {
				String transNo = sh32a.getTransNo();
				settleNo = sh32a.getSettleNo();
				BigDecimal backWgt = sh32a.getBackWgt();
				BigDecimal arActMount = sh32a.getArActMount();
				//先删除32a
				shjc32aDao.delete(sh32a);
				subBackWgt = subBackWgt.add(backWgt);
				subArActMount = subArActMount.add(arActMount);
				//再修改sh10的状态为待结算
				Tbsh10 sh10 = shjc10Dao.queryByTransNo(transNo);
				sh10.setStatus("10");
				shjc10Dao.update(sh10);
			}
			
			//再减去sh32中的重量、金额
			Tbsh32 sh32 = shjc32Dao.queryBySettleNo(settleNo);
			BigDecimal backWgt_sh32 = AppUtils.getBigDecimal(sh32.getSettleWgtTotal());
			BigDecimal arActMount_sh32 = AppUtils.getBigDecimal(sh32.getSettleAmtTotal());
			backWgt_sh32 = backWgt_sh32.subtract(subBackWgt);
			arActMount_sh32 = arActMount_sh32.subtract(subArActMount);
			sh32.setSettleAmtTotal(arActMount_sh32);
			sh32.setSettleWgtTotal(backWgt_sh32);
			shjc32Dao.update(sh32);
			
			prop.put("msg", msg.toString());
			prop.put("flag", boo);
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	
	  
	/**  
	* SaveSh32 组主档
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-18 下午8:31:46 
	* 修改时间：2016-11-18 下午8:31:46 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	private boolean SaveSh32(Tbsh32a sh32a,Map inMap) throws Exception{
		String transNo = sh32a.getTransNo();
		//补完内容
		Tbsh32 sh32 = new Tbsh32();
		Tbsh10 sh10 = new Tbsh10();
		String hql = " from Tbsh10 where transNo = '"+transNo+"' and compId='"+AppUtils.getCompId()+"' ";
		sh10 = shjc10Dao.queryByTransNo(transNo);
		AppUtils.copyProperties(sh32a, sh32);
		AppUtils.copyProperties(inMap, sh32);
		AppUtils.copyProperties(sh10, sh32);

		sh32.setSh32Id(AppUtils.generateUniqueKey());
		sh32.setCreateDate(new Date());
		
		boolean boo = shjc10Dao.save(sh10);
		return boo;
	}
	
	@DataProvider
	public void queryWdsh02(Page<Tbwd02> page, String paramater)
			throws Exception {
		shjc32aDao.queryWdsh02(page, paramater);
	}
	 
}

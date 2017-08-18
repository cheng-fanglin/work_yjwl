package com.jghz.sh.service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc22Dao;
import com.jghz.sh.dao.Shjc35Dao;
import com.jghz.sh.dao.Shjc35aDao;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh22;
import com.jghz.sh.entity.Tbsh35;
import com.jghz.sh.entity.Tbsh35a;
import com.jghz.sh.entity.Tbwd02;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc35aaService  
* 类描述：  
* 创建人：Tom  
* 创建时间：3526-35-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：3526-35-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc35aService {
	
	@Resource
	private Shjc35aDao shjc35aDao;
	@Resource
	private Shjc35Dao shjc35Dao;
	
	@Resource
	private Shjc22Dao shjc22Dao;


	/**  
	* loadSh35 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3526-35-29 下午2:17:25 
	* 修改时间：3526-35-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh35a(Page<Tbsh35a> page, Map<String, Object> paramater)
			throws Exception {
		shjc35aDao.pagingQuery(page, paramater);
	}

//	
//	
//	  
//	/**  
//	* executeConfirm 合并结算和结算 
//	* 创建人：Tom 
//	* 修改人：Tom 
//	* 创建时间：2016-11-18 下午8:35:02 
//	* 修改时间：2016-11-18 下午8:35:02 
//	* @param name  
//	* @param @return 设定文件  
//	* @return String DOM对象  
//	* @Exception 异常对象  
//	* @since  CodingExample　Ver(编码范例查看) 1.1  
//	*/  
//	@DataResolver
//	public Properties executeConfirm(Collection<Tbsh35a> sh35as){
//		Properties prop = new Properties();
//		boolean flag = true;
//		BigDecimal wgtTotal = new BigDecimal("0");
//		BigDecimal amtTotal = new BigDecimal("0");
//		BigDecimal numTotal = new BigDecimal("0");
//		Tbsh35a inSh35a = new Tbsh35a();
//		try {
//			for(Tbsh35a sh35a : sh35as){
//				inSh35a = sh35a;
//				String status = sh35a.getStatus();
//				if("0".equals(status)){
//					prop.put("msg", "取消成功");
//					prop.put("flag", flag);
//					shjc35aDao.update(sh35a);
//				}else if("1".equals(status)){
//					prop.put("msg", "确认成功");
//					prop.put("flag", flag);
//					shjc35aDao.update(sh35a);
//					
//					//计算总重量、总件数、总金额
////					wgtTotal = wgtTotal.add(AppUtils.getBigDecimal(sh35a.getWeight()));
////					amtTotal = amtTotal.add(AppUtils.getBigDecimal(sh35a.getMoney()));
////					numTotal = numTotal.add(AppUtils.getBigDecimal(sh35a.getNum()));
//				}
//			}
//			Map inMap = new HashMap();
//			inMap.put("settleWgtTotal", wgtTotal);
//			inMap.put("settleAmtTotal", amtTotal);
//			inMap.put("settleNumTotal", numTotal);
//
//			//TODO 组主档TBSH35
//			boolean boo = this.saveSh35a(inSh35a, inMap);
//		} catch (Exception e) {
//			prop.put("msg", e.getMessage());
//			prop.put("flag", false);
//		}
//		return prop;
//	}
//	

	/**  
	* delSh35a
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3526-35-29 下午2:17:35 
	* 修改时间：3526-35-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties delSh35a(Collection<Tbsh35a> sh35as){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			BigDecimal subBackWgt = BigDecimal.ZERO;
			BigDecimal subArActMount = BigDecimal.ZERO;
			String settleNo = "";
			for (Tbsh35a sh35a : sh35as) {
				String shipListNo = sh35a.getShipListNo();
				settleNo = sh35a.getSettleNo();
				Tbsh35 sh35 = shjc35Dao.queryBySettleNo(settleNo);
				String status_sh35 = sh35.getStatus();
				if("12".equals(status_sh35)){
					throw new Exception("已结算确认，不能删除");
				}
				BigDecimal backWgt = AppUtils.getBigDecimal(sh35a.getBackShipWgt());
				BigDecimal arActMount = AppUtils.getBigDecimal(sh35a.getArActMount());
				//先删除35a
				shjc35aDao.delete(sh35a);
				subBackWgt = subBackWgt.add(backWgt);
				subArActMount = subArActMount.add(arActMount);
				//再修改sh10的状态为待结算
				List sh22List = shjc22Dao.queryByShipNoList(shipListNo);
				if(CollectionUtils.isNotEmpty(sh22List)){
					Tbsh22 sh22 = (Tbsh22)sh22List.get(0);
					sh22.setStatus("10");
					shjc22Dao.update(sh22);
				}
			}
			
			//再减去sh35中的重量、金额
			Tbsh35 sh35 = shjc35Dao.queryBySettleNo(settleNo);
			BigDecimal backWgt_sh35 = AppUtils.getBigDecimal(sh35.getSettleWgtTotal());
			BigDecimal arActMount_sh35 = AppUtils.getBigDecimal(sh35.getSettleAmtTotal());
			backWgt_sh35 = backWgt_sh35.subtract(subBackWgt);
			arActMount_sh35 = arActMount_sh35.subtract(subArActMount);
			sh35.setSettleAmtTotal(arActMount_sh35);
			sh35.setSettleWgtTotal(backWgt_sh35);
			shjc35Dao.update(sh35);
			
			prop.put("msg", msg.toString());
			prop.put("flag", boo);
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	
//	  
//	@SuppressWarnings("unchecked")
//	@DataResolver
//	public Properties saveSh35a(Tbsh35a sh35a,Map inMap) throws Exception{
//		Properties prop = new Properties();
//		boolean boo = true;
//		StringBuffer msg = new StringBuffer();
//		String transNo = sh35a.getTransNo();
//		//补完内容
//		Tbsh35 sh35 = new Tbsh35();
//		Tbsh10 sh10 = new Tbsh10();
//		String hql = " from Tbsh10 where transNo = '"+transNo+"' and compId='"+AppUtils.getCompId()+"' ";
//		sh10 = shjc10Dao.queryByTransNo(transNo);
//		AppUtils.copyProperties(sh35a, sh35);
//		AppUtils.copyProperties(inMap, sh35);
//		AppUtils.copyProperties(sh10, sh35);
//
//		sh35.setSh35Id(AppUtils.generateUniqueKey());
//		sh35.setCreateDate(new Date());
//		
//		return prop;
//	}
	
	@DataProvider
	public void queryWdsh02(Page<Tbwd02> page, String paramater)
			throws Exception {
		shjc35aDao.queryWdsh02(page, paramater);
	}
	 
}

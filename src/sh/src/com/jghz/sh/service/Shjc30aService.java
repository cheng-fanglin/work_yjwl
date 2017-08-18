package com.jghz.sh.service;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.rmi.dgc.VMID;
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
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc30aDao;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh30;
import com.jghz.sh.entity.Tbsh30a;
import com.jghz.sh.entity.Tbwd02;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc30aaService  
* 类描述：  
* 创建人：Tom  
* 创建时间：3026-30-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：3026-30-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc30aService {
	
	@Resource
	private Shjc30aDao shjc30aDao;
	
	@Resource
	private Shjc10Dao shjc10Dao;

	/**  
	* loadSh30 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3026-30-29 下午2:17:25 
	* 修改时间：3026-30-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh30a(Page<Tbsh30a> page, Map<String, Object> paramater)
			throws Exception {
		shjc30aDao.pagingQuery(page, paramater);
	}

	/**  
	* saveSh30
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：3026-30-29 下午2:17:35 
	* 修改时间：3026-30-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh30a(Collection<Tbsh30a> sh30as){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh30a sh30a : sh30as) {
				EntityState state = EntityUtils.getState(sh30a);
				if (state.equals(EntityState.NEW)) {
					String settleItem= shjc30aDao.genSettleItem(sh30a.getSettleNo());
					sh30a.setStatus("0");
					sh30a.setSettleItem(settleItem);
					sh30a.setCompId(AppUtils.getCompId());
					sh30a.setSh30aId(new VMID().toString());
					sh30a.setCreateDate(new Date());
					boo=shjc30aDao.save(sh30a);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}else{
						msg.append("新增成功");
					}
				}
				if (state.equals(EntityState.MODIFIED)) {
					sh30a.setUpdateDate(new Date());
					boo=shjc30aDao.update(sh30a);
					if(boo == false){
						msg.append("无修改数据");
						break;
					}else{
						msg.append("修改成功");
					}
				}
				if (state.equals(EntityState.DELETED)) {
					boo=shjc30aDao.delete(sh30a);
					if(boo == false){
						msg.append("无删除数据");
						break;
					}else{
						msg.append("删除成功");
					}
				}
			}
			prop.put("msg", msg.toString());
			prop.put("flag", boo);
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	
	  
	/**  
	* executeConfirm 合并结算和结算 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-18 下午8:30:02 
	* 修改时间：2016-11-18 下午8:30:02 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh30a> sh30as){
		Properties prop = new Properties();
		boolean flag = true;
		BigDecimal wgtTotal = new BigDecimal("0");
		BigDecimal amtTotal = new BigDecimal("0");
		BigDecimal numTotal = new BigDecimal("0");
		Tbsh30a inSh30a = new Tbsh30a();
		try {
			for(Tbsh30a sh30a : sh30as){
				inSh30a = sh30a;
				String status = sh30a.getStatus();
				if("0".equals(status)){
					prop.put("msg", "取消成功");
					prop.put("flag", flag);
					shjc30aDao.update(sh30a);
				}else if("1".equals(status)){
					prop.put("msg", "确认成功");
					prop.put("flag", flag);
					shjc30aDao.update(sh30a);
					
					//计算总重量、总件数、总金额
					wgtTotal = wgtTotal.add(AppUtils.getBigDecimal(sh30a.getWeight()));
					amtTotal = amtTotal.add(AppUtils.getBigDecimal(sh30a.getMoney()));
					numTotal = numTotal.add(AppUtils.getBigDecimal(sh30a.getNumber()));
				}
			}
			Map inMap = new HashMap();
			inMap.put("settleWgtTotal", wgtTotal);
			inMap.put("settleAmtTotal", amtTotal);
			inMap.put("settleNumTotal", numTotal);

			//TODO 组主档TBSH30
			boolean boo = this.SaveSh30(inSh30a, inMap);
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	
	  
	/**  
	* SaveSh30 组主档
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
	private boolean SaveSh30(Tbsh30a sh30a,Map inMap) throws Exception{
		String transNo = sh30a.getTransNo();
		//补完内容
		Tbsh30 sh30 = new Tbsh30();
		Tbsh10 sh10 = new Tbsh10();
		String hql = " from Tbsh10 where transNo = '"+transNo+"' and compId='"+AppUtils.getCompId()+"' ";
		sh10 = shjc10Dao.queryByTransNo(transNo);
		AppUtils.copyProperties(sh30a, sh30);
		AppUtils.copyProperties(inMap, sh30);
		AppUtils.copyProperties(sh10, sh30);

		sh30.setSh30Id(AppUtils.generateUniqueKey());
		sh30.setCreateDate(new Date());
		
		boolean boo = shjc10Dao.save(sh10);
		return boo;
	}
	
	@DataProvider
	public void queryWdsh02(Page<Tbwd02> page, String paramater)
			throws Exception {
		shjc30aDao.queryWdsh02(page, paramater);
	}
	 
}

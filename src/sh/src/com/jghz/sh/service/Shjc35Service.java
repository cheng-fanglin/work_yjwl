package com.jghz.sh.service;

import java.math.BigDecimal;
import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.base.util.DateUtil;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.dao.Shjc22Dao;
import com.jghz.sh.dao.Shjc32Dao;
import com.jghz.sh.dao.Shjc35Dao;
import com.jghz.sh.dao.Shjc35aDao;
import com.jghz.sh.dao.Shjc34Dao;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh22;
import com.jghz.sh.entity.Tbsh32;
import com.jghz.sh.entity.Tbsh35;
import com.jghz.sh.entity.Tbsh35a;
import com.jghz.sh.entity.Tbsh34;
import com.jghz.sh.entity.Tbwd01;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc35Service  
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
public class Shjc35Service {
	
	@Resource
	private Shjc35Dao shjc35Dao;
	@Resource
	private Shjc22Dao shjc22Dao;
	
	@Resource
	private Shjc32Dao shjc32Dao;
	
	@Resource
	private Shjc35aDao shjc35aDao;
	
	@Resource
	private Shjc10aDao shjc10aDao;
	
	@Resource
	private Shjc34Dao shjc34Dao;

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
	public void loadSh35(Page<Tbsh35> page, Map<String, Object> paramater)
			throws Exception {
		shjc35Dao.pagingQuery(page, paramater);
	}
	
	@DataProvider
	public void querySh34(Page<Tbsh34> page, Map<String, Object> paramater){
		try {
			shjc34Dao.pagingQuery(page,paramater);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@DataProvider
	public void querySh22(Page<Tbsh22> page, Map<String, Object> paramater){
		try {
			shjc22Dao.querySettle(page,paramater);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	  

	/**  
	* saveSh35
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
	public Properties saveSh35(Collection<Tbsh35> sh35s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh35 sh35 : sh35s) {
				EntityState state = EntityUtils.getState(sh35);
				if (state.equals(EntityState.NEW)) {
					String settleNo = shjc35Dao.genSettleNo();
					sh35.setStatus("0");
					sh35.setSettleNo(settleNo);
					sh35.setCompId(AppUtils.getCompId());
					sh35.setSh35Id(new VMID().toString());
					sh35.setCreateDate(new Date());
					boo=shjc35Dao.save(sh35);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}else{
						msg.append("新增成功");
					}
				}
				if (state.equals(EntityState.MODIFIED)) {
					sh35.setUpdateDate(new Date());
					boo=shjc35Dao.update(sh35);
					if(boo == false){
						msg.append("无修改数据");
						break;
					}else{
						msg.append("修改成功");
					}
				}
				if (state.equals(EntityState.DELETED)) {
					String settleNo = sh35.getSettleNo();
					List sh35aList = shjc35aDao.queryBySettleNo(settleNo);
					if(CollectionUtils.isNotEmpty(sh35aList)){
						throw new Exception("请先删除项次");
					}
					boo=shjc35Dao.delete(sh35);
					if(boo == false){
						msg.append("无删除数据");
						break;
					}else{
						msg.append("删除成功");
					}
				}
			}
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		prop.put("msg", msg.toString());
		prop.put("flag", boo);
		return prop;
	}
	
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties delSh35(Collection<Tbsh35> sh35s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh35 sh35 : sh35s) {
				String settleNo = sh35.getSettleNo();
				List sh35aList = shjc35aDao.queryBySettleNo(settleNo);
				String status = sh35.getStatus();
				if("12".equals(status)){
					throw new Exception("已结算确认，不能删除");
				}
				if(CollectionUtils.isNotEmpty(sh35aList)){
					throw new Exception("请先删除项次");
				}
				boo=shjc35Dao.delete(sh35);
				if(boo == false){
					msg.append("无删除数据");
					break;
				}else{
					msg.append("删除成功");
				}
			}
			 
			prop.put("msg", msg.toString());
			prop.put("flag", boo);
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	
	  
	/*
	* saveSh34  提交结算审核
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-35 下午2:03:21 
	* 修改时间：2016-12-35 下午2:03:21 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	 
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh34(Collection<Tbsh35> sh35s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh35 sh35 : sh35s) {
			//取得结算审核状态
			String sendMemo="";
			String settleNo = sh35.getSettleNo();
			String custName = sh35.getCustName();
			String checkStatus = sh35.getCheckStatus();
			if(checkStatus.equals("1")){
				sendMemo="重量审核";
			}
			if(checkStatus.equals("2")){
				sendMemo="金额审核";
			}
			Tbsh34 sh34 = new Tbsh34();
			sh34.setCompId(AppUtils.getCompId());
			sh34.setSh34Id(AppUtils.generateUniqueKey());
			sh34.setSendMemo(custName+settleNo+sendMemo);
			sh34.setCreateDate(new Date());
			sh34.setCreateEmp(AppUtils.getUserName());
			shjc34Dao.save(sh34);
		}
		prop.put("msg", msg.toString());
		prop.put("flag", boo);
		return prop;
	}
	*/ 
	  
	/**  
	* executeConfirm 结算确认
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-35 下午2:02:55 
	* 修改时间：2016-12-35 下午2:02:55 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh35> sh35s){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh35 sh35 : sh35s){
				String transNo = sh35.getTransNo();
				String compId = sh35.getCompId();
				String status = sh35.getStatus();
				//TODO 判断子档的状态
				List<Tbsh35a> sh35aList = shjc35aDao.querySh35a(transNo);
				if(sh35aList.size()==0){
					prop.put("msg", "无结算项次");
					prop.put("flag", false);
					break;
				}
				//确认判断
				if("1".equals(status)){
					//1  判断重量、金额。付款金额不能大于收款金额,重量也一样
					BigDecimal apWgt = sh35.getSettleWgtTotal();
					BigDecimal apMoney = sh35.getSettleAmtTotal();
					BigDecimal arWgt = BigDecimal.ZERO;
					BigDecimal arMoney = BigDecimal.ZERO;
					Map inMap = new HashMap();
					inMap.put("compId", compId);
					inMap.put("transNo", transNo);
					//查询该运单下的收款发票号
					List sh32List = shjc32Dao.querySh32ByTransNo(inMap);
					if(CollectionUtils.isNotEmpty(sh32List)){
						Tbsh32 sh32 = (Tbsh32) sh32List.get(0);
						arWgt = sh32.getSettleWgtTotal();
						arMoney = sh32.getSettleAmtTotal();
					}
					//判断大小，如果大于，则修改状态为待审核，并且要求做提交审核
					if(apWgt.compareTo(arWgt)<0){
						sh35.setStatus("1");//待审核
						sh35.setCheckStatus("1");
						prop.put("msg", "付款重量大于收款重量，请提交上级审核");
						prop.put("flag", false);
					}
					if(apMoney.compareTo(arMoney)<0){
						sh35.setStatus("1");//待审核
						sh35.setCheckStatus("2");
						prop.put("msg", "付款金额大于收款金额，请提交上级审核");
						prop.put("flag", false);
					}
					if(apWgt.compareTo(arWgt)>=0&&apMoney.compareTo(arMoney)>=0){
						sh35.setYearMonth(DateUtil.getMonth(0, ""));
						sh35.setStatus("11");//结算确认
						prop.put("msg", "结算确认成功");
						prop.put("flag", true);
					}
					//如果没问题，则修改
					sh35.setUpdateDate(new Date());
					sh35.setUpdateEmp(AppUtils.getUserName());
					shjc35Dao.update(sh35);
					//取消确认判断
				}else if("0".equals(status)){
					sh35.setStatus("0");//取消确认成功
					shjc35Dao.update(sh35);
					prop.put("msg", "取消确认成功");
					prop.put("flag", flag);
				}
			}
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	} 
	
	/**  
	* queryWdsh01 承运商下拉 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-4 下午2:31:35 
	* 修改时间：2016-11-4 下午2:31:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void queryWdsh01(Page<Tbwd01> page, String paramater)
			throws Exception {
		shjc35Dao.queryWdsh01(page, paramater);
	}
	
	@DataProvider
	public void queryLine(Page<Tbsh01b> page,  String paramater)
			throws Exception {
		shjc35Dao.querySh01b(page, paramater);
	}
	
	@DataProvider
	public void queryCont(Page<Tbih21> page,  Map<String, Object> paramater)
			throws Exception {
		shjc35Dao.queryCont(page, paramater);
	}
	
	@DataProvider
	public void queryStation(Page<Tbsh01> page,  String paramater)
			throws Exception {
		shjc35Dao.querySh01(page, paramater);
	}
}

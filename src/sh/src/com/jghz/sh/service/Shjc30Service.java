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
import com.jghz.sh.dao.Shjc30Dao;
import com.jghz.sh.dao.Shjc30aDao;
import com.jghz.sh.dao.Shjc32Dao;
import com.jghz.sh.dao.Shjc34Dao;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh30;
import com.jghz.sh.entity.Tbsh30a;
import com.jghz.sh.entity.Tbsh32;
import com.jghz.sh.entity.Tbsh34;
import com.jghz.sh.entity.Tbwd01;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc30Service  
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
public class Shjc30Service {
	
	@Resource
	private Shjc30Dao shjc30Dao;
	
	@Resource
	private Shjc32Dao shjc32Dao;
	
	@Resource
	private Shjc30aDao shjc30aDao;
	
	@Resource
	private Shjc10aDao shjc10aDao;
	
	@Resource
	private Shjc34Dao shjc34Dao;

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
	public void loadSh30(Page<Tbsh30> page, Map<String, Object> paramater)
			throws Exception {
		shjc30Dao.pagingQuery(page, paramater);
	}
	
	@DataProvider
	public void querySh34(Page<Tbsh34> page, Map<String, Object> paramater){
		try {
			shjc34Dao.pagingQuery(page,paramater);
		} catch (Exception e) {
			// TODO: handle exception
		}
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
	public Properties saveSh30(Collection<Tbsh30> sh30s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh30 sh30 : sh30s) {
			EntityState state = EntityUtils.getState(sh30);
			if (state.equals(EntityState.NEW)) {
				String settleNo = shjc30Dao.genSettleNo();
				sh30.setStatus("0");
				sh30.setSettleNo(settleNo);
				sh30.setCompId(AppUtils.getCompId());
				sh30.setSh30Id(new VMID().toString());
				sh30.setCreateDate(new Date());
				boo=shjc30Dao.save(sh30);
				if(boo == false){
					msg.append("无新增数据");
					break;
				}else{
					msg.append("新增成功");
				}
			}
			if (state.equals(EntityState.MODIFIED)) {
				sh30.setUpdateDate(new Date());
				boo=shjc30Dao.update(sh30);
				if(boo == false){
					msg.append("无修改数据");
					break;
				}else{
					msg.append("修改成功");
				}
			}
			if (state.equals(EntityState.DELETED)) {
				boo=shjc30Dao.delete(sh30);
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
		return prop;
	}
	
	  
	/*
	* saveSh34  提交结算审核
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-30 下午2:03:21 
	* 修改时间：2016-12-30 下午2:03:21 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	 
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh34(Collection<Tbsh30> sh30s){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		for (Tbsh30 sh30 : sh30s) {
			//取得结算审核状态
			String sendMemo="";
			String settleNo = sh30.getSettleNo();
			String custName = sh30.getCustName();
			String checkStatus = sh30.getCheckStatus();
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
	* 创建时间：2016-12-30 下午2:02:55 
	* 修改时间：2016-12-30 下午2:02:55 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh30> sh30s){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh30 sh30 : sh30s){
				String transNo = sh30.getTransNo();
				String compId = sh30.getCompId();
				String status = sh30.getStatus();
				//TODO 判断子档的状态
				List<Tbsh30a> sh30aList = shjc30aDao.querySh30a(transNo);
				if(sh30aList.size()==0){
					prop.put("msg", "无结算项次");
					prop.put("flag", false);
					break;
				}
				//确认判断
				if("1".equals(status)){
					//1  判断重量、金额。付款金额不能大于收款金额,重量也一样
					BigDecimal apWgt = sh30.getSettleWgtTotal();
					BigDecimal apMoney = sh30.getSettleAmtTotal();
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
						sh30.setStatus("1");//待审核
						sh30.setCheckStatus("1");
						prop.put("msg", "付款重量大于收款重量，请提交上级审核");
						prop.put("flag", false);
					}
					if(apMoney.compareTo(arMoney)<0){
						sh30.setStatus("1");//待审核
						sh30.setCheckStatus("2");
						prop.put("msg", "付款金额大于收款金额，请提交上级审核");
						prop.put("flag", false);
					}
					if(apWgt.compareTo(arWgt)>=0&&apMoney.compareTo(arMoney)>=0){
						sh30.setYearMonth(DateUtil.getMonth(0, ""));
						sh30.setStatus("11");//结算确认
						prop.put("msg", "结算确认成功");
						prop.put("flag", true);
					}
					//如果没问题，则修改
					sh30.setUpdateDate(new Date());
					sh30.setUpdateEmp(AppUtils.getUserName());
					shjc30Dao.update(sh30);
					//取消确认判断
				}else if("0".equals(status)){
					sh30.setStatus("0");//取消确认成功
					shjc30Dao.update(sh30);
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
	
	@DataResolver
	public Properties executeCharge(Collection<Tbsh30> sh30s){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh30 sh30 : sh30s){
				String transNo = sh30.getTransNo();
				String status = sh30.getStatus();
				//TODO 判断子档的状态
				List<Tbsh30a> sh30aList = shjc30aDao.querySh30a(transNo);
				if(sh30aList.size()==0){
					prop.put("msg", "无结算项次");
					prop.put("flag", false);
					break;
				}
				//确认判断
				if("1".equals(status)){
					for(Tbsh30a sh30a :sh30aList){
						String statusa = sh30a.getStatus();
						String phoneNo = sh30a.getPhoneNo();
						if(!"1".equals(statusa)){
							prop.put("msg", phoneNo + "未确认");
							prop.put("flag", false);
							break;
						}
						sh30.setStatus("1");//确认成功
						shjc30Dao.update(sh30);
						prop.put("msg", "确认成功");
						prop.put("flag", flag);
						Tbsh10a sh10a = this.queryTbsh10a(sh30a.getTransItem(), sh30a.getCompId());
						shjc10aDao.save(sh10a);
					}
					//取消确认判断
				}else if("0".equals(status)){
					for(Tbsh30a sh30a :sh30aList){
						String statusa = sh30a.getStatus();
						String phoneNo = sh30a.getPhoneNo();
						if("1".equals(statusa)){
							prop.put("msg", phoneNo + "已确认 ");
							prop.put("flag", false);
							break;
						}
						sh30.setStatus("0");//取消确认成功
						shjc30Dao.update(sh30);
						prop.put("msg", "取消确认成功");
						prop.put("flag", flag);
					}
				}
			}
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	
	  
	/**  
	* queryTbsh10a 设置运单应付标记
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-24 上午9:43:07 
	* 修改时间：2016-11-24 上午9:43:07 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	private Tbsh10a queryTbsh10a(String transItem,String compId){
		Tbsh10a sh10a = new Tbsh10a();
		List list = shjc10aDao.querySh10aByTransItem(transItem, compId);
		if(!CollectionUtils.isEmpty(list)){
			sh10a =(Tbsh10a)list.get(0);
		}
		sh10a.setIsAp("Y");
		return sh10a;
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
		shjc30Dao.queryWdsh01(page, paramater);
	}
	
	@DataProvider
	public void queryLine(Page<Tbsh01b> page,  String paramater)
			throws Exception {
		shjc30Dao.querySh01b(page, paramater);
	}
	
	@DataProvider
	public void queryCont(Page<Tbih21> page,  Map<String, Object> paramater)
			throws Exception {
		shjc30Dao.queryCont(page, paramater);
	}
	
	@DataProvider
	public void queryStation(Page<Tbsh01> page,  String paramater)
			throws Exception {
		shjc30Dao.querySh01(page, paramater);
	}
}

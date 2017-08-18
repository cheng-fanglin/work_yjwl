package com.jghz.sh.service;

import java.math.BigDecimal;
import java.rmi.dgc.VMID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.base.util.DateUtil;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih11;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc10a1Dao;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.dao.Shjc10bDao;
import com.jghz.sh.dao.Shjc30Dao;
import com.jghz.sh.dao.Shjc30aDao;
import com.jghz.sh.dao.Shjc32Dao;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh10a1;
import com.jghz.sh.entity.Tbsh10b;
import com.jghz.sh.entity.Tbsh22a;
import com.jghz.sh.entity.Tbsh30;
import com.jghz.sh.entity.Tbsh30a;
import com.jghz.sh.entity.Tbsh32;
import com.jghz.sh.entity.Tbwd02;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc10aaService  
* 类描述：  
* 创建人：Tom  
* 创建时间：1026-10-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：1026-10-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc10aService {
	
	@Resource
	private Shjc10Dao shjc10Dao;
	@Resource
	private Shjc10aDao shjc10aDao; 
	@Resource
	private Shjc10bDao shjc10bDao;
	@Resource
	private Shjc10a1Dao shjc10a1Dao;
	@Resource
	private Shjc30Dao shjc30Dao;
	@Resource
	private Shjc30aDao shjc30aDao;
	@Resource
	private Shjc32Dao shjc32Dao;
	@Resource
	private Shjc22aService shjc22aService;

	/**  
	* loadSh10 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：1026-10-29 下午2:17:25 
	* 修改时间：1026-10-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	 
	@DataProvider
	public void loadSh10aShip(Page<Tbsh10a> page,  Criteria criteria) throws Exception {
		shjc10aDao.pagingQueryShip(page, criteria);
	}
	@DataProvider
	public void loadSh10a(Page<Tbsh10a> page,  Map<String, Object> paramater) throws Exception {
		shjc10aDao.pagingQuery(page, paramater);
	}

	@DataProvider
	public void querySettle(Page<Tbsh10a> page, Map<String, Object> paramater)
			throws Exception {
		shjc10aDao.querySettle(page, paramater);
	}

	/**  
	* saveSh10
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：1026-10-29 下午2:17:35 
	* 修改时间：1026-10-29 下午2:17:35 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties saveSh10a(Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh10a sh10a : sh10as) {
				EntityState state = EntityUtils.getState(sh10a);
				if (state.equals(EntityState.NEW)) {
					String transItem= shjc10aDao.genTransItem(sh10a.getTransNo());
					sh10a.setStatus("0");
					sh10a.setTransItem(transItem);
					sh10a.setCompId(AppUtils.getCompId());
					sh10a.setSh10aId(new VMID().toString());
					sh10a.setCreateDate(new Date());
					boo=shjc10aDao.save(sh10a);
					if(boo == false){
						msg.append("无新增数据");
						break;
					}else{
						msg.append("新增成功");
					}
				}
				if (state.equals(EntityState.MODIFIED)) {
					sh10a.setUpdateDate(new Date());
					boo=shjc10aDao.update(sh10a);
					if(boo == false){
						msg.append("无修改数据");
						break;
					}else{
						msg.append("修改成功");
					}
				}
				if (state.equals(EntityState.DELETED)) {
					boo=shjc10aDao.delete(sh10a);
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
	
	@Expose
	public Properties saveCarrier(Map<String,Object> parameters) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
		Collection<Tbsh10a> ListSh10a = (Collection<Tbsh10a>) parameters.get("ListSh10a");
		String carrierNo = AppUtils.toValidString(parameters.get("carrierNo"));
		String carrierName = AppUtils.toValidString(parameters.get("carrierName"));
		BigDecimal apPayType = AppUtils.getBigDecimal(parameters.get("apPayType")) ;
		BigDecimal apUnitPrice = AppUtils.getBigDecimal( parameters.get("apUnitPrice"));
		String apPayment = AppUtils.toValidString(parameters.get("apPayment"));
		BigDecimal apPrePayments = AppUtils.getBigDecimal( parameters.get("apPrePayments"));
		try {
			for (Tbsh10a sh10a : ListSh10a) {
				sh10a.setApPayType(apPayType);
				sh10a.setApPrePayments(apPrePayments);
				sh10a.setApPayment(apPayment);
				sh10a.setApUnitPrice(apUnitPrice);
				sh10a.setCarrierNo(carrierNo);
				sh10a.setCarrierName(carrierName);
				shjc10aDao.update(sh10a); 
			}
			prop.put("msg", "设置成功");
			prop.put("flag", true);
		}catch(Exception e){
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		prop.put("flag", flag);
		return prop;
	}
	
	@SuppressWarnings("unchecked")
	@DataResolver
	public Properties delSh10a(Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		boolean boo = true;
		StringBuffer msg = new StringBuffer();
		try {
			for (Tbsh10a sh10a : sh10as) {
				String transItem = sh10a.getTransItem();
				String compId = sh10a.getCompId();
				Map inMap = new HashMap();
				inMap.put("transItem", transItem);
				inMap.put("compId", compId);
				//将sh10b赋空
				List sh10bList = shjc10bDao.queryByTransItem(transItem);
				for(int i=0;i<sh10bList.size();i++){
					Tbsh10b sh10b =(Tbsh10b) sh10bList.get(i);
					sh10b.setTransItem("");
					sh10b.setTransNo("");
					shjc10bDao.update(sh10b);
				}
				//将sh10a1删除
				List sh10a1List = shjc10a1Dao.querySh10a1(inMap);
				for(int i=0;i<sh10a1List.size();i++){
					Tbsh10a1 sh10a1 = (Tbsh10a1)sh10a1List.get(i);
					shjc10a1Dao.delete(sh10a1);
				}
				//将sh10a删除
				shjc10aDao.delete(sh10a);
			}
			prop.put("msg", "删除成功");
			prop.put("flag", true);
		}catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	
	@DataResolver
	public Properties executeConfirm(Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		boolean flag = true;
		try {
			for(Tbsh10a sh10a : sh10as){
				String status = sh10a.getStatus();
				if("0".equals(status)){
					prop.put("msg", "取消成功");
					prop.put("flag", flag);
					shjc10aDao.update(sh10a);
				}else if("1".equals(status)){
					prop.put("msg", "确认成功");
					prop.put("flag", flag);
					shjc10aDao.update(sh10a);
				}
			}
		} catch (Exception e) {
			prop.put("msg", "系统出现异常");
			prop.put("flag", false);
		}
		return prop;
	}
	
	public boolean ifAllBack(String transNo){
		boolean boo = true;
		List list = shjc10aDao.querySh10aByTransNo(transNo, AppUtils.getCompId());
		for(int i =0;i<list.size();i++){
			Tbsh10a sh10a = (Tbsh10a)list.get(i);
			String backTime = sh10a.getBackTime();
			if(StringHelper.isEmpty(backTime)){
				boo = false;
			}
		}
		return boo ;
	}
	
	  
	/**  
	* saveSh10aShip 船运挑选车辆 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-26 下午2:47:57 
	* 修改时间：2016-12-26 下午2:47:57 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties saveSh10aShip(Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		boolean flag = true;
		List<Tbsh22a> sh22aList = new ArrayList();
		try {
			//首先更新shipListNo
			for(Tbsh10a sh10a : sh10as){
				shjc10aDao.update(sh10a);
				//再者，copy数据进SH22，另外做处理
				Tbsh22a sh22a = new Tbsh22a();
				BeanUtils.copyProperties(sh10a, sh22a);
				sh22aList.add(sh22a);
			}
			shjc22aService.saveSh22a(sh22aList,"N");
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		prop.put("msg", "挑选成功");
		prop.put("flag", flag);
		return prop;
	}
	
	  
	/**  
	* saveSettle10a 承运结算挑选逻辑
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-29 下午2:54:16 
	* 修改时间：2016-12-29 下午2:54:16 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties saveSettle10a(Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		try {
			Tbsh30 sh30 = new Tbsh30();
			BigDecimal actMount_sh30 = BigDecimal.ZERO;//结算总金额
			BigDecimal prepay_sh30 = BigDecimal.ZERO;//预付款总金额
			BigDecimal actWgt_sh30 = BigDecimal.ZERO;//结算总重量
			String transNo = "";
			String compId = AppUtils.getCompId();
			String settleNo = shjc30Dao.genSettleNo();
			for(Tbsh10a sh10a : sh10as){
				transNo = sh10a.getTransNo();
				Tbsh10 sh10 = shjc10Dao.queryByTransNo(transNo);
				//TODO 更改sh10的状态为11结算待确认
				sh10a.setStatus("11");//结算待确认 
				shjc10aDao.update(sh10a);
				//TODO copy到sh30a，并新增sh30a
				Tbsh30a sh30a = new Tbsh30a();
				BeanUtils.copyProperties(sh10a, sh30a);
				BeanUtils.copyProperties(sh10a, sh30);
				BeanUtils.copyProperties(sh10, sh30);
				sh30a.setSh30aId(AppUtils.generateUniqueKey());
				//计算每个司机的实际金额
				BigDecimal backWgt =AppUtils.getBigDecimal(sh30a.getWeight()) ;
				BigDecimal arUnitPrice = AppUtils.getBigDecimal(sh30a.getUnitPrice());
				BigDecimal prepay = AppUtils.getBigDecimal(sh30a.getPrePayments());//预付款
				BigDecimal arActMount = backWgt.multiply(arUnitPrice);
				BigDecimal obigation = arActMount.subtract(prepay);
				
				//累加实际司机的实际金额
				actMount_sh30 = actMount_sh30.add(arActMount);
				actWgt_sh30 = actWgt_sh30.add(backWgt);
				prepay_sh30 = prepay_sh30.add(prepay);
				
				sh30a.setObigation(obigation);
				sh30a.setMoney(arActMount);
				sh30a.setStatus("0");//结算待确认
				sh30a.setSettleNo(settleNo);
				sh30a.setSh30Id(AppUtils.generateUniqueKey());
				shjc30aDao.save(sh30a);
				
			}
			Map inMap = new HashMap();
			inMap.put("compId", compId);
			inMap.put("transNo", transNo);
			//查询该运单下的收款发票号
			List sh32List = shjc32Dao.querySh32ByTransNo(inMap);
			if(CollectionUtils.isNotEmpty(sh32List)){
				Tbsh32 sh32 = (Tbsh32) sh32List.get(0);
				sh30.setArPayNo(sh32.getPayNo());
				sh30.setArBillNo(sh32.getBillNo());
			}
			sh30.setSh30Id(AppUtils.generateUniqueKey());
			sh30.setSettleAmtTotal(actMount_sh30.subtract(prepay_sh30));
			sh30.setSettleWgtTotal(actWgt_sh30);
			sh30.setSettleDay(DateUtil.getDateString(new Date(), "yyyyMMdd"));
			sh30.setYearMonth(DateUtil.getMonth(0,""));
			sh30.setSettleNo(settleNo);
			sh30.setStatus("0");//结算待确认
			shjc30Dao.save(sh30);
			prop.put("msg", "挑选成功");
			prop.put("flag", true);
		} catch (Exception e) {
			prop.put("msg", e.getMessage());
			prop.put("flag", false);
		}
		return prop;
	}
	
	public void delSh10a(Tbsh10 sh10) throws Exception{
		Map rtnMap = new HashMap();
		String transNo = sh10.getTransNo();
		String compId = sh10.getCompId();
		List sh10aList = shjc10aDao.querySh10aByTransNo(transNo, compId);
		for(int i =0;i<sh10aList.size();i++){
			Tbsh10a sh10a =(Tbsh10a) sh10aList.get(i);
			String transItem =sh10a.getTransItem();
			Map inMap = new HashMap();
			inMap.put("compId", compId);
			inMap.put("transItem", transItem);
			List sh10a1List = shjc10a1Dao.querySh10a1(inMap); 
			for(int j =0;j<sh10a1List.size();j++){
				Tbsh10a1 sh10a1 = (Tbsh10a1) sh10a1List.get(j);
				shjc10a1Dao.delete(sh10a1);
			}
			shjc10aDao.delete(sh10a);
		}
	}
	
	@DataProvider
	public void queryWdsh02(Page<Tbwd02> page, String paramater)
			throws Exception {
		shjc10aDao.queryWdsh02(page, paramater);
	}
	 
}

package com.jghz.sh.service;

import java.math.BigDecimal;
import java.util.Collection;
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
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.dao.Shjc10Dao;
import com.jghz.sh.dao.Shjc10aDao;
import com.jghz.sh.dao.Shjc10bDao;
import com.jghz.sh.dao.Shjc10dDao;
import com.jghz.sh.dao.Shjc11Dao;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh01b;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh10a1;
import com.jghz.sh.entity.Tbsh10b;
import com.jghz.sh.entity.Tbsh10d;
import com.jghz.sh.entity.Tbwd01;

  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc11Service  
* 类描述：  
* 创建人：Tom  
* 创建时间：1126-11-29 下午2:16:41  
* 修改人：Tom  
* 修改时间：1126-11-29 下午2:16:41  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class Shjc11Service {
	
	@Resource
	private Shjc10aDao shjc10aDao;
	
	@Resource
	private Shjc10Dao shjc10Dao;
	
	@Resource
	private Shjc11Dao shjc11Dao;
	
	@Resource
	private Shjc10bDao shjc10bDao;
	
	@Resource
	private Shjc10dDao shjc10dDao;
	
	@Resource
	private Shjc10aService shjc10aService;

	/**  
	* loadSh11 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：1126-11-29 下午2:17:25 
	* 修改时间：1126-11-29 下午2:17:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void loadSh10a(Page<Tbsh10a> page, Map<String, Object> parameter)
			throws Exception {
		shjc11Dao.pagingSh10a(page, parameter);
	}

	@DataProvider
	public void loadSh10a1(Page<Tbsh10a1> page, Map<String, Object> parameter)
			throws Exception {
		shjc11Dao.pagingSh10a1(page, parameter);
	}
	
	@DataResolver
	public Properties saveSh10a(Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		boolean flag = true;
		Map inMap = new HashMap();
		try {
			for(Tbsh10a sh10a : sh10as){
				BigDecimal apUnitPrice = AppUtils.getBigDecimal(sh10a.getApUnitPrice());
				BigDecimal backWgt = AppUtils.getBigDecimal(sh10a.getBackWgt());
				BigDecimal apMount = apUnitPrice.multiply(backWgt);
				String backStatus = sh10a.getBackStatus();
				sh10a.setApMount(apMount);
				shjc10aDao.update(sh10a);
			}
			prop.put("flag", flag);
			prop.put("msg", "保存成功");
		} catch (Exception e) {
			prop.put("flag", false);
			prop.put("msg", e.getMessage());
		}
		return prop;
	}
	  
	/**  
	* executeSh10aCheck 发货确认
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-14 上午11:44:47 
	* 修改时间：2016-11-14 上午11:44:47 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties executeSh10aCheck(Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		boolean flag = true;
		String msg = "";
		Map inMap = new HashMap();
		for(Tbsh10a sh10a : sh10as){
			String transNo = sh10a.getTransNo();
			String deliverStatus = sh10a.getDeliverStatus();
			if(!"1".equals(deliverStatus)){
				msg = "已确认";
				flag= false;
				break;
			}
			sh10a.setOutDate(DateUtil.getToday("yyMMdd HH:mm:ss"));
			//计算金额
			flag = shjc10aDao.update(sh10a);
			//回写sh10，并生成预付款的结算单
			if(flag){
				inMap.put("transNo", transNo);
				inMap.put("deliverStatus", deliverStatus);
				inMap.put("deliveryWgt", sh10a.getWeight());
				shjc10Dao.saveByWgt(inMap);
				
				//TODO 如果有预付款，则发货确认时生成预付款的结算单
				BigDecimal prePayments=sh10a.getPrePayments();
				if(AppUtils.getBigDecimal(prePayments).compareTo(BigDecimal.ZERO)!=0){
					
				}
			}
		}
		prop.put("flag", flag);
		prop.put("msg", msg);
		return prop;
	}
	
	 
	  
	/**  
	* executeSh10aBack 回单确认
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-17 下午2:34:18 
	* 修改时间：2016-11-17 下午2:34:18 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties executeSh10aBack(Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		boolean flag = true;
		String msg = "";
		Map inMap = new HashMap();
		for(Tbsh10a sh10a : sh10as){
//			Tbsh10 sh10 = shjc10Dao.queryByTransNo(sh10a.getTransNo());
			String backStatus = sh10a.getBackStatus();
			String transNo = sh10a.getTransNo();
			String deliverStatus = sh10a.getDeliverStatus();
			if("0".equals(deliverStatus)){
				flag = false;
				msg="未发货";
				break;
			}else{
				if("1".equals(backStatus)){
					String receiptNo = sh10a.getReceiptNo();
					
					sh10a = calAmt(sh10a);
					sh10a.setBackTime(DateUtil.getToday("yyMMdd HH:mm:ss"));
					flag = shjc10aDao.update(sh10a);
					//回写sh10
					msg="回单确认成功";
				}else{
					sh10a.setBackTime("");
					flag = shjc10aDao.update(sh10a);
					//回写sh10
					msg="回单取消成功";
				}
				if(flag){
					inMap.put("transNo", transNo);
					inMap.put("backStatus", backStatus);
					inMap.put("backWgt", sh10a.getWeight());
					shjc10Dao.saveByWgt(inMap);
					//如果全都回单，则SH10自动待结算
					boolean bo = shjc10aService.ifAllBack(transNo);
					if(bo){
						
					}
				}
			}
		}
		prop.put("flag", flag);
		prop.put("msg", msg);
		return prop;
	}
	
	  
	/**  
	* calAmt 根据计价方式和重量计算金额
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-9 上午11:49:41 
	* 修改时间：2016-12-9 上午11:49:41 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	private Tbsh10a calAmt(Tbsh10a sh10a ){
		String transNo = sh10a.getTransNo();
		BigDecimal weight = sh10a.getWeight();
		BigDecimal num = sh10a.getNumber();
		Tbsh10 sh10 = shjc10Dao.queryByTransNo(transNo);
		String payType=sh10.getPayType();//1 包车价 2 吨 3 包 4 方
		if("1".equals(payType)){
			sh10a.setMoney(sh10.getApUnitPrice());
		}else if ("2".equals(payType)){
			sh10a.setMoney(sh10.getApUnitPrice().multiply(weight));
		}else {
			sh10a.setMoney(sh10.getApUnitPrice().multiply(num));
		}
		return sh10a;
	}
	
	  
	/**  
	* saveLoadingNg 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-11 下午5:52:29 
	* 修改时间：2016-12-11 下午5:52:29 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataResolver
	public Properties saveLoadingNg(Collection<Tbsh10b> sh10bs,Collection<Tbsh10a> sh10as){
		Properties prop = new Properties();
		boolean flag = true;
		for(Tbsh10a sh10a : sh10as){
			
			String transNo = sh10a.getTransNo();
			//先查询运单下的南钢订单
			String sh10dSql = " from Tbsh10d where transNo ='"+transNo+"' ";
			List sh10dList = shjc10dDao.query(sh10dSql);
			for(int i = 0;i<sh10dList.size();i++){
				Tbsh10d sh10d = (Tbsh10d)sh10dList.get(i);
				//判断
				String orderNoNg = sh10d.getOrderNoNj();
				for (Tbsh10b sh10b : sh10bs) {
					
				}
			}
		}
		for(Tbsh10b sh10b : sh10bs){
			shjc10bDao.update(sh10b);
		}
		prop.put("msg", "挑选成功");
		prop.put("flag", flag);
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
		shjc10Dao.queryWdsh01(page, paramater);
	}
	
	@DataProvider
	public void queryStation(Page<Tbsh01> page,  String paramater)
			throws Exception {
		shjc10Dao.querySh01(page, paramater);
	}
	
	@DataProvider
	public void queryLine(Page<Tbsh01b> page,  String paramater)
			throws Exception {
		shjc10Dao.querySh01b(page, paramater);
	}
	
	@DataProvider
	public void queryCont(Page<Tbih21> page,  Map<String, Object> paramater)
			throws Exception {
		shjc10Dao.queryCont(page, paramater);
	}
}

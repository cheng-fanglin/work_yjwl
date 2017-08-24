package com.jghz.sh.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.dao.ShjcCommDao;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh22;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd02;
import com.jghz.dc.entity.Tbdcc1;


/**  
*  
* 项目名称：jghz  
* 类名称：ShjcCommService  
* 类描述：  
* 创建人：Tom  
* 创建时间：2016-11-8 下午2:07:20  
* 修改人：Tom  
* 修改时间：2016-11-8 下午2:07:20  
* 修改备注：  
* @version  
*  
*/
@Transactional
@Component
public class ShjcCommService {
	
	@Resource
	private ShjcCommDao shjcCommDao;

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
		shjcCommDao.queryWdsh01(page, paramater);
	}
	
	  
	/**  
	* queryWdsh02 查询司机
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-21 下午3:16:53 
	* 修改时间：2016-11-21 下午3:16:53 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void queryWdsh02(Page<Tbwd02> page, String paramater)
			throws Exception {
		shjcCommDao.queryWdsh02(page, paramater);
	}
	
	  
	/**  
	* queryStation 查询到站
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-21 下午3:17:00 
	* 修改时间：2016-11-21 下午3:17:00 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void queryStation(Page<Tbsh01> page,  String paramater)
			throws Exception {
		shjcCommDao.querySh01(page, paramater);
	}
	
	  
	/**  
	* queryCont 查询合同
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-21 下午3:17:09 
	* 修改时间：2016-11-21 下午3:17:09 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public void queryCont(Page<Tbih21> page,  Map<String, Object> paramater)
			throws Exception {
		shjcCommDao.queryCont(page, paramater);
	}
	
	@DataProvider
	public void querySh10(Page<Tbsh10> page,  Map<String, Object> paramater)
			throws Exception {
		shjcCommDao.querySh10(page, paramater);
	}
	
	@DataProvider
	public void querySh22(Page<Tbsh22> page,  Map<String, Object> paramater)
			throws Exception {
		shjcCommDao.querySh22(page, paramater);
	}
	
	/**  
	* loadSettleType 查询结算方式
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-21 下午3:17:17 
	* 修改时间：2016-11-21 下午3:17:17 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public Map<String,Object> loadSettleType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSettleType();
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadApPayment() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadApPayment(parameter);
		return parameter;
	}
	  
	/**  
	* loadCarType 查询车型  
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-21 下午3:17:28 
	* 修改时间：2016-11-21 下午3:17:28 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	@DataProvider
	public Map<String,Object> loadCarType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadCarType();
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadProductType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadProductType(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadSh10Status() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh10Status(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadSh10aStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh10aStatus(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadSh13Status() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh13Status(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadSh13aStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh13aStatus(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadSh22Status() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh22Status(parameter);
		return parameter;
	}
	@DataProvider
	public Map<String,Object> loadSh35Status() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh35Status(parameter);
		return parameter;
	}
	@DataProvider
	public Map<String,Object> loadSh30Status() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh30Status(parameter);
		return parameter;
	}
	@DataProvider
	public Map<String,Object> loadSh34Type() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh34Type(parameter);
		return parameter;
	}
	@DataProvider
	public Map<String,Object> loadCheckStatusSh30() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadCheckStatusSh30(parameter);
		return parameter;
	} 
	@DataProvider
	public Map<String,Object> loadTransType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadTransType(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadPayType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadPayType(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadYn() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadYn(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadSh01TransPort() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadSh01TransPort(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadShStatus() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadShStatus(parameter);
		return parameter;
	}
	
	@DataProvider
	public Map<String,Object> loadApSettleType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=shjcCommDao.loadApSettleType(parameter);
		return parameter;
	}
	@DataProvider
	public Map<String, Object> loadUserType() throws Exception{
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter = shjcCommDao.loadUserType(parameter);
		return parameter;
	}
	@DataProvider
	public Map<String, Object> loadStatusSH01() throws Exception{
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter = shjcCommDao.loadStatusSH01(parameter);
		return parameter;
	}
	@DataProvider
	public Map<String, Object> loadTransport() throws Exception{
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter = shjcCommDao.loadTransport(parameter);
		return parameter;
	}
	
}

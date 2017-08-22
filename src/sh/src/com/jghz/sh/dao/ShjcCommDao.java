package com.jghz.sh.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.DateFormatUtils;
import com.base.util.NumberUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.dao.DcjcCommonDao;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh10;
import com.jghz.sh.entity.Tbsh22;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd02;
import com.jghz.dc.entity.Tbdcc1;
  
/**  
*  
* 项目名称：jghz  
* 类名称：ShjcCommDao  
* 类描述：  
* 创建人：Tom  
* 创建时间：2016-11-8 下午2:06:44  
* 修改人：Tom  
* 修改时间：2016-11-8 下午2:06:44  
* 修改备注：  
* @version  
*  
*/
@Repository
@Component
public class ShjcCommDao extends BaseDao {

	@Resource
	private DcjcCommonDao dcjcCommonDao;
	
	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh01> page, Map<String, Object> paramater)
			throws Exception {
		 StringBuffer sqlStr = new StringBuffer();
		 sqlStr.append(" from TbshComm where 1=1 ");
		super.pagingQuery(page, sqlStr.toString(), "select count(*) " + sqlStr.toString());
	}
	
	
	public String genTransNo(){
		String newTransNo = "";
		String sql = "select max(trans_no_) as transNo from tbsh01 where comp_id_='"+AppUtils.getCompId()+"' for update;";
		List shCommList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(shCommList)){
			Map shCommMap = (Map)shCommList.get(0);
			if(shCommMap.get("transNo")==null){
				newTransNo = "T"+(DateFormatUtils.format(new Date(), "yyyyMMdd")+"00001").substring(2);
			}else{
				String tansNoMax = AppUtils.toValidString(shCommMap.get("transNo")).substring(1);
				newTransNo = "T"+AppUtils.toValidString(NumberUtils.toLong(tansNoMax)+1);
			}
		} 
		return newTransNo;
	}


	  
	/**  
	* queryWdsh01 查询供应商
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-4 下午2:32:21 
	* 修改时间：2016-11-4 下午2:32:21 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public void queryWdsh01(Page<Tbwd01> page, String parameter) throws Exception {
		String hql = " from "+Tbwd01.class.getName()+" where 1=1 ";
		if(parameter!=null){
			//String carrierName = AppUtils.toValidString(parameter.get("carrierName"));
			if(StringHelper.isNotEmpty(parameter)){
				hql +=" and carrierName like '%"+parameter+"%' ";
			}
		}
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}
	
	public void queryWdsh02(Page<Tbwd02> page, String parameter) throws Exception {
		String hql = " from "+Tbwd02.class.getName()+" where 1=1 ";
		if(parameter!=null){
			//String carrierName = AppUtils.toValidString(parameter.get("carrierName"));
			if(StringHelper.isNotEmpty(parameter)){
				hql +=" and carrierName like '%"+parameter+"%' ";
			}
		}
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}


	  
	/**  
	* queryCont 查协议号
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-4 下午4:32:01 
	* 修改时间：2016-11-4 下午4:32:01 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public void queryCont(Page<Tbih21> page, Map<String, Object> paramater) throws Exception {
		String hql = " from "+Tbih21.class.getName()+" where 1=1 ";
		this.pagingQuery(page, hql,"select count(*) "+hql);
		
	}
	
	public void querySh10(Page<Tbsh10> page, Map<String, Object> paramater) throws Exception {
		String hql = " from "+Tbsh10.class.getName()+" where 1=1 ";
		this.pagingQuery(page, hql,"select count(*) "+hql);
		
	}
	
	public void querySh22(Page<Tbsh22> page, Map<String, Object> paramater) throws Exception {
		String hql = " from "+Tbsh22.class.getName()+" where 1=1 ";
		this.pagingQuery(page, hql,"select count(*) "+hql);
		
	}
	
	/**  
	* querySh01 查询到站
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-6 下午4:29:36 
	* 修改时间：2016-11-6 下午4:29:36 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public void querySh01(Page<Tbsh01> page,  String paramater) throws Exception {
		// TODO Auto-generated method stub
		String hql = " from "+Tbsh01.class.getName()+" where 1=1 ";
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}


	  
	/**  
	* loadCarType 车型
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-10 下午3:47:33 
	* 修改时间：2016-11-10 下午3:47:33 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadCarType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("SH","CAR_TYPE_");
		return parameter;
	}


	  
	/**  
	* loadSettleType 结算方式
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-17 下午7:12:09 
	* 修改时间：2016-11-17 下午7:12:09 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSettleType() throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter=dcjcCommonDao.queryTbdca1aById("SH","SETTLE_TYPE_");
		return parameter;
	}


	  
	/**  
	* loadProductType 查询产品大类
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-21 下午3:18:05 
	* 修改时间：2016-11-21 下午3:18:05 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String,Object> loadProductType(Map<String, Object> parameter) throws Exception {
		String sql = "select * from Tbdcc1 where 1=1 and comp_id_=? ";
		List<Map<String, Object>> resluts =this.getJdbcTemplate().queryForList(sql,new Object[]{AppUtils.getCompId()});
		for(Map<String, Object> map :resluts){
			parameter.put(AppUtils.toValidString(map.get("TYPE_ID_")), map.get("TYPE_NAME_"));
		}
		return parameter;
	}


	  
	/**  
	* loadSh10Status SH10的状态
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-24 上午10:32:25 
	* 修改时间：2016-11-24 上午10:32:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh10Status(Map<String, Object> parameter) throws Exception {
		parameter=dcjcCommonDao.queryTbdca1aById("SH","STATUS_SH10");
		return parameter;
	}
	
	/**  
	* loadSh10aStatus SH10a的状态
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-24 上午10:32:25 
	* 修改时间：2016-11-24 上午10:32:25 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh10aStatus(Map<String, Object> parameter) throws Exception {
		parameter=dcjcCommonDao.queryTbdca1aById("SH","STATUS_SH10A");
		return parameter;
	}


	  
	/**  
	* loadSh13Status SH13的状态
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-24 上午11:04:07 
	* 修改时间：2016-11-24 上午11:04:07 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh13Status(Map<String, Object> parameter) throws Exception {
		parameter=dcjcCommonDao.queryTbdca1aById("SH","STATUS_SH13");
		return parameter;
	}
	
	/**  
	* loadSh13aStatus SH13a的状态
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-24 上午11:04:07 
	* 修改时间：2016-11-24 上午11:04:07 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh13aStatus(Map<String, Object> parameter) throws Exception {
		parameter=dcjcCommonDao.queryTbdca1aById("SH","STATUS_SH13A");
		return parameter;
	}


	  
	/**  
	* loadTransType 运输方式
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-27 下午3:41:00 
	* 修改时间：2016-11-27 下午3:41:00 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadTransType(Map<String, Object> parameter) throws Exception {
		parameter=dcjcCommonDao.queryTbdca1aById("IH","TRAN_TYPE_");
		return parameter;
	}


	  
	/**  
	* loadPayType 计价方式
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-27 下午4:02:33 
	* 修改时间：2016-11-27 下午4:02:33 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadPayType(Map<String, Object> parameter) throws Exception {
		parameter=dcjcCommonDao.queryTbdca1aById("SH","PAY_TYPE_");
		return parameter;
	}


	  
	/**   
	* loadYn 是否
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-28 上午10:31:38 
	* 修改时间：2016-11-28 上午10:31:38 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadYn(Map<String, Object> parameter) throws Exception {
		parameter=dcjcCommonDao.queryTbdca1aById("SH","YN");
		return parameter;
	}


	  
	/**  
	* loadSh01TransPort(这里用一句话描述这个方法的作用)  
	* TODO(这里描述这个方法适用条件 – 可选)  
	* TODO(这里描述这个方法的执行流程 – 可选)  
	* TODO(这里描述这个方法的使用方法 – 可选)  
	* TODO(这里描述这个方法的注意事项 – 可选)  
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-21 下午3:31:08 
	* 修改时间：2016-12-21 下午3:31:08 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh01TransPort(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","SH01_TRANSPORT_");
		return parameter;
	}
	
	/**
	 * Tbsh33 运输费用报销类别
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	@DataProvider
	public Map<String, Object> loadSh33Type(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","TYPE_");
		return parameter;
	}


	  
	/**  
	* loadSh22Status 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-29 下午1:49:33 
	* 修改时间：2016-12-29 下午1:49:33 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh22Status(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","STATUS_SH22");
		return parameter;
	}


	  
	/**  
	* loadSh34Type 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-30 上午11:49:07 
	* 修改时间：2016-12-30 上午11:49:07 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh34Type(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","TYPE__SH34");
		return parameter;
	}


	  
	/**  
	* loadCheckStatusSh30 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-30 上午11:50:15 
	* 修改时间：2016-12-30 上午11:50:15 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadCheckStatusSh30(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","CHECK_STATUS_");
		return parameter;
	}


	  
	/**  
	* loadSh30Status 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-12-30 上午11:52:55 
	* 修改时间：2016-12-30 上午11:52:55 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh30Status(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","STATUS_SH30");
		return parameter;
	}
	
	public Map<String, Object> loadShStatus(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","SH_STATUS_");
		return parameter;
	}
	
	public Map<String, Object> loadApSettleType(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","AP_SETTLE_TYPE_");
		return parameter;
	}
	public Map<String, Object> loadApPayment(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","AP_PAYMENT_");
		return parameter;
	}


	  
	/**  
	* loadSh35Status 
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2017-1-6 上午10:43:44 
	* 修改时间：2017-1-6 上午10:43:44 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	 * @throws Exception 
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public Map<String, Object> loadSh35Status(Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		parameter=dcjcCommonDao.queryTbdca1aById("SH","STATUS_SH35");
		return parameter;
	}

	/**
	 * 会员类别查询
	 * @param parameter
	 * @return
	 * @throws Exception 
	 */
	public Map<String, Object> loadUserType(Map<String, Object> parameter) throws Exception {
		parameter = dcjcCommonDao.queryTbdca1aById("SH", "USER_TYPE_");
		return parameter;
	}

	/**
	 * 承运商状态查询
	 * @param parameter
	 * @return
	 * @throws Exception 
	 */
	public Map<String, Object> loadStatusSH01(Map<String, Object> parameter) throws Exception {
		parameter = dcjcCommonDao.queryTbdca1aById("SH", "STATUS_SH01");
		return parameter;
	}

	/**
	 * 运输方式查询
	 * @param parameter
	 * @return
	 */
	public Map<String, Object> loadTransport(Map<String, Object> parameter) throws Exception{
		parameter = dcjcCommonDao.queryTbdca1aById("SH", "TRANSPORT_");
		return parameter;
	}
}

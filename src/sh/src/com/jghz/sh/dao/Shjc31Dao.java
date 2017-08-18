package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.sh.entity.Tbsh31;


  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc31Dao  
* 类描述：  
* 创建人：Tom  
* 创建时间：3126-10-29 下午2:20:09  
* 修改人：Tom  
* 修改时间：3126-10-29 下午2:20:09  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc31Dao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh31> page, Map<String, Object> paramater)
			throws Exception {
		String sql = " from Tbsh31 where 1=1 ";
		super.pagingQuery(page, sql.toString(),
				"select count(*) " + sql.toString());
	}
	
	
	  
	/**  
	* queryPrice 运单录入时查询价格定义
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-23 下午12:11:10 
	* 修改时间：2016-11-23 下午12:11:10 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	public List queryPrice(Map inMap){
		String contNo = AppUtils.toValidString(inMap.get("contNo"));
		String startStationCode = AppUtils.toValidString(inMap.get("startStationCode"));
		String endStationCode = AppUtils.toValidString(inMap.get("endStationCode"));
		String startLine = AppUtils.toValidString(inMap.get("startLine"));
		String endLine = AppUtils.toValidString(inMap.get("endLine"));
		String transType= AppUtils.toValidString(inMap.get("transType"));
		String payType= AppUtils.toValidString(inMap.get("payType"));
		String custNo= AppUtils.toValidString(inMap.get("custNo"));
		String productNo= AppUtils.toValidString(inMap.get("productNo"));
		String hql = " from Tbsh31 where 1=1  ";
		if (StringHelper.isNotEmpty(contNo)) {
			hql += " and contNo = '" + contNo + "' ";
		}
		if (StringHelper.isNotEmpty(startStationCode)) {
			hql += " and startStationCode = '" + startStationCode + "' ";
		}
		if (StringHelper.isNotEmpty(endStationCode)) {
			hql += " and endStationCode = '" + endStationCode + "' ";
		}
		if (StringHelper.isNotEmpty(startLine)) {
			hql += " and startLine = '" + startLine + "' ";
		}
		if (StringHelper.isNotEmpty(endLine)) {
			hql += " and endLine = '" + endLine + "' ";
		}
		if (StringHelper.isNotEmpty(transType)) {
			hql += " and transType = '" + transType + "' ";
		}
		if (StringHelper.isNotEmpty(payType)) {
			hql += " and payType = '" + payType + "' ";
		} 
		if (StringHelper.isNotEmpty(custNo)) {
			hql += " and custNo = '" + custNo + "' ";
		} 
		if (StringHelper.isNotEmpty(productNo)) {
			hql += " and productNo = '" + productNo + "' ";
		} 
		List list = this.query(hql);
		return list;
	}
}

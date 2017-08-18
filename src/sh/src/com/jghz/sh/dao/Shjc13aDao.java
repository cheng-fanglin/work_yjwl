package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.NumberUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh13a;
import com.jghz.sh.entity.Tbwd02;
  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc13aDao  
* 类描述：  
* 创建人：Tom  
* 创建时间：1326-13-29 下午2:20:09  
* 修改人：Tom  
* 修改时间：1326-13-29 下午2:20:09  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc13aDao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh13a> page, Map<String, Object> paramater)
			throws Exception {
		 StringBuffer sqlStr = new StringBuffer();
		 sqlStr.append(" from Tbsh13a where 1=1 ");
		 if(paramater!= null){
			 String transNo = AppUtils.toValidString(paramater.get("transNo"));
			 if(StringHelper.isNotEmpty(transNo)){
				 sqlStr.append(" and transNo ='"+transNo+"'");
			 }
		 }
		 sqlStr.append(" order by carrierNo");
		super.pagingQuery(page, sqlStr.toString(), "select count(*) " + sqlStr.toString());
	}
	
	
	public String genTransItem(String transNo){
		String newTransItem = "";
		String sql = "select max(trans_item_) as tranItem from tbsh13a where trans_no_ = '"+transNo+"' for update;";
		List sh13aList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(sh13aList)){
			Map sh13aMap = (Map)sh13aList.get(0);
			if(sh13aMap.get("tranItem")==null){
				newTransItem = transNo+"01";
			}else{
				String tansNoMax = AppUtils.toValidString(sh13aMap.get("tranItem")).substring(1);
				newTransItem = AppUtils.toValidString(sh13aMap.get("tranItem")).substring(0,1)+
						AppUtils.toValidString(NumberUtils.toLong(tansNoMax)+1);
			}
		} 
		return newTransItem;
	}


	  
	/**  
	* queryWdsh02 查询司机
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
	
	public List querySh13a (String transNo){
		String hqla = "from Tbsh13a where transNo='"+transNo+"'  ";
		List sh13aList = this.query(hqla);
		return sh13aList;
	}

}

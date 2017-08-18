package com.jghz.sh.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.NumberUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh30a;
import com.jghz.sh.entity.Tbwd01;
import com.jghz.sh.entity.Tbwd02;
  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc30aDao  
* 类描述：  
* 创建人：Tom  
* 创建时间：3026-30-29 下午2:20:09  
* 修改人：Tom  
* 修改时间：3026-30-29 下午2:20:09  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc30aDao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */
	public void pagingQuery(Page<Tbsh30a> page, Map<String, Object> paramater)
			throws Exception {
		 StringBuffer sqlStr = new StringBuffer();
		 sqlStr.append(" from Tbsh30a where 1=1 ");
		 if(paramater!= null){
			 String transNo = AppUtils.toValidString(paramater.get("transNo"));
			 if(StringHelper.isNotEmpty(transNo)){
				 sqlStr.append(" and transNo ='"+transNo+"'");
			 }
		 }
		List list= this.query(sqlStr.toString());
		if(CollectionUtils.isEmpty(list)){
			sqlStr = new StringBuffer();
			sqlStr.append(" from Tbsh10a where 1=1 ");
			 if(paramater!= null){
				 String transNo = AppUtils.toValidString(paramater.get("transNo"));
				 String productType = AppUtils.toValidString(paramater.get("productType"));
				 String backTimeS = AppUtils.toValidString(paramater.get("backTimeS"));
				 String backTimeE = AppUtils.toValidString(paramater.get("backTimeE"));
				 if(StringHelper.isNotEmpty(transNo)){
					 sqlStr.append(" and transNo ='"+transNo+"'");
				 }
				 if(StringHelper.isNotEmpty(productType)){
					 sqlStr.append(" and productType ='"+productType+"'");
				 }
				 if(StringHelper.isNotEmpty(backTimeS)){
					 sqlStr.append(" and backTimeS ='"+backTimeS+"'");
				 }
				 if(StringHelper.isNotEmpty(backTimeE)){
					 sqlStr.append(" and backTimeE ='"+backTimeE+"'");
				 }
			 }
			 list= this.query(sqlStr.toString());
		}
		page.setEntities(list);
		page.setEntityCount(list.size());
//		super.pagingQuery(page, sqlStr.toString(), "select count(*) " + sqlStr.toString());
	}
	
	
	public String genSettleItem(String settleNo){
		String newSettleItem = "";
		String sql = "select max(settle_item_) as settleItem from tbsh30a where settle_no_ = '"+settleNo+"' for update;";
		List sh30aList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(sh30aList)){
			Map sh30aMap = (Map)sh30aList.get(0);
			if(sh30aMap.get("settleItem")==null){
				newSettleItem = settleNo+"001";
			}else{
				String settleItemMax =AppUtils.toValidString(sh30aMap.get("settleItem"));
				String sno = settleItemMax.substring(settleItemMax.length()-2,settleItemMax.length());
				Long snoMax = NumberUtils.toLong(sno) + 1;
				newSettleItem = settleItemMax.substring(settleItemMax.length()-2)
						+AppUtils.addZero(String.valueOf(snoMax), 3);
			}
		} 
		return newSettleItem;
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
	
	public List querySh30a (String transNo){
		String hqla = "from Tbsh30a where transNo='"+transNo+"'  ";
		List sh30aList = this.query(hqla);
		return sh30aList;
	}


	  
	/**  
	* paging30a 连表查sh30和sh30a
	* 创建人：Tom 
	* 修改人：Tom 
	* 创建时间：2016-11-13 下午8:48:13 
	* 修改时间：2016-11-13 下午8:48:13 
	* @param name  
	* @param @return 设定文件  
	* @return String DOM对象  
	* @Exception 异常对象  
	* @since  CodingExample　Ver(编码范例查看) 1.1  
	*/  
	
	public void paging30a(Page<Tbsh30a> page, Map<String, Object> paramater) {
		String sql = "select a.* ,b.DESPATCH_NAME_,b.DESPATCH_MOBILE_,b.DESPATCH_START_,b.DESPATCH_END_,b.RECEIPT_COMP_NAME_ as DELIVERY_NAME_"+
		",b.RECEIPT_PHONE_,b.RECEIPT_START_,b.RECEIPT_END_ "+
		"from tbsh30a a left join tbsh30 b on a.trans_no_ = b.trans_no_ ";
		List jdbcList = this.getJdbcDao().getListBySQL(sql, null);
		//sql += " where b.status_='1' and a.status_='1'";
		List hibernateList = AppUtils.convertKey(jdbcList);
		this.getJdbcDao().paginationQuery(sql, page);
		page.setEntities(hibernateList);
		page.setEntityCount(hibernateList.size());
		
	}
}

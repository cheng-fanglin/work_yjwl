package com.jghz.sh.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.base.util.NumberUtils;
import com.bstek.bdf2.core.orm.ParseResult;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;
import com.jghz.sh.entity.Tbsh01;
import com.jghz.sh.entity.Tbsh10a;
import com.jghz.sh.entity.Tbsh10d;
import com.jghz.sh.entity.Tbsh30;
import com.jghz.sh.entity.Tbwd02;
  
/**  
*  
* 项目名称：jghz  
* 类名称：Shjc10aDao  
* 类描述：  
* 创建人：Tom  
* 创建时间：1026-10-29 下午2:20:09  
* 修改人：Tom  
* 修改时间：1026-10-29 下午2:20:09  
* 修改备注：  
* @version  
*  
*/
@Repository
public class Shjc10aDao extends BaseDao {

	/**
	 * pagingQuery
	 * 
	 * @param page
	 * @param paramater
	 * @throws Exception
	 */ 
	
	public void pagingQuery(Page<Tbsh10a> page,  Map<String, Object> paramater)throws Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh10a where 1=1 and compId='"+AppUtils.getCompId()+"' ");
		if(paramater!= null ){  
			if(paramater.get("shipListNo")!=null){
				sqlStr.append(" and shipListNo='"+paramater.get("shipListNo")+"' ");
			} 
			if(paramater.get("transNo")!=null){
				sqlStr.append(" and transNo='"+paramater.get("transNo")+"' ");
			} 
		}
		sqlStr.append(" order by carrierNo ");
		super.pagingQuery(page, sqlStr.toString(),
				"select count(*) " + sqlStr.toString());
 	}
	
	public void pagingQueryShip(Page<Tbsh10a> page,  Criteria criteria)throws Exception {
		List sh10aList = new ArrayList();
		String sh10aHql = " from "+Tbsh10a.class.getName()+" r where  (r.shipListNo ='' or r.shipListNo = null) and r.backStatus ='1' ";
		ParseResult result=this.parseCriteria(criteria,true,"r");
		if(result!=null){
			StringBuffer sb=result.getAssemblySql();
			sh10aHql +=  sb.toString() +" and r.compId=:compId ";
		} 
		sh10aList = this.query(sh10aHql);
		page.setEntities(sh10aList);
		page.setEntityCount(sh10aList.size());
 	}
	
	public List querySh10aByTransItem(String transItem,String compId){
		StringBuffer sqlStr = new StringBuffer();
		 sqlStr.append(" from Tbsh10a where 1=1 ");
		 if(StringHelper.isNotEmpty(transItem)){
			 sqlStr.append(" and transItem ='"+transItem+"'");
		 }
		 if(StringHelper.isNotEmpty(compId)){
			 sqlStr.append(" and compId ='"+compId+"'");
		 }
		 sqlStr.append(" order by carrierNo ");
		 return this.query(sqlStr.toString());
	}
	
	public List querySh10aByTransNo(String transNo,String compId){
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(" from Tbsh10a where 1=1 ");
		if(StringHelper.isNotEmpty(transNo)){
			sqlStr.append(" and transNo ='"+transNo+"'");
		}
		if(StringHelper.isNotEmpty(compId)){
			sqlStr.append(" and compId ='"+compId+"'");
		}
		sqlStr.append(" order by carrierNo ");
		return this.query(sqlStr.toString());
	}
	
	public List querySh10aIH(Map inMap){
		StringBuffer sqlStr = new StringBuffer();
		 sqlStr.append(" from Tbsh10a where 1=1 ");
		 if(AppUtils.isNotEmpty(inMap.get("transNo"))){
			 sqlStr.append(" and transNo ='"+inMap.get("transNo")+"'");
		 }
		 if(AppUtils.isNotEmpty(inMap.get("compId"))){
			 sqlStr.append(" and compId ='"+inMap.get("compId")+"'");
		 }
		 if(AppUtils.isNotEmpty(inMap.get("carNo"))){
			 sqlStr.append(" and carNo ='"+inMap.get("carNo")+"'");
		 }
		sqlStr.append(" order by carrierNo ");
		 return this.query(sqlStr.toString());
	}
	
	
	public String genTransItem(String transNo){
		String newTransItem = "";
		String sql = "select max(trans_item_) as tranItem from tbsh10a where trans_no_ = '"+transNo+"' for update;";
		List sh10aList = this.getJdbcTemplate().queryForList(sql);
		if(!CollectionUtils.isEmpty(sh10aList)){
			Map sh10aMap = (Map)sh10aList.get(0);
			if(sh10aMap.get("tranItem")==null){
				newTransItem = transNo+"001";
			}else{
				String tranItemMax = AppUtils.toValidString(sh10aMap.get("tranItem"));
				String serNo = tranItemMax.substring(tranItemMax.length()-3,tranItemMax.length());
				String serNoMax = AppUtils.addZero(AppUtils.toValidString(NumberUtils.toLong(serNo)+1), 3);
				newTransItem = transNo+serNoMax;
			}
		} 
		return newTransItem;
	}
	
	public void querySettle(Page<Tbsh10a> page, Map<String, Object> paramater){
		String hql = " from Tbsh10a where compId='"+AppUtils.getCompId()+"' and status='10' and backStatus='1' ";
		if(paramater!= null ){  
			if(paramater.get("carNo")!=null){
				hql+= " and carNo like '%"+paramater.get("carNo")+"%' ";
			}
			if(paramater.get("carrierName")!=null){
				hql+= " and carrierName like '%"+paramater.get("carrierName")+"%' ";
			}
			if(paramater.get("carrierNo")!=null){
				hql+= " and carrierNo = '"+paramater.get("carrierNo")+"' ";
			}
			if(paramater.get("backTimeS")!=null){
				hql+= " and backTime <= '"+paramater.get("backTimeS")+"' ";
			}
			if(paramater.get("backTimeE")!=null){
				hql+= " and backTime <= '"+paramater.get("backTimeE")+"' ";
			}
		}
		hql += " order by carrierNo ";
		List list = this.query(hql.toString());;
		page.setEntities(list);  
		page.setEntityCount(list.size());
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
	
	public List querySh10a (String transNo){
		String hqla = "from Tbsh10a where transNo='"+transNo+"'  ";
		List sh10aList = this.query(hqla);
		return sh10aList;
	}


	  
	/**  
	* paging10a 连表查sh10和sh10a
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
	
	public void paging10a(Page<Tbsh10a> page, Map<String, Object> paramater) {
		String sql = "select a.* ,b.DESPATCH_NAME_,b.DESPATCH_MOBILE_,b.DESPATCH_START_,b.DESPATCH_END_,b.RECEIPT_COMP_NAME_ as DELIVERY_NAME_"+
		",b.RECEIPT_PHONE_,b.RECEIPT_START_,b.RECEIPT_END_ "+
		"from tbsh10a a left join tbsh10 b on a.trans_no_ = b.trans_no_ ";
		sql += " order by carrier_No_ ";
		List jdbcList = this.getJdbcDao().getListBySQL(sql, null);
		//sql += " where b.status_='1' and a.status_='1'";
		List hibernateList = AppUtils.convertKey(jdbcList);
		this.getJdbcDao().paginationQuery(sql, page);
		page.setEntities(hibernateList);
		page.setEntityCount(hibernateList.size());
		
	}
	
	public static void main(String[] args) {
		String tranItemMax = "16121200001";
		String serNo = tranItemMax.substring(tranItemMax.length()-3,tranItemMax.length());
		String serNoMax = AppUtils.addZero(AppUtils.toValidString(NumberUtils.toLong(serNo)+1), 3);
		String newTransItem = "T16121200001"+serNoMax;
		System.out.println(newTransItem.substring(1,tranItemMax.length()-4));
		
	}
}

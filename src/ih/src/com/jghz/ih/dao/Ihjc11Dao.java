package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih11;
import com.jghz.ih.entity.Tbih11;
import com.jghz.ih.entity.Tbih11;

@Component
public class Ihjc11Dao extends BaseDao{
	public void pagingQuery(Page<Tbih11> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih11.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			if (null != paramater.get("ih11Id") && !"".equals( paramater.get("ih21Id"))) {
 				hql += " and ih11Id = '"+paramater.get("ih11Id")+"' ";
			}
			//入库单号
			if (null != paramater.get("inNo") && !"".equals( paramater.get("inNo"))) {
 				hql += " and inNo like '%"+paramater.get("inNo")+"%' ";
			}
			if (null != paramater.get("labelNo") && !"".equals( paramater.get("labelNo"))) {
 				hql += " and labelNo like '%"+paramater.get("labelNo")+"%' ";
			}
			//入库类型
			if (null != paramater.get("inType") && !"".equals( paramater.get("inType"))) {
 				hql += " and inType= '"+paramater.get("inType")+"' ";
			}
			//货主名称
			if (null != paramater.get("ownnerCompName") && !"".equals( paramater.get("ownnerCompName"))) {
 				hql += " and ownnerCompName like '%"+paramater.get("ownnerCompName")+"%' ";
			}
			//客户名称
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
 				hql += " and custName like '%"+paramater.get("custName")+"%' ";
			}
			//合同号
			if (null != paramater.get("contNo") && !"".equals( paramater.get("contNo"))) {
				hql += " and contNo like '%"+paramater.get("contNo")+"%' ";
			}
			//品种大类
			if (null != paramater.get("prodType") && !"".equals( paramater.get("prodType"))) {
 				hql += " and prodType= '"+paramater.get("prodType")+"' ";
			}
			//品种大类
			if (null != paramater.get("prodTypeName") && !"".equals( paramater.get("prodTypeName"))) {
 				hql += " and prodTypeName like '%"+paramater.get("prodTypeName")+"%' ";
			}
			//货物编号
			if (null != paramater.get("productNo") && !"".equals( paramater.get("productNo"))) {
 				hql += " and productNo= '"+paramater.get("productNo")+"' ";
			}
			//货物名称
			if (null != paramater.get("productName") && !"".equals( paramater.get("productName"))) {
 				hql += " and productName like '%"+paramater.get("productName")+"%' ";
			}
			//入库日期从
			if (null !=paramater.get("inDateS") && !"".equals( paramater.get("inDateS"))) {
 				hql += " and inDate >= '"+paramater.get("inDateS")+"' ";
			}
			//入库日期到
			if (null !=paramater.get("inDateE") && !"".equals( paramater.get("inDateE"))) {
 				hql += " and inDate <= '"+paramater.get("inDateE")+"' ";
			}
			//货物名称
			if (null != paramater.get("inStatus") && !"".equals( paramater.get("inStatus"))) {
 				hql += " and status = '"+paramater.get("inStatus")+"' ";
			}
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	
	public void pagingQuery11a(Page<Tbih11> page, Map<String, Object> paramater)
			throws Exception {
		String sql = "SELECT IN_NO_ as inNo ,CUST_NAME_ as custName ,ORDER_NO_ as orderNo ,ORDER_ITEM_ as orderItem ," +
				"GRADE_NO_ as gradeNo ,STEEL_NO_ as steelNo ,STATUS_ status , " +
				"SUM(WGT_) as wgt from tbih11 " +
				"where 1=1" ;
		if(paramater != null){
			if (null != paramater.get("inNo") && !"".equals( paramater.get("inNo"))) {
				sql += " and in_No_ like '%"+paramater.get("inNo")+"%' ";
			}
			if (null != paramater.get("orderItem") && !"".equals( paramater.get("orderItem"))) {
				sql += " and order_Item_ like '%"+paramater.get("orderItem")+"%' ";
			}
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
				sql += " and cust_Name_ like '%"+paramater.get("custName")+"%' ";
			}
			if (null != paramater.get("inDateS") && !"".equals( paramater.get("inDateS"))) {
				sql += " and in_Date_ >= '"+paramater.get("inDateS")+"' ";
			}
			if (null != paramater.get("inDateE") && !"".equals( paramater.get("inDateE"))) {
				sql += " and in_Date_ <= '"+paramater.get("inDateE")+"' ";
			}
		}
		  sql +=" GROUP BY in_No_,ORDER_ITEM_";
		this.getJdbcDao().paginationQuery(sql, page);
	}
	
	public void pagingQuery11b(Page<Tbih11> page, Map<String, Object> paramater)
			throws Exception {
		String hql = "from "+Tbih11.class.getName()+ " where 1=1 ";
		if(paramater != null){
			if (null != paramater.get("inNo") && !"".equals( paramater.get("inNo"))) {
 				hql += " and inNo like '%"+paramater.get("inNo")+"%' ";
			}
			if (null != paramater.get("orderItem") && !"".equals( paramater.get("orderItem"))) {
 				hql += " and orderItem like '%"+paramater.get("orderItem")+"%' ";
			}
			if (null != paramater.get("lableNo") && !"".equals( paramater.get("lableNo"))) {
 				hql += " and lableNo like '%"+paramater.get("lableNo")+"%' ";
			}
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
 				hql += " and ladingNo like '%"+paramater.get("ladingNo")+"%' ";
			}
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
 				hql += " and custName like '%"+paramater.get("custName")+"%' ";
			}
			if (null != paramater.get("inDateS") && !"".equals( paramater.get("inDateS"))) {
 				hql += " and inDate >= '"+paramater.get("inDateS")+"' ";
			}
			if (null != paramater.get("inDateE") && !"".equals( paramater.get("inDateE"))) {
 				hql += " and inDate <= '"+paramater.get("inDateE")+"' ";
			}
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public Tbih11 getOneTbih11(Map<String, Object> paramater) throws Exception{
		if(paramater==null){
			return null;
		}
		Tbih11 ih11=new Tbih11();
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih11.class.getName()+ " where 1=1 ";
		if(paramater.get("ih11Id")!=null){
			hql += " and ih11Id = :ih11Id ";
			param.put("ih11Id", paramater.get("ih11Id"));
		}
		if(paramater.get("inNo")!=null){
			hql += " and inNo = :inNo ";
			param.put("inNo", paramater.get("inNo"));
		}
		if(paramater.get("labelNo")!=null){
			hql += " and labelNo = :labelNo ";
			param.put("labelNo", paramater.get("labelNo"));
		}
		List<Tbih11> listIh11 = this.query(hql,param);
		if(CollectionUtils.isNotEmpty(listIh11)&&listIh11.get(0)!=null){
			ih11 = listIh11.get(0);
		}else{
			throw new Exception("找不到对应的入库记录");
		}
		
		return ih11;
	}
	
	public List<Tbih11> queryList(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih11.class.getName()+ " where 1=1 ";
		if(paramater.get("ih11Id")!=null){
			hql += " and ih11Id = :ih11Id ";
			param.put("ih11Id", paramater.get("ih11Id"));
		}
		if(paramater.get("orderItem")!=null){
			hql += " and orderItem = :orderItem ";
			param.put("orderItem", paramater.get("orderItem"));
		}
		if(paramater.get("labelNo")!=null){
			hql += " and labelNo = :labelNo ";
			param.put("labelNo", paramater.get("labelNo"));
		}
		if(paramater.get("productNo")!=null){
			hql += " and productNo = :productNo ";
			param.put("productNo", paramater.get("productNo"));
		}
		if(paramater.get("productName")!=null){
			hql += " and productName = :productName ";
			param.put("productName", paramater.get("productName"));
		}
		if(paramater.get("prodType")!=null){
			hql += " and prodType = :prodType ";
			param.put("prodType", paramater.get("prodType"));
		}
		if(paramater.get("prodTypeName")!=null){
			hql += " and prodTypeName = :prodTypeName ";
			param.put("prodTypeName", paramater.get("prodTypeName"));
		}
		List<Tbih11> listIh11 = this.query(hql,param);
		return listIh11;
	}
	
}

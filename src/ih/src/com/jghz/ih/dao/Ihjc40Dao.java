package com.jghz.ih.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih40;

@Component
public class Ihjc40Dao extends BaseDao{
	public void pagingQuery(Page<Tbih40> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih40.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			//合同号
			if (null != paramater.get("settleNo") && !"".equals( paramater.get("settleNo"))) {
 				hql += " and settleNo like '%"+paramater.get("settleNo")+"%' ";
			}
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
 				hql += " and ladingNo like '%"+paramater.get("ladingNo")+"%' ";
			}
			if (null != paramater.get("deliveryNo") && !"".equals( paramater.get("deliveryNo"))) {
 				hql += " and deliveryNo like '%"+paramater.get("deliveryNo")+"%' ";
			}
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
 				hql += " and custName like '%"+paramater.get("custName")+"%' ";
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
			
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	public List<Tbih40> queryList(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih40.class.getName()+ " where 1=1 ";
		if(paramater.get("ih40Id")!=null){
			hql += " and ih40Id = :ih40Id ";
			param.put("ih40Id", paramater.get("ih40Id"));
		}
		if(paramater.get("settleNo")!=null){
			hql += " and settleNo = :settleNo ";
			param.put("settleNo", paramater.get("settleNo"));
		}
		if(paramater.get("outNo")!=null){
			hql += " and outNo = :outNo ";
			param.put("outNo", paramater.get("outNo"));
		}
		if(paramater.get("deliveryNo")!=null){
			hql += " and deliveryNo = :deliveryNo ";
			param.put("deliveryNo", paramater.get("deliveryNo"));
		}
		if(paramater.get("ladingNo")!=null){
			hql += " and ladingNo = :ladingNo ";
			param.put("ladingNo", paramater.get("ladingNo"));
		}
		if(paramater.get("orderItem")!=null){
			hql += " and orderItem = :orderItem ";
			param.put("orderItem", paramater.get("orderItem"));
		}
		if(paramater.get("contNo")!=null){
			hql += " and contNo = :contNo ";
			param.put("contNo", paramater.get("contNo"));
		}
		if(paramater.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", paramater.get("custNo"));
		}
		if(paramater.get("custName")!=null){
			hql += " and custName like :custName ";
			param.put("custName", "%"+paramater.get("custName")+"%");
		}
		
		List<Tbih40> listIh40 = this.query(hql,param);
		return listIh40;
	}
	
	public List<Map<String,Object>> queryIh40Cust(Map<String, Object> paramater){
		List<Map<String,Object>> listIh40Cust  = new ArrayList<Map<String,Object>>();
		
		String hql = "select distinct cust_no_ custNo , cust_name_ custName " +
				" from tbih40 where 1=1 ";
		
		if( paramater!=null&&paramater.get("ladingNo")!=null){
			hql += " and lading_no_ = '"+paramater.get("ladingNo")+"' ";
		}
		if( paramater!=null&&paramater.get("ih40Id")!=null){
			hql += " and ih40_id_ = '"+paramater.get("ih40Id")+"' ";
		}
		if( paramater!=null&&paramater.get("custNo")!=null){
			hql += " and cust_no_ = '"+paramater.get("custNo")+"' ";
		}
		if( paramater!=null&&paramater.get("custName")!=null){
			hql += " and cust_name_ = '%"+paramater.get("custName")+"%' ";
		}
		listIh40Cust = this.getJdbcTemplate().queryForList(hql);
		
		return listIh40Cust;
	}
}

package com.jghz.ih.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih16a;

@Component
public class Ihjc16aDao extends BaseDao{
	public void pagingQuery(Page<Tbih16a> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih16a.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			if (null != paramater.get("ih16Id") && !"".equals( paramater.get("ih16Id"))) {
 				hql += " and ih16Id = '"+paramater.get("ih16Id")+"' ";
			}
			//合同号
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
 				hql += " and ladingNo like '%"+paramater.get("ladingNo")+"%' ";
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
	
	public List<Tbih16a> queryList(Map<String, Object> paramater){
		List<Tbih16a> listIh16a = new ArrayList<Tbih16a>();
		if(paramater==null){
			return listIh16a;
		}
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih16a.class.getName()+ " where 1=1 ";
		if(paramater.get("ih16Id")!=null){
			hql += " and ih16Id = :ih16Id ";
			param.put("ih16Id", paramater.get("ih16Id"));
		}
		if(paramater.get("deliveryNo")!=null){
			hql += " and deliveryNo = :deliveryNo ";
			param.put("deliveryNo", paramater.get("deliveryNo"));
		}
		if(paramater.get("orderItem")!=null){
			hql += " and orderItem = :orderItem ";
			param.put("orderItem", paramater.get("orderItem"));
		}
		if(paramater.get("ladingNo")!=null){
			hql += " and ladingNo = :ladingNo ";
			param.put("ladingNo", paramater.get("ladingNo"));
		}
		if(paramater.get("sfxzztxc")!=null){
			hql += " and sfxzztxc = :sfxzztxc ";
			param.put("sfxzztxc", paramater.get("sfxzztxc"));
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
//		if(paramater.get("prodType")!=null){
//			hql += " and prodType = :prodType ";
//			param.put("prodType", paramater.get("prodType"));
//		}
//		if(paramater.get("prodTypeName")!=null){
//			hql += " and prodTypeName = :prodTypeName ";
//			param.put("prodTypeName", paramater.get("prodTypeName"));
//		}
		listIh16a = this.query(hql,param);
		return listIh16a;
	}
	
	public List<Map<String,Object>> queryListOrderItem(Map<String, Object> paramater){
		String hql = "select sum(bc_Kdl_) as kdl, order_item_ as orderItem, prod_type_ as prodType, prod_type_name_ as prodTypeName, " +
				"product_no_ as productNo, product_name_ as productName ,SFXZZTXC_ as sfxzztxc " +
				" from tbih16a where 1=1 ";
		
		if( paramater!=null&&paramater.get("ladingNo")!=null){
			hql += " and lading_no_ = '"+paramater.get("ladingNo")+"' ";
		}
		if( paramater!=null&&paramater.get("deliveryNo")!=null){
			hql += " and delivery_No_ = '"+paramater.get("deliveryNo")+"' ";
		}
		
		if( paramater!=null&&paramater.get("ih16Id")!=null){
			hql += " and ih16_id_ = '"+paramater.get("ih16Id")+"' ";
		}
		if( paramater!=null&&paramater.get("custNo")!=null){
			hql += " and cust_no_ = '"+paramater.get("custNo")+"' ";
		}
		hql +=" group by order_item_ , prod_type_ , prod_type_name_ , product_no_ , product_name_,SFXZZTXC_";
		
		List<Map<String,Object>> listIh30 = this.getJdbcTemplate().queryForList(hql);
		return listIh30;
	}
	
	public Map<String,Object> queryIh16aSumWgt(Map<String, Object> paramater){
		Map<String,Object> mapOut  = new HashMap<String,Object>();
		
		String hql = "select sum(bc_kdl_) as kdl ,sum(bc_kdl_num_) as kdlNum ,count(1) countNum " +
				" from tbih16a where 1=1 ";
		
		if( paramater!=null&&paramater.get("deliveryNo")!=null){
			hql += " and delivery_No_ = '"+paramater.get("deliveryNo")+"' ";
		}
		if( paramater!=null&&paramater.get("ih16Id")!=null){
			hql += " and ih16_id_ = '"+paramater.get("ih16Id")+"' ";
		}
		if( paramater!=null&&paramater.get("custNo")!=null){
			hql += " and cust_no_ = '"+paramater.get("custNo")+"' ";
		}
		
		List<Map<String,Object>> listIh16a = this.getJdbcTemplate().queryForList(hql);
		if(CollectionUtils.isNotEmpty(listIh16a)&&listIh16a.get(0)!=null){
			mapOut.put("sumWgt", listIh16a.get(0).get("kdl"));
			mapOut.put("sumNum", listIh16a.get(0).get("kdlNum"));
			mapOut.put("countNum", listIh16a.get(0).get("countNum"));
		}
		return mapOut;
	}
}

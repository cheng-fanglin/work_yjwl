package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;
import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih40a;

@Component
public class Ihjc40aDao extends BaseDao{
	public void pagingQuery(Page<Tbih40a> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih40a.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			//合同号
			if (null != paramater.get("ih40Id") && !"".equals( paramater.get("ih40Id"))) {
 				hql += " and ih40Id = '"+paramater.get("ih40Id")+"' ";
			}
			if (null != paramater.get("settleNo") && !"".equals( paramater.get("settleNo"))) {
 				hql += " and settleNo like '%"+paramater.get("settleNo")+"%' ";
			}
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
	
	public List<Tbih40a> queryList(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih40a.class.getName()+ " where 1=1 ";
		if(paramater.get("ih40aId")!=null){
			hql += " and ih40aId = :ih40aId ";
			param.put("ih40aId", paramater.get("ih40aId"));
		}
		if(paramater.get("settleNo")!=null){
			hql += " and settleNo = :settleNo ";
			param.put("settleNo", paramater.get("settleNo"));
		}
		if(paramater.get("outNo")!=null){
			hql += " and outNo = :outNo ";
			param.put("outNo", paramater.get("outNo"));
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
		List<Tbih40a> listIh40a = this.query(hql,param);
		return listIh40a;
	}
	
	public Map<String,Object> queryIh40aSumWgt(Map<String, Object> paramater){
		Map<String,Object> mapOut  = new HashMap<String,Object>();
		
		String hql = "select sum(wgt_) as wgt ,sum(num_) num,count(1) pieceCount ,sum(total_amt_) totalAmt " +
				" from tbih40a where 1=1 ";
		
		if( paramater!=null&&paramater.get("compId")!=null){
			hql += " and comp_id_ = '"+paramater.get("compId")+"' ";
		}
		
		if( paramater!=null&&paramater.get("outNo")!=null){
			hql += " and out_no_ = '"+paramater.get("outNo")+"' ";
			
			if( paramater!=null&&paramater.get("settleNo")!=null){
				hql += " and (settle_no_ is null or settle_no_='' or settle_no_ = '"+paramater.get("settleNo")+"') ";
			}
		}
		
		if( paramater!=null&&paramater.get("custNo")!=null){
			hql += " and cust_no_ = '"+paramater.get("custNo")+"' ";
		}
		
		if( paramater!=null&&paramater.get("ladingNo")!=null){
			hql += " and lading_no_ = '"+paramater.get("ladingNo")+"' ";
		}
		
		List<Map<String,Object>> listIh40a = this.getJdbcTemplate().queryForList(hql);
		if(CollectionUtils.isNotEmpty(listIh40a)&&listIh40a.get(0)!=null){
			mapOut.put("wgt", listIh40a.get(0).get("wgt"));
			mapOut.put("num", listIh40a.get(0).get("num"));
			mapOut.put("pieceCount", AppUtils.getBigDecimal(listIh40a.get(0).get("pieceCount")));
			mapOut.put("totalAmt", listIh40a.get(0).get("totalAmt"));
		}
		return mapOut;
	}
	
}

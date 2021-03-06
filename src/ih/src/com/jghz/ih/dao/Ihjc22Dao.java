package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih22;

@Component
public class Ihjc22Dao extends BaseDao{
	public void pagingQuery(Page<Tbih22> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih22.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			//合同号
			if (null != paramater.get("contNo") && !"".equals( paramater.get("contNo"))) {
 				hql += " and contNo like '%"+paramater.get("contNo")+"%' ";
			}
			if (null != paramater.get("orderNo") && !"".equals( paramater.get("orderNo"))) {
 				hql += " and orderNo like '%"+paramater.get("orderNo")+"%' ";
			}
			if (null != paramater.get("ngContNo") && !"".equals( paramater.get("ngContNo"))) {
 				hql += " and ngContNo like '%"+paramater.get("ngContNo")+"%' ";
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
			//对方当事人编号
			if (null !=paramater.get("cuctNo") && !"".equals( paramater.get("cuctNo"))) {
 				hql += " and cuctNo= '"+paramater.get("cuctNo")+"' ";
			}
			//对方当事人
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
 				hql += " and custName like '%"+paramater.get("custName")+"%' ";
			}
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	public List<Tbih22> queryList22(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih22.class.getName()+ " where 1=1 ";
		if(paramater.get("compId")!=null){
			hql += " and compId = :compId ";
			param.put("compId", paramater.get("compId"));
		}
		if(paramater.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", paramater.get("custNo"));
		}
		if(paramater.get("custName")!=null){
			hql += " and custName like :custName ";
			param.put("custName", "%"+paramater.get("custName")+"%");
		}
		hql += " and (contNo is null or contNo  = '' )";
		List<Tbih22> listIh22 = this.query(hql,param);
		return listIh22;
	}
}

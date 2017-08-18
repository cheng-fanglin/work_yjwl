package com.jghz.ih.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21c;

@Component
public class Ihjc21cDao extends BaseDao{
	public void pagingQuery(Page<Tbih21c> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih21c.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			//合同号
			if (null != paramater.get("contNo") && !"".equals( paramater.get("contNo"))) {
 				hql += " and contNo like '%"+paramater.get("contNo")+"%' ";
			}
			//合同部门
			if (null != paramater.get("basecodeBm") && !"".equals( paramater.get("basecodeBm"))) {
 				hql += " and basecodeBm= '"+paramater.get("basecodeBm")+"' ";
			}
			//合同性质
			if (null != paramater.get("basecodeXz") && !"".equals( paramater.get("basecodeXz"))) {
 				hql += " and basecodeXz= '"+paramater.get("basecodeXz")+"' ";
			}
			//年度
			if (null != paramater.get("year") && !"".equals( paramater.get("year"))) {
 				hql += " and year= '"+paramater.get("year")+"' ";
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
			if (null != paramater.get("cuctName") && !"".equals( paramater.get("cuctName"))) {
 				hql += " and cuctName like '%"+paramater.get("cuctName")+"%' ";
			}
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
}

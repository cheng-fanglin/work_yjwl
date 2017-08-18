package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21;

@Component
public class Ihjc21Dao extends BaseDao{
	public void pagingQuery(Page<Tbih21> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih21.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			if (null != paramater.get("ih21Id") && !"".equals( paramater.get("ih21Id"))) {
 				hql += " and ih21Id = '"+paramater.get("ih21Id")+"' ";
			}
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
			if (null !=paramater.get("custNo") && !"".equals( paramater.get("custNo"))) {
 				hql += " and custNo= '"+paramater.get("custNo")+"' ";
			}
			//对方当事人
			if (null != paramater.get("custName") && !"".equals( paramater.get("custName"))) {
 				hql += " and custName like '%"+paramater.get("custName")+"%' ";
			}
		}
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	public List<Tbih21> queryList(Map<String, Object> paramater) throws Exception{
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih21.class.getName()+ " where 1=1 ";
		if(paramater!=null&&paramater.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", paramater.get("custNo"));
		}
		if(paramater!=null&&paramater.get("custName")!=null){
			hql +=" and custName like :custName ";
			param.put("custName", "%"+paramater.get("custName")+"%");
		}
		if(paramater!=null&&paramater.get("contNo")!=null){
			hql +=" and contNo= :contNo ";
			param.put("contNo", paramater.get("contNo"));
		}
		List<Tbih21> listIh21 = this.query(hql,param);
		return listIh21;
	}
}

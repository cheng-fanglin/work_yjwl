package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21b;

@Component
public class Ihjc21bDao extends BaseDao{
	public void pagingQuery(Page<Tbih21b> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih21b.class.getName()+ " where 1=1 ";
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
	
	public List<Tbih21b> queryList(Map<String, Object> paramater) throws Exception{
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih21b.class.getName()+ " where 1=1 ";
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
		if(paramater!=null&&paramater.get("sno")!=null){
			hql +=" and sno= :sno ";
			param.put("sno", paramater.get("sno"));
		}else{
			if(paramater!=null&&paramater.get("tranType")!=null){
				hql +=" and tranType= :tranType ";
				param.put("tranType",paramater.get("tranType"));
			}
			if(paramater!=null&&paramater.get("kb")!=null){
				hql +=" and kb= :kb ";
				param.put("kb", paramater.get("kb"));
			}
			if(paramater!=null&&paramater.get("settleType")!=null){
				hql +=" and settleType= :settleType ";
				param.put("settleType", paramater.get("settleType"));
			}
			if(paramater!=null&&paramater.get("prodType")!=null){
				hql +=" and prodType= :prodType ";
				param.put("prodType", paramater.get("prodType"));
			}
			if(paramater!=null&&paramater.get("prodTypeName")!=null){
				hql +=" and prodTypeName= :prodTypeName ";
				param.put("prodTypeName", paramater.get("prodTypeName"));
			}
			if(paramater!=null&&paramater.get("productNo")!=null){
				hql +=" and productNo= :productNo ";
				param.put("productNo", paramater.get("productNo"));
			}
			if(paramater!=null&&paramater.get("productName")!=null){
				hql +=" and productName= :productName ";
				param.put("productName", paramater.get("productName"));
			}
		}
		
		
		List<Tbih21b> listIh21b = this.query(hql,param);
		return listIh21b;
	}
}

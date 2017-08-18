package com.jghz.ih.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih16;

@Component
public class Ihjc16Dao extends BaseDao{
	public void pagingQuery(Page<Tbih16> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih16.class.getName()+ " where 1=1 ";
		//方式一:自定义Dao实现
		if (paramater != null) {	
			if (null != paramater.get("ih16Id") && !"".equals( paramater.get("ih16Id"))) {
 				hql += " and ih16Id = '"+paramater.get("ih16Id")+"' ";
			}
			//合同号
			if (null != paramater.get("contNo") && !"".equals( paramater.get("contNo"))) {
 				hql += " and contNo like '%"+paramater.get("contNo")+"%' ";
			}
			if (null != paramater.get("deliveryNo") && !"".equals( paramater.get("deliveryNo"))) {
 				hql += " and deliveryNo like '%"+paramater.get("deliveryNo")+"%' ";
			}
			if (null != paramater.get("ladingNo") && !"".equals( paramater.get("ladingNo"))) {
 				hql += " and ladingNo like '%"+paramater.get("ladingNo")+"%' ";
			}
			if (null != paramater.get("ladingDate") && !"".equals( paramater.get("ladingDate"))) {
 				hql += " and ladingDate like '%"+paramater.get("ladingDate")+"%' ";
			}
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
			//对方当事人编号
			if (null !=paramater.get("cuctNo") && !"".equals( paramater.get("cuctNo"))) {
 				hql += " and cuctNo= '"+paramater.get("cuctNo")+"' ";
			}
			//对方当事人
			if (null != paramater.get("cuctName") && !"".equals( paramater.get("cuctName"))) {
 				hql += " and cuctName like '%"+paramater.get("cuctName")+"%' ";
			}
		}
		this.pagingQuery(page, hql+" order by deliveryNo desc ", "select count(*) " + hql);
		
	}
	
	public List<Tbih16> queryList(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		List<Tbih16> listIh16 = new ArrayList<Tbih16>();
		String hql = " from "+Tbih16.class.getName()+ " where 1=1 ";
		if(paramater == null){
			return listIh16;
		}
		if(paramater.get("ih16Id")!=null){
			hql += " and ih16Id = :ih16Id ";
			param.put("ih16Id", paramater.get("ih16Id"));
		}
		if(paramater.get("compId")!=null){
			hql += " and compId = :compId ";
			param.put("compId", paramater.get("compId"));
		}
		if(paramater.get("deliveryNo")!=null){
			hql += " and deliveryNo = :deliveryNo ";
			param.put("deliveryNo", paramater.get("deliveryNo"));
		}
		listIh16 = this.query(hql,param);
		return listIh16;
	}
}

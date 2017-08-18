package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih02b;

@Component
public class Ihjc02bDao extends BaseDao{
	public void pagingQuery(Page<Tbih02b> page, Map<String, Object> paramater)
			throws Exception {
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih02b.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if (paramater != null) {	
				//主表ID
				if (null != paramater.get("ih02Id") && !"".equals( paramater.get("ih02Id"))) {
	 				hql += " and ih02Id= '"+paramater.get("ih02Id")+"' ";
				}
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
				if(paramater.get("dsNo")!=null){
					hql += " and dsNo = :dsNo ";
					param.put("dsNo", paramater.get("dsNo"));
				}
				if(paramater.get("dsName")!=null){
					hql += " and dsName like :dsName ";
					param.put("dsName", "%"+paramater.get("dsName")+"%");
				}
				if(paramater.get("taxNo")!=null){
					hql += " and taxNo like :taxNo ";
					param.put("taxNo", "%"+paramater.get("taxNo")+"%");
				}
			}
		} 
		this.pagingQuery(page, hql, "select count(*) " + hql,param);
		
	}
}

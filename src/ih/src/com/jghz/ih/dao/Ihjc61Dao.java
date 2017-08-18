package com.jghz.ih.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih61;

@Component
public class Ihjc61Dao extends BaseDao {
	
	public void pagingQuery(Page<Tbih61> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih61.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("custName")!=null){
				hql += " and custName like '%" +paramater.get("custName")+"%'";
			}
			if(paramater.get("inventoryDate")!=null){
				hql += " and inventoryDate = '" +paramater.get("inventoryDate")+"'";
			} 
			if(paramater.get("labelNo")!=null){
				hql += " and labelNo like '%" +paramater.get("labelNo")+"%'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
}
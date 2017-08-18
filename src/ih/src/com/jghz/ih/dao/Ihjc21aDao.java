package com.jghz.ih.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih21a;

@Component
public class Ihjc21aDao extends BaseDao{
	public void pagingQuery(Page<Tbih21a> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih21a.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if (paramater != null) {	
				//主表ID
				if (null != paramater.get("ih21Id") && !"".equals( paramater.get("ih21Id"))) {
	 				hql += " and ih21Id= '"+paramater.get("ih21Id")+"' ";
				}
			}
		}else{
			return;
		} 
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
}

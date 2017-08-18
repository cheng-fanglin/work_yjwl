package com.jghz.pt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.pt.entity.Tbpt01;

@Component
public class Ptjc01Dao extends BaseDao{
	public void pagingQuery(Page<Tbpt01> page, Map<String, Object> paramater)
			throws Exception {
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbpt01.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if (paramater != null) {	
				if(paramater.get("compId")!=null){
					hql += " and compId = :compId ";
					param.put("compId", paramater.get("compId"));
				}
				if(paramater.get("titleName")!=null){
					hql += " and titleName = :titleName ";
					param.put("titleName", paramater.get("titleName"));
				}
				if(paramater.get("auditor")!=null){
					hql += " and auditor = :auditor ";
					param.put("auditor", paramater.get("auditor"));
				}
				if(paramater.get("releaseTimeF")!=null){
					hql += " and releaseTime >= :releaseTimeF ";
					param.put("releaseTimeF", paramater.get("releaseTimeF"));
				}
				if(paramater.get("releaseTimeT")!=null){
					hql += " and releaseTime <= :releaseTimeT ";
					param.put("releaseTimeT", paramater.get("releaseTimeT"));
				}
			}
		} 
		this.pagingQuery(page, hql, "select count(*) " + hql,param);
		
	}
	
	public void pagingQueryByPublish(Page<Tbpt01> page, Map<String, Object> paramater)
			throws Exception {
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbpt01.class.getName()+ " where state='1' ";

		this.pagingQuery(page, hql, "select count(*) " + hql,param);
		
	}
}

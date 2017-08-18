package com.jghz.ih.dao;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih02;

@Component
public class Ihjc02Dao extends BaseDao{
	public void pagingQuery(Page<Tbih02> page, Map<String, Object> paramater)
			throws Exception {
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih02.class.getName()+ " where 1=1 ";
		if (paramater != null) {
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
		} 
		this.pagingQuery(page, hql, "select count(*) " + hql,param);
		
	}
	
	public List<Tbih02> queryList02(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih02.class.getName()+ " where 1=1 ";
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
		List<Tbih02> listIh02 = this.query(hql,param);
		return listIh02;
	}
}

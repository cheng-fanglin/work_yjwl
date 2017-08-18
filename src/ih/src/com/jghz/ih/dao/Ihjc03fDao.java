package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih03e;
import com.jghz.ih.entity.Tbih03f;

@Component
public class Ihjc03fDao extends BaseDao{
	public void pagingQuery(Page<Tbih03f> page, Map<String, Object> parameter)
			throws Exception {
		if (parameter == null) {
			return;
		}
		String hql = " from "+Tbih03f.class.getName()+ " where 1=1 ";
		
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	public List<Tbih03f> queryList(Map<String, Object> parameter) throws Exception{
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih03f.class.getName()+ " where 1=1 ";
		if(parameter!=null&&parameter.get("time")!=null){
			hql += " and startTime <= :time ";
			param.put("time", parameter.get("time"));
			
			hql += " and endTime >= :time ";
			param.put("time", parameter.get("time"));
		}
		if(parameter!=null&&parameter.get("date")!=null){
			hql +=" and startDate <= :date ";
			param.put("date", parameter.get("date"));
		}
		if(parameter!=null&&parameter.get("date")!=null){
			hql +=" and ( endDate >= :date or endDate is null or endDate = '' ) ";
			param.put("date", parameter.get("date"));
		}
		if(parameter!=null&&parameter.get("state")!=null){
			hql += " and state = :state ";
			param.put("state", parameter.get("state"));
		}
		hql +=" order by endDate desc";
		
		List<Tbih03f> listIh03f = this.query(hql,param);
		return listIh03f;
	}
	
	public List<Tbih03f> queryIh03fBasic(Map<String, Object> parameter) throws Exception{
		String hql = " from "+Tbih03f.class.getName()+ " where 1=1 ";
		if(parameter!=null&&parameter.get("compId")!=null){
			hql += " and compId = '"+parameter.get("compId")+"' ";
		}
		if(parameter!=null&&parameter.get("status")!=null){
			hql += " and status = '"+parameter.get("status")+"' ";
		}
		List<Tbih03f> listIh03f = this.query(hql);
		return listIh03f;
	}
	
}

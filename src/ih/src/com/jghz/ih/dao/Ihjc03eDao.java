package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih03e;

@Component
public class Ihjc03eDao extends BaseDao{
	public void pagingQuery(Page<Tbih03e> page, Map<String, Object> parameter)
			throws Exception {
		if (parameter == null) {
			return;
		}
		String hql = " from "+Tbih03e.class.getName()+ " where 1=1 ";
		
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	public List<Tbih03e> queryList(Map<String, Object> parameter) throws Exception{
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih03e.class.getName()+ " where 1=1 ";
		if(parameter!=null&&parameter.get("date")!=null){
			hql += " and date = :date ";
			param.put("date", parameter.get("date"));
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
		List<Tbih03e> listIh03e = this.query(hql,param);
		return listIh03e;
	}
	
	public List<Tbih03e> queryIh03eBasic(Map<String, Object> parameter) throws Exception{
		String hql = " from "+Tbih03e.class.getName()+ " where 1=1 ";
		if(parameter!=null&&parameter.get("compId")!=null){
			hql += " and compId = '"+parameter.get("compId")+"' ";
		}
		if(parameter!=null&&parameter.get("status")!=null){
			hql += " and status = '"+parameter.get("status")+"' ";
		}
		List<Tbih03e> listIh03e = this.query(hql);
		return listIh03e;
	}
	
}

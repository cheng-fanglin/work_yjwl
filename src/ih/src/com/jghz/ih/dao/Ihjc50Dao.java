package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih02a;
import com.jghz.ih.entity.Tbih50;

@Component
public class Ihjc50Dao extends BaseDao {

	public void pagingQuery50 (Page<Tbih50> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih50.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
			if(paramater.get("fkdwmc")!=null){
				hql += " and custName like '%" +paramater.get("fkdwmc")+"%'";
			} 
			if(paramater.get("jcrqc")!=null){
				hql += " and jcrq > = " +paramater.get("jcrqc")+" ";
			}
			if(paramater.get("jcrqd")!=null){
				hql += " and jcrqd < = " +paramater.get("jcrqd")+" ";
			}
			if(paramater.get("jktype")!=null){
				hql += " and jktype  = " +paramater.get("jktype")+" ";
			}
		}	
		
		this.pagingQuery(page, hql + " order by jkrq desc", "select count(*) " + hql);
	}
	
	public void pagingQuery02(Page<Tbih02> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih02.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
			if(paramater.get("fkdwmc")!=null){
				hql += " and custName like '%" +paramater.get("fkdwmc")+"%'";
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public void pagingQuery02a(Page<Tbih02> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih02a.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
			if(paramater.get("fkdwmc")!=null){
				hql += " and custName like '%" +paramater.get("fkdwmc")+"%'";
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
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
	
		List<Tbih02> listIh02 = this.query(hql,param);
		return listIh02;
	}
	
	public List<Tbih50> queryListIh50(Map<String, Object> paramater){
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih50.class.getName()+ " where 1=1 ";
		if(paramater.get("compId")!=null){
			hql += " and compId = :compId ";
			param.put("compId", paramater.get("compId"));
		}
		if(paramater.get("ih50Id")!=null){
			hql += " and ih50Id = :ih50Id ";
			param.put("ih50Id", paramater.get("ih50Id"));
		}
		if(paramater.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", paramater.get("custNo"));
		}
	
		List<Tbih50> listIh50 = this.query(hql,param);
		return listIh50;
	}
	
	public List<Map<String,Object>> queryList50(Map<String, Object> paramater){
		String hql = "select * from Tbih50 where 1=1 ";
		if(paramater.get("compId")!=null){
			hql += " and comp_Id_ = '"+paramater.get("compId")+"'";
		}
		if(paramater.get("ih50Id")!=null){
			hql += " and ih50_Id_ = '"+paramater.get("tbih50Id")+"' ";
		}
	
		List<Map<String,Object>> listIh50 = this.getJdbcTemplate().queryForList(hql);
		return listIh50;
	}
}

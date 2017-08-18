package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih02a;
import com.jghz.ih.entity.Tbih43;

@Component
public class Ihjc43Dao extends BaseDao {

	public void pagingQuery43 (Page<Tbih43> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih43.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("billNo")!=null){
				hql += " and billNo like '%" +paramater.get("billNo")+"%'";
			}
			if(paramater.get("billCompNo")!=null){
				hql += " and billCompNo like '%" +paramater.get("billCompNo")+"%'";
			}
			if(paramater.get("billCompName")!=null){
				hql += " and billCompName like '%" +paramater.get("billCompName")+"%'";
			} 
			if(paramater.get("billDateS")!=null){
				hql += " and billDate > = " +paramater.get("billDateS")+" ";
			}
			if(paramater.get("billDateE")!=null){
				hql += " and billDate < = " +paramater.get("billDateE")+" ";
			}
			if(paramater.get("getCompNo")!=null){
				hql += " and getCompNo like '%" +paramater.get("getCompNo")+"%'";
			}
			if(paramater.get("getCompName")!=null){
				hql += " and getCompName like '%" +paramater.get("getCompName")+"%'";
			} 
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
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
	
	public List<Map<String,Object>> queryList43(Map<String, Object> paramater){
		String hql = "select * from Tbih43 where 1=1 ";
		if(paramater.get("compId")!=null){
			hql += " and comp_Id_ = '"+paramater.get("compId")+"'";
		}
		if(paramater.get("tbih43Id")!=null){
			hql += " and tbih43_Id_ = '"+paramater.get("tbih43Id")+"' ";
		}
	
		List<Map<String,Object>> listIh43 = this.getJdbcTemplate().queryForList(hql);
		return listIh43;
	}
}

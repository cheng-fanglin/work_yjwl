package com.jghz.ih.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih03;
import com.jghz.ih.entity.Tbih03a;
import com.jghz.ih.entity.Tbih03b;
import com.jghz.ih.entity.Tbih03c;
import com.jghz.ih.entity.Tbih03d;
import com.jghz.ih.entity.Tbih03e;
import com.jghz.ih.entity.Tbih03f;

@Component
public class Ihjc03Dao extends BaseDao {

	public void pagingQuery03 (Page<Tbih03> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih03.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	public void pagingQuery03a (Page<Tbih03a> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih03a.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	public void pagingQuery03b (Page<Tbih03b> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih03b.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	public void pagingQuery03c (Page<Tbih03c> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih03c.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	public void pagingQuery03d (Page<Tbih03d> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih03d.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public void pagingQuery03e (Page<Tbih03e> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih03e.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	public void pagingQuery03f (Page<Tbih03f> page, Map<String, Object> paramater)
			throws Exception {
		String hql = " from "+Tbih03f.class.getName()+ " where 1=1 ";
		if (paramater != null) {
			if(paramater.get("fkdwbm")!=null){
				hql += " and custNo like '%" +paramater.get("fkdwbm")+"%'";
			}
		}	
		this.pagingQuery(page, hql, "select count(*) " + hql);
	}
	
	public List<Tbih03> queryIh03Basic(Map<String, Object> parameter) throws Exception{
		String hql = " from "+Tbih03.class.getName()+ " where (custNo is null or custNo='') ";
		if(parameter!=null&&parameter.get("compId")!=null){
			hql += " and compId = '"+parameter.get("compId")+"' ";
		}
		if(parameter!=null&&parameter.get("settleType")!=null){
			hql += " and settleType = '"+parameter.get("settleType")+"' ";
		}
		if(parameter!=null&&parameter.get("status")!=null){
			hql += " and status = '"+parameter.get("status")+"' ";
		}
		List<Tbih03> listIh03 = this.query(hql);
		return listIh03;
	}
}

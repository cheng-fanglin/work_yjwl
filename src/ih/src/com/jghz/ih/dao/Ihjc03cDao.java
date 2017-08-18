package com.jghz.ih.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.base.dao.BaseDao;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.entity.Tbih03c;

@Component
public class Ihjc03cDao extends BaseDao{
	public void pagingQuery(Page<Tbih03c> page, Map<String, Object> parameter)
			throws Exception {
		String hql = " from "+Tbih03c.class.getName()+ " where 1=1 ";
		if (parameter != null) {
			if (parameter != null) {	
				if (null != parameter.get("contNo") && !"".equals( parameter.get("contNo"))) {
	 				hql += " and contNo= '"+parameter.get("contNo")+"' ";
				}
				if (null != parameter.get("custNo") && !"".equals( parameter.get("custNo"))) {
	 				hql += " and custNo= '"+parameter.get("custNo")+"' ";
				}
			}
		} 
		this.pagingQuery(page, hql, "select count(*) " + hql);
		
	}
	
	public List<Tbih03c> queryList(Map<String, Object> parameter) throws Exception{
		Map<String, Object> param = new HashMap<String,Object>();
		String hql = " from "+Tbih03c.class.getName()+ " where 1=1 ";
		if(parameter!=null&&parameter.get("contNo")!=null){
			hql += " and contNo = :contNo ";
			param.put("contNo", parameter.get("contNo"));
		}
		if(parameter!=null&&parameter.get("custNo")!=null){
			hql += " and custNo = :custNo ";
			param.put("custNo", parameter.get("custNo"));
		}
		if(parameter!=null&&parameter.get("custName")!=null){
		hql +=" and custName like :custName ";
			param.put("custName", "%"+parameter.get("custName")+"%");
		}
		if(parameter!=null&&parameter.get("tranType")!=null){
			hql += " and tranType = :tranType ";
			param.put("tranType", parameter.get("tranType"));
		}
		if(parameter!=null&&parameter.get("ts")!=null){
			hql +=" and cycle >= :ts ";
			param.put("ts", parameter.get("ts"));
		}
		if(parameter!=null&&parameter.get("contWgt")!=null){
			hql +=" and contWgt <= :contWgt ";
			param.put("contWgt", parameter.get("contWgt"));
		}
		if(parameter!=null&&parameter.get("status")!=null){
			hql += " and status = :status ";
			param.put("status", parameter.get("status"));
		}
		
		List<Tbih03c> listIh03c = this.query(hql,param);
		if(listIh03c.size()>1){
			throw new Exception("找到多条超期费定义，请先检查定义价格");
		}
		return listIh03c;
	}
	
	public List<Tbih03c> queryIh03cBasic(Map<String, Object> parameter) throws Exception{
		String hql = " from "+Tbih03c.class.getName()+ " where (custNo is null or custNo='') ";
		if(parameter!=null&&parameter.get("compId")!=null){
			hql += " and compId = '"+parameter.get("compId")+"' ";
		}
		if(parameter!=null&&parameter.get("status")!=null){
			hql += " and status = '"+parameter.get("status")+"' ";
		}
		List<Tbih03c> listIh03c = this.query(hql);
		return listIh03c;
	}
}

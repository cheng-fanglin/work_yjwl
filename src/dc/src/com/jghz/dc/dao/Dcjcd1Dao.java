package com.jghz.dc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdcd1;

@Repository
public class Dcjcd1Dao extends BaseDao {

	@DataProvider
	public void pagingQuery(Page<Tbdcd1> page, Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdcd1.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("custNo"))) {
 				hql += " and custNo like '%"+parameter.get("custNo")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("custSname"))) {
 				hql += " and custSname like '%"+parameter.get("custSname")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("custName"))) {
 				hql += " and custName like '%"+parameter.get("custName")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("custAttr"))) {
 				hql += " and custAttr like '%"+parameter.get("custAttr")+"%' ";
			}
		} 
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}
	
	public List<Tbdcd1> queryList(Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdcd1.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("compId"))) {
 				hql += " and compId like '%"+parameter.get("compId")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("custNo"))) {
 				hql += " and custNo like '%"+parameter.get("custNo")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("custSname"))) {
 				hql += " and custSname like '%"+parameter.get("custSname")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("custName"))) {
 				hql += " and custName like '%"+parameter.get("custName")+"%' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("custAttr"))) {
 				hql += " and custAttr like '%"+parameter.get("custAttr")+"%' ";
			}
		} 
		List<Tbdcd1> list=this.query(hql);
		return list;
	}
}

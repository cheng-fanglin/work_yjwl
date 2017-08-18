package com.jghz.dc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.entity.Tbdctree;

@Repository
public class DcjctreeDao extends BaseDao {

	@DataProvider
	public void pagingQuery(Page<Tbdctree> page, Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdctree.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("treeType"))) {
 				hql += " and treeType='"+parameter.get("treeType")+"' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("fatherId"))) {
 				hql += " and fatherId='"+parameter.get("fatherId")+"' ";
			}
		} 
		this.pagingQuery(page, hql,"select count(*) "+hql);
	}
	
	
	@DataProvider
	public List<Tbdctree> queryRootByType11(Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdctree.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("treeType"))) {
 				hql += " and treeType='"+parameter.get("treeType")+"' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("fatherId"))) {
 				hql += " and fatherId='"+parameter.get("fatherId")+"' ";
			}
			return this.query(hql);
		}else{
			return null;
		}
	}
	
	@DataProvider
	public List<Tbdctree> queryRootByType(Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdctree.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("treeType"))) {
 				hql += " and treeType='"+parameter.get("treeType")+"' ";
			}
			hql += " and fatherId = 'root'";
			return this.query(hql);
		}else{
			return null;
		}
	}
	
	@DataProvider
	public List<Tbdctree> queryByFatherId(Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdctree.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("treeType"))) {
 				hql += " and treeType='"+parameter.get("treeType")+"' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("fatherId"))) {
 				hql += " and fatherId='"+parameter.get("fatherId")+"' ";
			}else{
				hql += " and fatherId = 'root' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("compId"))) {
 				hql += " and compId='"+parameter.get("compId")+"' ";
			}
			List<Tbdctree> list= this.query(hql);
			return list;
		}else{
			return null;
		}
	}
	@DataProvider
	public Tbdctree queryById(Map<String, Object> parameter) throws Exception {
		String hql = " from "+Tbdctree.class.getName()+" where 1=1 ";
		if (parameter != null) {
			if (AppUtils.isNotEmpty(parameter.get("treeType"))) {
 				hql += " and treeType='"+parameter.get("treeType")+"' ";
			}
			if (AppUtils.isNotEmpty(parameter.get("fatherId"))) {
 				hql += " and fatherId='"+parameter.get("fatherId")+"' ";
			}
			return (Tbdctree) this.query(hql).get(0);
		}else{
			return null;
		}
	}
}

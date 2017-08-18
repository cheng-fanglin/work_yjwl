package com.jghz.dc.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.ehcache.hibernate.HibernateUtil;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Component;

import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.dao.DcjctreeDao;
import com.jghz.dc.entity.Tbdctree;

/**
 
 */
@Component
public class DcjcTreeService {
	@Resource
	private DcjctreeDao tbdctreeDao;
	
	@DataProvider
	public void queryAllTbdctree(Map<String, Object> parameter) throws Exception {
		
	}

	
	public List<Tbdctree> queryTbdctree(Map<String, Object> parameter) throws Exception {
		return tbdctreeDao.queryRootByType(parameter);
	}
	
	@DataProvider
	public List<Tbdctree> queryByFatherId(Map<String, Object> parameter) throws Exception {
		return tbdctreeDao.queryByFatherId(parameter);
	}
	
	@DataResolver
	public void saveTbdctree(Collection<Tbdctree> datas) throws Exception {
		for (Tbdctree dcTree : datas) {
			EntityState state = EntityUtils.getState(dcTree);
			if (state.equals(EntityState.NEW)) {
				dcTree.setCompId(AppUtils.getCompId());
				dcTree.setCreateEmp(AppUtils.getUserInfo().getUsername());
				dcTree.setCreateTime(AppUtils.getCurrentDate()); 
				dcTree.setDctreeId(AppUtils.generateUniqueKey());
				tbdctreeDao.save(dcTree);
			}
			if (state.equals(EntityState.MODIFIED)|| state.equals(EntityState.MOVED)) {
				dcTree.setUpdateEmp(AppUtils.getUserInfo().getUsername());
				dcTree.setUpdateTime(AppUtils.getCurrentDate());
				tbdctreeDao.update(dcTree);
			}
			if (dcTree.getChildren() != null) {
				Tbdctree[] defaultDepts = new Tbdctree[dcTree.getChildren().size()];
				saveTbdctree(Arrays.asList(dcTree.getChildren().toArray(defaultDepts)));
			}
			if (state.equals(EntityState.DELETED)) {
				tbdctreeDao.delete(dcTree);
			}
		}
	}
	/**
	 * @Description ajax 判断是否可以新增
	 * @param map
	 * @return
	 */
	@Expose
	public String uniqueCheck(Map map){
		String hql = "select count(*) from " + Tbdctree.class.getName() + " d where d.treeNo = :treeNo and d.treeType = :treeType";
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("treeNo", map.get("treeNo"));
		parameterMap.put("treeType", map.get("treeType"));
		if(tbdctreeDao.queryForInt(hql, parameterMap)>0){
			return "节点ID已存在！";
		}else{
			return null;
		}
	}
	/**
	 * @Description ajax验证是否可以删除
	 * @param map
	 * @return
	 */
	@Expose
	public String countChildren(Map map){
		String hql = "select count(*) from " + Tbdctree.class.getName() + " d where d.fatherId = :fatherId and d.treeType = :treeType";
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("fatherId", map.get("treeNo"));
		parameterMap.put("treeType", map.get("treeType"));
		int i = tbdctreeDao.queryForInt(hql, parameterMap);
		return i+"";
	}
	
}
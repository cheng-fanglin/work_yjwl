package com.jghz.ih.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import com.jghz.dc.dao.Dcjca1aDao;
import com.jghz.dc.entity.Tbdctree;
import com.jghz.ih.dao.Ihjc01Dao;
import com.jghz.ih.dao.Ihjc01aDao;
import com.jghz.ih.entity.Tbih01;
import com.jghz.ih.entity.Tbih01a;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.annotations.common.util.StringHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.bdf2.importexcel.processor.IExcelProcessor;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;

@Transactional
@Component
public class Ihjc01Service extends HibernateDao{
	@Resource
	private Ihjc01Dao ihjc01Dao;
	@Resource
	private Ihjc01aDao ihjc01aDao;
	
	@DataProvider
	public void loadTbih01(Page<Tbih01> page, Map<String, Object> parameter)
			throws Exception {
		ihjc01Dao.pagingQuery(page,parameter);
	}

	@DataProvider
	public void loadTbih01a(Page<Tbih01a> page,Map<String, Object> parameter)
			throws Exception {
		ihjc01aDao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public void loadTbih01aCustDrop(Page<Tbih01> page,Criteria criteria)
			throws Exception {
		ihjc01Dao.pagingQueryCustdrop(page,criteria);
	}
	
	@DataProvider
	public void loadTbih01aCustom(Page<Tbih01a> page, Map<String, Object> parameter)
			throws Exception {
		ihjc01aDao.pagingQuery(page,parameter);
	}
	
	@DataProvider
	public List<Tbih01> queryByFatherId(Map<String, Object> parameter) throws Exception {
		return ihjc01Dao.queryByFatherId(parameter);
	}
	
	
	@DataResolver
	public Properties saveTbih01(Collection<Tbih01> ListIh01,Map<String, Object> parameter) throws Exception {
		String ih01IdTree = "";
		if(parameter!=null){
			ih01IdTree = (String) parameter.get("ih01Id");
		}
		Properties prop = new Properties();
		boolean flag = true;
			for (Tbih01 tbih01 : ListIh01) {
				EntityState state = EntityUtils.getState(tbih01);
				final Tbih01 ih01 = tbih01;
				if (state.equals(EntityState.NEW)) {
					ih01.setIh01Id(AppUtils.generateUniqueKey());
					ih01.setCompId(AppUtils.getCompId());
					ih01.setCreateDate(new Date());
					ih01.setUpdateDate(new Date());
					ihjc01Dao.save(ih01);
				}
				if (state.equals(EntityState.MODIFIED)) {
					ihjc01Dao.update(ih01);
				}
				if (state.equals(EntityState.DELETED)) {
					String ih01Id = ih01.getIh01Id();
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("ih01Id", ih01Id);
					List<Tbih01a> listIh01a = ihjc01aDao.queryList(mapParam);
					for(Tbih01a ih01a:listIh01a){
						ihjc01aDao.delete(ih01a);
					}
					
					ihjc01Dao.delete(ih01);
				}
			}
			
			if(StringHelper.isNotEmpty(ih01IdTree)){
				Map<String,Object> mapParam = new HashMap<String,Object>();
				mapParam.put("ih01Id", ih01IdTree);
				List<Tbih01> listIh01 = ihjc01Dao.queryList(mapParam);
				if(CollectionUtils.isNotEmpty(listIh01)&&listIh01.get(0)!=null){
					Tbih01 ih01 = listIh01.get(0);
					ihjc01Dao.delete(ih01);
				}
			}
		prop.put("flag", flag);
		return prop;
	}
	
	@SuppressWarnings("unchecked")
	@Expose
	public Properties updateTbih01Stu(Map<String,Object> parameters) throws Exception {
		Collection<Tbih01> ListIh01 = (Collection<Tbih01>) parameters.get("ListIh01");
		String status = (String) parameters.get("status");
		Properties prop = new Properties();
		boolean flag = true;
			for (Tbih01 ih01 : ListIh01) {
				Map<String,Object> mapParam = new HashMap<String,Object>();
				mapParam.put("ih01Id", ih01.getIh01Id());
				List<Tbih01a> listIh01a = ihjc01aDao.queryList(mapParam);
				for(Tbih01a ih01a:listIh01a){
					ih01a.setStatus(status);
					ihjc01aDao.update(ih01a);
				}
				
				ih01.setStatus(status);
				ihjc01Dao.update(ih01);
				ihjc01Dao.getSession().flush();
			}
		prop.put("flag", flag);
		return prop;
	}

	@DataResolver
	public Properties saveTbih01a(Collection<Tbih01a> ListIh01a,Map<String,Object> parameter) throws Exception {
		Properties prop = new Properties();
		boolean flag = true;
			for (Tbih01a ih01a : ListIh01a) {
				EntityState state = EntityUtils.getState(ih01a);
				if (state.equals(EntityState.NEW)) {
					ih01a.setIh01aId(AppUtils.generateUniqueKey());
					ih01a.setCompId(AppUtils.getCompId());
					ih01a.setCreateDate(new Date());
					ih01a.setUpdateDate(new Date());
					ihjc01aDao.save(ih01a);
				}
				if (state.equals(EntityState.MODIFIED)) {
					ihjc01aDao.update(ih01a);
				}
				if (state.equals(EntityState.DELETED)) {
					ihjc01aDao.delete(ih01a);
				}
			}
		prop.put("flag", flag);
		return prop;
	}

	/**
	 * @Description ajax验证是否可以删除
	 * @param map
	 * @return
	 */
	@Expose
	public String countChildren(Map map){
		String hql = "select count(*) from " + Tbih01.class.getName() + " d where d.fatherId = :fatherId ";
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("fatherId", map.get("ih01Id"));
//		parameterMap.put("treeType", map.get("treeType"));
		int i = ihjc01Dao.queryForInt(hql, parameterMap);
		return i+"";
	}
	
}

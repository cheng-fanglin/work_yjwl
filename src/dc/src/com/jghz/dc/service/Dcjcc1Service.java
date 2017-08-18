package com.jghz.dc.service;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.BaseDao;
import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.dao.Dcjcc1Dao;
import com.jghz.dc.dao.Dcjcc1aDao;
import com.jghz.dc.entity.Tbdcc1;
import com.jghz.dc.entity.Tbdcc1a;


@Component
@SuppressWarnings("restriction")
public class Dcjcc1Service {
	@Resource
	private Dcjcc1Dao tbdcc1Dao;
	@Resource
	private Dcjcc1aDao tbdcc1aDao;

	/**
	 * @Description 过滤查询产品表
	 * @param page
	 * @param criteria
	 * @throws Exception
	 */
	@DataProvider
	public void loadProdNoByCriteria(Page<Tbdcc1a> page,Criteria criteria) throws Exception{
		tbdcc1aDao.loadProdNoByCriteria(page, criteria);
	}
	
	/**
	 * @Description 查询产品大类表
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	@DataProvider
	public void queryTbdcc1(Page<Tbdcc1> page, Map<String, Object> parameter) throws Exception {
		tbdcc1Dao.pagingQuery(page, parameter);
	}
	
	/**
	 * @Description 根据条件查询产品表
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	@DataProvider
	public void queryTbdcc1a(Page<Tbdcc1a> page, Map<String, Object> parameter) throws Exception {
		tbdcc1aDao.pagingQuery(page,parameter);
	}
	
	/**
	 * @Description 操作产品大类数据
	 * @param datas
	 * @param map
	 * @throws Exception
	 */
	@DataResolver
	@Transactional
	public void saveTbdcc1(Collection<Tbdcc1> datas,Map map) throws Exception {
		for (Tbdcc1 dcc1 : datas) {
			EntityState state = EntityUtils.getState(dcc1);
			if (state.equals(EntityState.NEW)) { 
				dcc1.setCompId(AppUtils.getCompId());
				dcc1.setCreateEmp(AppUtils.getUserInfo().getUsername());
				dcc1.setCreateTime(AppUtils.getCurrentDate()); 
				dcc1.setDcc1Id(AppUtils.generateUniqueKey());
				tbdcc1aDao.save(dcc1);
			}
			if (state.equals(EntityState.MODIFIED)) {
				dcc1.setUpdateEmp(AppUtils.getUserInfo().getUsername());
				dcc1.setUpdateTime(AppUtils.getCurrentDate());
				tbdcc1aDao.update(dcc1);
			}
			if (state.equals(EntityState.DELETED)) {
				tbdcc1aDao.delete(dcc1);
			}
		}
	}
	/**
	 * @Description 操作产品数据
	 * @param datas
	 * @param map
	 * @throws Exception
	 */
	@DataResolver
	@Transactional
	public void saveTbdcc1a(Collection<Tbdcc1a> datas,Map map) throws Exception {
		for (Tbdcc1a dcc1a : datas) {
			EntityState state = EntityUtils.getState(dcc1a);
			if (state.equals(EntityState.NEW)) {
				dcc1a.setCompId(AppUtils.getCompId());
				dcc1a.setCreateEmp(AppUtils.getUserInfo().getUsername());
				dcc1a.setCreateTime(AppUtils.getCurrentDate()); 
				dcc1a.setDcc1aId(AppUtils.generateUniqueKey());
				tbdcc1aDao.save(dcc1a);
			}
			if (state.equals(EntityState.MODIFIED)) {
				dcc1a.setUpdateEmp(AppUtils.getUserInfo().getUsername());
				dcc1a.setUpdateTime(AppUtils.getCurrentDate());
				tbdcc1aDao.update(dcc1a);
			}
			if (state.equals(EntityState.DELETED)) {
				tbdcc1aDao.delete(dcc1a);
			}
		}
	}

}
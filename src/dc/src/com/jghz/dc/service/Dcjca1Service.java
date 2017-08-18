package com.jghz.dc.service;

import java.rmi.dgc.VMID;
import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.dao.Dcjca1Dao;
import com.jghz.dc.dao.Dcjca1aDao;
import com.jghz.dc.entity.Tbdca1;
import com.jghz.dc.entity.Tbdca1a;


@SuppressWarnings("restriction")
@Component
public class Dcjca1Service {
	@Resource
	private Dcjca1Dao tbdca1Dao;
	@Resource
	private Dcjca1aDao tbdca1aDao;
	/**
	 * @Description 查询公用代码档资料(可以查询所以数据)
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	@DataProvider
	public void queryTbdca1(Page<Tbdca1> page, Map<String, Object> parameter) throws Exception {
		tbdca1Dao.pagingQuery(page, parameter);
	}
	
	/**
	 * @Description 查询公用代码档明细资料
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	@DataProvider
	public void queryTbdca1a(Page<Tbdca1a> page, Map<String, Object> parameter) throws Exception {
		tbdca1aDao.pagingQuery(page, parameter);
	}
	
	/**
	 * @Description 新增修改删除公用代码主档数据方法
	 * @param datas
	 * @throws Exception
	 */
	@DataResolver
	@Transactional
	public void saveTbdca1(Collection<Tbdca1> datas) throws Exception {
		for (Tbdca1 dca1 : datas) {
			EntityState state = EntityUtils.getState(dca1);
			if (state.equals(EntityState.NEW)) {
				dca1.setCompId(AppUtils.getCompId());
				dca1.setDca1Id(new VMID().toString());
				dca1.setCreateEmp(AppUtils.getUserInfo().getUsername());
				dca1.setCreateTime(AppUtils.getCurrentDate());
				tbdca1Dao.save(dca1);
			}
			if (state.equals(EntityState.MODIFIED)) {
				dca1.setUpdateEmp(AppUtils.getUserInfo().getUsername());
				dca1.setUpdateTime(AppUtils.getCurrentDate());
				tbdca1Dao.update(dca1);
			}
			if (state.equals(EntityState.DELETED)) {
				tbdca1Dao.delete(dca1);
			}
		}
	}
	/**
	 * @Description 新增修改删除公用代码明细档方法
	 * @param datas
	 * @throws Exception
	 */
	@DataResolver
	@Transactional
	public void saveTbdca1a(Collection<Tbdca1a> datas) throws Exception {
		for (Tbdca1a dca1a : datas) {
			EntityState state = EntityUtils.getState(dca1a);
			if (state.equals(EntityState.NEW)) {
				dca1a.setCompId(AppUtils.getCompId());
				dca1a.setCreateEmp(AppUtils.getUserInfo().getUsername());
				dca1a.setCreateTime(AppUtils.getCurrentDate());
				dca1a.setDca1aId(AppUtils.generateUniqueKey());
				tbdca1aDao.save(dca1a);
			}
			if (state.equals(EntityState.MODIFIED)) {
				dca1a.setUpdateEmp(AppUtils.getUserInfo().getUsername());
				dca1a.setUpdateTime(AppUtils.getCurrentDate());
				tbdca1aDao.update(dca1a);
			}
			if (state.equals(EntityState.DELETED)) {
				tbdca1aDao.delete(dca1a);
			}
		}
	}
	
}
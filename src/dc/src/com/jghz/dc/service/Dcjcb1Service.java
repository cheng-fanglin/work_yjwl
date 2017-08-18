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
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.dao.DcjcCommonDao;
import com.jghz.dc.dao.Dcjcb1Dao;
import com.jghz.dc.dao.Dcjcb1aDao;
import com.jghz.dc.entity.Tbdcb1;
import com.jghz.dc.entity.Tbdcb1a;


@SuppressWarnings("restriction")
@Component
public class Dcjcb1Service {
	@Resource
	private Dcjcb1Dao tbdcb1Dao;
	@Resource
	private Dcjcb1aDao tbdcb1aDao;
	@Resource
	private DcjcCommonDao dcjcCommonDao;
	/**
	 * @Description 查询公用代码档资料(可以查询所以数据)
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	@DataProvider
	public void queryTbdcb1(Page<Tbdcb1> page, Map<String, Object> parameter) throws Exception {
		tbdcb1Dao.pagingQuery(page, parameter);
	}
	@DataProvider
	public Map<String,Object> loadTbdca1() throws Exception {
		return dcjcCommonDao.queryTbdca1aById("PP", "STATUS_");
	}
	/**
	 * @Description 查询公用代码档明细资料
	 * @param page
	 * @param parameter
	 * @throws Exception
	 */
	@DataProvider
	public void queryTbdcb1a(Page<Tbdcb1a> page, Map<String, Object> parameter) throws Exception {
		tbdcb1aDao.pagingQuery(page, parameter);
	}
	
	/**
	 * @Description 新增修改删除公用代码主档数据方法
	 * @param datas
	 * @throws Exception
	 */
	@DataResolver
	@Transactional
	public void saveTbdcb1(Collection<Tbdcb1> datas) throws Exception {
		for (Tbdcb1 dca1 : datas) {
			EntityState state = EntityUtils.getState(dca1);
			if (state.equals(EntityState.NEW)) {
				dca1.setCompId(AppUtils.getCompId());
				dca1.setDcb1Id(new VMID().toString());
				dca1.setCreateEmp(AppUtils.getUserInfo().getUsername());
				dca1.setCreateTime(AppUtils.getCurrentDate());
				tbdcb1Dao.save(dca1);
			}
			if (state.equals(EntityState.MODIFIED)) {
				dca1.setUpdateEmp(AppUtils.getUserInfo().getUsername());
				dca1.setUpdateTime(AppUtils.getCurrentDate());
				tbdcb1Dao.update(dca1);
			}
			if (state.equals(EntityState.DELETED)) {
				tbdcb1Dao.delete(dca1);
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
	public void saveTbdcb1a(Collection<Tbdcb1a> datas) throws Exception {
		for (Tbdcb1a dca1a : datas) {
			EntityState state = EntityUtils.getState(dca1a);
			if (state.equals(EntityState.NEW)) {
				dca1a.setCompId(AppUtils.getCompId());
				dca1a.setCreateEmp(AppUtils.getUserInfo().getUsername());
				dca1a.setCreateTime(AppUtils.getCurrentDate());
				dca1a.setDcb1aId(AppUtils.generateUniqueKey());
				tbdcb1aDao.save(dca1a);
			}
			if (state.equals(EntityState.MODIFIED)) {
				dca1a.setUpdateEmp(AppUtils.getUserInfo().getUsername());
				dca1a.setUpdateTime(AppUtils.getCurrentDate());
				tbdcb1aDao.update(dca1a);
			}
			if (state.equals(EntityState.DELETED)) {
				tbdcb1aDao.delete(dca1a);
			}
		}
	}
	@Expose
	public String uniqueCheck(String id){
		String compId = AppUtils.getCompId();
		return tbdcb1Dao.uniqueCheck(compId, id);
	}
}
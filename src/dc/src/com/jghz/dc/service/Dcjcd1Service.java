package com.jghz.dc.service;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.dao.Dcjcd1Dao;
import com.jghz.dc.entity.Tbdcd1;

/**
 
 */
@Component
public class Dcjcd1Service {
	@Resource
	private Dcjcd1Dao tbdcd1Dao;

	@DataProvider
	public void queryTbdcd1(Page<Tbdcd1> page, Map<String, Object> parameter) throws Exception {
		tbdcd1Dao.pagingQuery(page, parameter);
	}
	
	@DataResolver
	public void saveTbdcd1(Collection<Tbdcd1> datas) throws Exception {
		for (Tbdcd1 dcd1 : datas) {
			EntityState state = EntityUtils.getState(dcd1);
			if (state.equals(EntityState.NEW)) {
				dcd1.setCompId(AppUtils.getCompId());
				dcd1.setCreateEmp(AppUtils.getUserInfo().getUsername());
				dcd1.setCreateTime(AppUtils.getCurrentDate()); 
				dcd1.setDcd1Id(AppUtils.generateUniqueKey());
				tbdcd1Dao.save(dcd1);
			}
			if (state.equals(EntityState.MODIFIED)) {
				dcd1.setUpdateEmp(AppUtils.getUserInfo().getUsername());
				dcd1.setUpdateTime(AppUtils.getCurrentDate());
				tbdcd1Dao.update(dcd1);
			}
			if (state.equals(EntityState.DELETED)) {
				tbdcd1Dao.delete(dcd1);
			}
		}
	}

}
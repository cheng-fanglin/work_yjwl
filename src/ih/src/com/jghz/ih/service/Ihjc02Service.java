package com.jghz.ih.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.dc.dao.Dcjcd1Dao;
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc02bDao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih02b;

@Transactional
@Component
public class Ihjc02Service extends HibernateDao
{
	@Resource
	private Ihjc02Dao ihjc02Dao;

	@Resource
	private Ihjc02bDao ihjc02bDao;

	@Resource
	private Dcjcd1Dao dcjcd1Dao;

	@DataProvider
	public void loadTbih02(Page<Tbih02> page, Map<String, Object> parameter) throws Exception
	{
		ihjc02Dao.pagingQuery(page, parameter);
	}

	@DataProvider
	public void loadTbih02b(Page<Tbih02b> page, Map<String, Object> parameter) throws Exception
	{
		ihjc02bDao.pagingQuery(page, parameter);
	}

	@DataResolver
	public void saveTbih02(Collection<Tbih02> ListIh02) throws Exception
	{
		for (Tbih02 tbih02 : ListIh02)
		{
			EntityState state = EntityUtils.getState(tbih02);
			final Tbih02 ih02 = tbih02;
			if (state.equals(EntityState.NEW))
			{
				ih02.setIh02Id(AppUtils.generateUniqueKey());
				ih02.setCompId(AppUtils.getCompId());
				ih02.setCreateDate(new Date());
				ih02.setUpdateDate(new Date());
				ihjc02Dao.save(ih02);
			}
			if (state.equals(EntityState.MODIFIED))
			{
				ihjc02Dao.update(ih02);
			}
			if (state.equals(EntityState.DELETED))
			{
				ihjc02Dao.delete(ih02);
			}
		}
	}

	// 根据底层表自动生成往来单位信息
	@Expose
	public void saveTbih02All(Map<String, Object> parameter) throws Exception
	{
		if (parameter == null)
		{
			parameter = new HashMap();
		}
		parameter.put("compId", AppUtils.getCompId());
		// List<Tbdcd1> listDcd1 = dcjcd1Dao.queryList(parameter);
		// for(Tbdcd1 dcd1:listDcd1){
		// parameter.put("custNo", dcd1.getCustNo());
		// parameter.put("custName", dcd1.getCustName());
		// List<Tbih02> listIh02 = ihjc02Dao.queryList02(parameter);
		// if(CollectionUtils.isEmpty(listIh02)||listIh02.get(0)==null){
		// Tbih02 ih02= new Tbih02();
		// AppUtils.copyProperties(dcd1, ih02);
		// ih02.setIh02Id(AppUtils.generateUniqueKey());
		// ih02.setCompId(AppUtils.getCompId());
		// session.save(ih02);
		// }
		// }
	}

	@DataResolver
	public void saveTbih02b(Collection<Tbih02b> ListIh02b,
			Map<String, Object> parameter) throws Exception
	{
		for (Tbih02b ih02b : ListIh02b)
		{
			EntityState state = EntityUtils.getState(ih02b);
			if (state.equals(EntityState.NEW))
			{
				ih02b.setIh02bId(AppUtils.generateUniqueKey());
				ih02b.setCompId(AppUtils.getCompId());
				ih02b.setCreateDate(new Date());
				ih02b.setUpdateDate(new Date());
				ihjc02bDao.save(ih02b);

			}
			if (state.equals(EntityState.MODIFIED))
			{
				ihjc02bDao.update(ih02b);
			}
			if (state.equals(EntityState.DELETED))
			{
				ihjc02bDao.delete(ih02b);
			}
		}
	}
}
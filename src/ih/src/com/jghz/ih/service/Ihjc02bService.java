package com.jghz.ih.service;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import com.base.util.AppUtils;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc02Dao;
import com.jghz.ih.dao.Ihjc02bDao;
import com.jghz.ih.entity.Tbih02;
import com.jghz.ih.entity.Tbih02b;

@Transactional
@Component
public class Ihjc02bService extends HibernateDao {

	@Resource
	private Ihjc02bDao ihjc02bDao;

	@DataProvider
	public void loadTbih02b(Page<Tbih02b> page, Map<String, Object> parameter)
			throws Exception {
		ihjc02bDao.pagingQuery(page,parameter);
	}

	@DataResolver
	public void saveTbih02b(Collection<Tbih02b> ListIh02b,Map<String,Object> parameter) throws Exception {
			for (Tbih02b ih02b : ListIh02b) {
				EntityState state = EntityUtils.getState(ih02b);
				if (state.equals(EntityState.NEW)) {
					ih02b.setIh02bId(AppUtils.generateUniqueKey());
					ih02b.setCompId(AppUtils.getCompId());
					ih02b.setCreateDate(new Date());
					ih02b.setUpdateDate(new Date());
					ihjc02bDao.save(ih02b);

				}
				if (state.equals(EntityState.MODIFIED)) {
					ihjc02bDao.update(ih02b);
				}
				if (state.equals(EntityState.DELETED)) {
					ihjc02bDao.delete(ih02b);
				}
			}
	}
}
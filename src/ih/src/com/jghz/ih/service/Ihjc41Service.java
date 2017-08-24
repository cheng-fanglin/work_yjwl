package com.jghz.ih.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc41Dao;
import com.jghz.ih.entity.Tbih41;

/**
 * 单表维护服务类
 * 实现对com.jghz.ih.entity.Tbih41对象信息的保存操作
 */
@Component("ihjc41Service")
public class Ihjc41Service {
	@Resource
	private Ihjc41Dao ihjc41Dao;

	@DataProvider
	public void loadTbih41(Page<Tbih41> page, Map<String, Object> parameter) throws Exception {
		ihjc41Dao.pagingQuery(page,parameter);
	}
	
	@DataResolver
	public void saveTbih41(Collection<Tbih41> ListIh41) throws Exception {
		Session session = ihjc41Dao.getSession();
		try {
			for (Tbih41 tbih41 : ListIh41) {
				EntityState state = EntityUtils.getState(tbih41);
				final Tbih41 ih41 = tbih41;
				if (state.equals(EntityState.NEW)) {
					ih41.setIh41Id(AppUtils.generateUniqueKey());
					ih41.setCompId(AppUtils.getCompId());
					ih41.setCreateDate(new Date());
					ih41.setUpdateDate(new Date());
					session.save(ih41);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih41);
				}
				if (state.equals(EntityState.DELETED)) {
					String ih41Id = ih41.getIh41Id();
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("ih41Id", ih41Id);	
					session.delete(ih41);
				}
			}

		} finally {
			session.flush();
			
		}
	}

}
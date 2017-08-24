package com.jghz.ih.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc42Dao;
import com.jghz.ih.entity.Tbih42;

/**
 * 单表维护服务类
 * 实现对com.jghz.ih.entity.Tbih42对象信息的保存操作
 */
@Component("ihjc42Service")
public class Ihjc42Service {
	@Resource
	private Ihjc42Dao ihjc42Dao;

	@DataProvider
	public void loadTbih42(Page<Tbih42> page, Map<String, Object> parameter) throws Exception {
		ihjc42Dao.pagingQuery(page,parameter);
	}
	
	@DataResolver
	public void saveTbih42(Collection<Tbih42> ListIh42) throws Exception {
		Session session = ihjc42Dao.getSession();
		try {
			for (Tbih42 tbih42 : ListIh42) {
				EntityState state = EntityUtils.getState(tbih42);
				final Tbih42 ih42 = tbih42;
				if (state.equals(EntityState.NEW)) {
					ih42.setIh42Id(AppUtils.generateUniqueKey());
					ih42.setCompId(AppUtils.getCompId());
					ih42.setCreateDate(new Date());
					ih42.setUpdateDate(new Date());
					session.save(ih42);

				}
				if (state.equals(EntityState.MODIFIED)) {
					session.update(ih42);
				}
				if (state.equals(EntityState.DELETED)) {
					String ih42Id = ih42.getIh42Id();
					Map<String,Object> mapParam = new HashMap<String,Object>();
					mapParam.put("ih42Id", ih42Id);	
					session.delete(ih42);
				}
			}

		} finally {
			session.flush();
			
		}
	}

}
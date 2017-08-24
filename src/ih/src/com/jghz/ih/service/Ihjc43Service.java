package com.jghz.ih.service;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.base.util.AppUtils;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc43Dao;
import com.jghz.ih.entity.Tbih43;

@Transactional
@Component
public class Ihjc43Service {
	@Resource
	private Ihjc43Dao ihjc43Dao;

	@DataProvider
	public void loadTbih43(Page<Tbih43> page, Map<String, Object> parameter)
			throws Exception {
		ihjc43Dao.pagingQuery43(page,parameter);
	}
	
	@DataProvider
	public void loadTbih43CustDrop(Page<Tbih43> page, Map<String, Object> parameter)
			throws Exception {
		ihjc43Dao.pagingQuery43(page,parameter);
	}
	
	
	@DataResolver
	public void saveTbih43(Collection<Tbih43> datasTbih43,Map<String,Object> parameter) throws Exception {
		Session session = ihjc43Dao.getSession();
		try {
			for (Tbih43 thih43 : datasTbih43) {
				EntityState state = EntityUtils.getState(thih43);
				Tbih43 ih43 = new Tbih43();
				AppUtils.copyProperties(thih43, ih43);
				if (state.equals(EntityState.NEW)) {
					ih43.setIh43Id(AppUtils.generateUniqueKey());
					ih43.setCompId(AppUtils.getCompId());
					
					session.save(ih43);
				}
                if (state.equals(EntityState.MODIFIED)) {
                	
                	session.update(ih43);
				}
                if (state.equals(EntityState.DELETED)) {
					session.delete(ih43);
				}
			}
			
		}finally {
			session.flush();
			
		}
	}
}

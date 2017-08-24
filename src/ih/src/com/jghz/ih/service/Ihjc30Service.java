package com.jghz.ih.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.entity.Tbih30;

@Transactional
@Component
public class Ihjc30Service {
	@Resource
	private Ihjc30Dao ihjc30Dao;
	
	
	@DataProvider
	public void loadTbih30(Page<Tbih30> page, Map<String, Object> parameter)
			throws Exception {
		ihjc30Dao.pagingQuery(page,parameter);
	}

	@DataProvider
	public void loadTbih30ForSelect(Page<Tbih30> page, Map<String, Object> parameter) throws Exception {
		ihjc30Dao.pagingQueryForSelect(page,parameter);
	}
}

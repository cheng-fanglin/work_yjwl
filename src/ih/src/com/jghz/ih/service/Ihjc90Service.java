package com.jghz.ih.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc30Dao;
import com.jghz.ih.dao.Ihjc90Dao;
import com.jghz.ih.entity.Tbih30;

@Transactional
@Component
public class Ihjc90Service {
	@Resource
	private Ihjc90Dao ihjc90Dao;
	
	
	@DataProvider
	public Collection<Map<String,Object>> loadTbih90(Map<String, Object> parameter)
			throws Exception {
		List<Map<String,Object>> list = ihjc90Dao.queryList(parameter);
		return list;
	}

	
}

package com.jghz.ih.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.jghz.ih.dao.Ihjc91Dao;

@Transactional
@Component
public class Ihjc91Service {
	@Resource
	private Ihjc91Dao ihjc91Dao;
	
	
	@DataProvider
	public Collection<Map<String,Object>> loadTbih91(Map<String, Object> parameter)
			throws Exception {
		List<Map<String,Object>> list = ihjc91Dao.queryList(parameter);
		return list;
	}

	
}

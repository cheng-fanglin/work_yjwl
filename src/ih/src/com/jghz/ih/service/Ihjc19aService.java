package com.jghz.ih.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc19Dao;
import com.jghz.ih.entity.Tbih19;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih19对象信息的保存操作
 */
@Transactional
@Component("ihjc19aService")
public class Ihjc19aService {
	@Resource
	private Ihjc19Dao ihjc19Dao;
	
	
	@DataProvider
	public void loadTbih19a(Page<Tbih19> page, Map<String, Object> parameter) throws Exception {
		ihjc19Dao.pagingQuery19a(page,parameter);
	}
	@DataProvider
	public void loadTbih19b(Page<Tbih19> page, Map<String, Object> parameter) throws Exception {
		ihjc19Dao.pagingQuery19b(page,parameter);
	}
}
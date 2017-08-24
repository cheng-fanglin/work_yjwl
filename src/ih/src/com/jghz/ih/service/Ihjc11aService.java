package com.jghz.ih.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.jghz.ih.dao.Ihjc11Dao;
import com.jghz.ih.entity.Tbih11;

/**
 * 单表维护服务类
 * 实现对com.jghz.entity.Tbih11对象信息的保存操作
 */
@Transactional
@Component("ihjc11aService")
public class Ihjc11aService {
	@Resource
	private Ihjc11Dao ihjc11Dao;
	
	@DataProvider
	public void loadTbih11a(Page<Tbih11> page, Map<String, Object> parameter) throws Exception {
		ihjc11Dao.pagingQuery11a(page,parameter);
	}
	@DataProvider
	public void loadTbih11b(Page<Tbih11> page, Map<String, Object> parameter) throws Exception {
		ihjc11Dao.pagingQuery11b(page,parameter);
	}
}
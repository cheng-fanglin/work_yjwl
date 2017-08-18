package com.demo.impl;

import org.springframework.stereotype.Service;

import com.base.util.AppUtils;
import com.bstek.bdf2.importexcel.interceptor.ICellDataInterceptor;

 
@Service("jghz.formatCompId")
public class FormatCompId implements ICellDataInterceptor{

	public String getName() {
		return "初始化公司别";
	}

	public Object execute(Object cellValue) throws Exception {
		return AppUtils.getCompId();
	}

}

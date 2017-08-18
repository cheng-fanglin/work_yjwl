package com.demo.impl;

import org.springframework.stereotype.Service;

import com.base.util.AppUtils;
import com.bstek.bdf2.importexcel.interceptor.ICellDataInterceptor;

 
@Service("jghz.formatVersion")
public class FormatVersion implements ICellDataInterceptor{

	public String getName() {
		return "初始化版本号";
	}

	public Object execute(Object cellValue) throws Exception {
		return new Integer(0);
	}

}

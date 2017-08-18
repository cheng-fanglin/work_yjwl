package com.demo.impl;

import org.springframework.stereotype.Service;

import com.base.util.AppUtils;
import com.bstek.bdf2.importexcel.interceptor.ICellDataInterceptor;

 
/**
 * @ClassName FormatCreateTime
 * @Description 上传模板 生成新增时间
 * @author Administrator
 * @Date 2016-11-9 下午4:15:07
 * @version 1.0.0
 */
@Service("jghz.formatCreateTime")
public class FormatCreateTime implements ICellDataInterceptor{

	public String getName() {
		return "初始化新增时间";
	}

	public Object execute(Object cellValue) throws Exception {
		return AppUtils.getCurrentDate();
	}

}

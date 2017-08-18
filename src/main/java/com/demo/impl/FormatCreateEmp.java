package com.demo.impl;

import org.springframework.stereotype.Service;

import com.base.util.AppUtils;
import com.bstek.bdf2.importexcel.interceptor.ICellDataInterceptor;

 
/**
 * @ClassName FormatCreateEmp
 * @Description 上传模板 生成人员
 * @author Administrator
 * @Date 2016-11-9 下午4:15:50
 * @version 1.0.0
 */
@Service("jghz.formatCreateEmp")
public class FormatCreateEmp implements ICellDataInterceptor{

	public String getName() {
		return "初始化人员";
	}

	public Object execute(Object cellValue) throws Exception {
		return AppUtils.getUserInfo().getUsername();
	}

}

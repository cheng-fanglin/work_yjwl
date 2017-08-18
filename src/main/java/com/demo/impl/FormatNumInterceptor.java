package com.demo.impl;

import org.springframework.stereotype.Service;

import com.base.util.AppUtils;
import com.base.util.NumberUtils;
import com.bstek.bdf2.importexcel.exception.InterceptorException;
import com.bstek.bdf2.importexcel.interceptor.impl.RequiredInterceptor;

/**
 * @ClassName FormatNumInterceptor
 * @Description 上传模板验证 验证是否为数字
 * @author Administrator
 * @Date 2016-11-9 下午3:29:55
 * @version 1.0.0
 */
@Service("jghz.formatNum")
public class FormatNumInterceptor extends RequiredInterceptor {

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.interceptor.ICellDataInterceptor#getName()
	 */
	public String getName() {
		return "格式化非空&数字类型";
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.bstek.bdf2.importexcel.interceptor.ICellDataInterceptor#execute(java.lang.Object)
	 */
	public Object execute(Object cellValue) throws Exception {
		super.execute(cellValue);//调用父类方法 验证是否为空
		if(NumberUtils.isNumber(AppUtils.toValidString(cellValue))){
			return cellValue;
		}else{
			throw new InterceptorException("当前单元格内容不能为非数字！");
		}
	}

}

package com.base.util;

import java.util.Properties;

import org.springframework.stereotype.Component;

import com.base.constant.SystemConstant;
import com.bstek.dorado.annotation.Expose;


@Component
public class GetSystemContants {
	/**
	 * @description 原始图片访问URL
	 * @return
	 * @author wll 2016-1-14 下午7:22:44
	 */
	@Expose
	public Properties getOriginalUrl(){
		Properties prop=new Properties();
		String originalUrl=SystemConstant.originalUrl;
		prop.put("originalUrl", originalUrl);
		return prop;
	}
	/**
	 * @description 压缩图片访问URL
	 * @return
	 * @author wll 2016-1-14 下午7:22:42
	 */
	@Expose
	public Properties getCompressUrl(){
		Properties prop=new Properties();
		String compressUrl=SystemConstant.compressUrl;
		prop.put("compressUrl", compressUrl);
		return prop;
	}
}

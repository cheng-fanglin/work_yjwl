package com.base.pagination;

import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;

/**
 * 辅助类<br>
 * 功能：提供与Spring打交道的能力
 * @author mark
 * @date 2009-12-23 11:21:37 
 */
public class SpringHolder {
	private static WebApplicationContext context = null;
	
	/**
	 * 注册spring的ApplicationContext
	 * @param ctx
	 */
	public static void register(WebApplicationContext ctx){
		Assert.notNull(ctx);
		context = ctx;
	}
	
	public static ApplicationContext getApplicationContext(){
		return context;
	}
	
	public static void contextDestroyed(ServletContextEvent event){
		Log log = LogFactory.getLog(SpringHolder.class);
		if(context!=null){
			context = null;
			log.info("SpringHolder context destroyed.");
		}else{
			log.info("SpringHolder already been null.");
		}
	}
}

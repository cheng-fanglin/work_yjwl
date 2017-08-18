/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.base.db
 *
 *    Filename:    UreportDataSourse.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     Administrator
 *
 *    @version:    1.0.0
 *
 *    Create at:   2016-12-6 下午8:02:49
 *
 *    Revision:
 *
 *    2016-12-6 下午8:02:49
 *        - first revision
 *
 *****************************************************************/
package com.base.db;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.ureport.env.EnvironmentProvider;

/**
 * @ClassName UreportDataSourse
 * @Description 设定Ureport数据源为系统默认数据源(未测试，未用到)
 * @author Administrator
 * @Date 2016-12-6 下午8:02:49
 * @version 1.0.0
 */
public class UreportDataSourse implements EnvironmentProvider {

	 /**     
	  * @return 返回当前报表引擎可能会使用到的数据源集合,Key为Datasource名称     
	  */
	public Map<String, DataSource> getDatasourceMap() {
		Map<String, DataSource> map = new HashMap<String, DataSource>();
		DataSource dataSource= ContextHolder.getBean("dataSource");
		map.put("dataSource", dataSource);
		return map;
	}


	 /**     
	  * 返回报表运行时产生的临时文件存放目录，如果返回null，那么就取jvm的临时目录     
	  * @return 返回报表运行时产生的临时文件存放目录     
	  * */
	public String getTemporaryDirectory() {
		// TODO Auto-generated method stub
		return null;
	}

}

/**
 * DateFormatUtils.java
 */
package com.base.util;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @fileName DateFormatUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-9-10
 * @time 下午09:13:36
 */
public final class DateFormatUtils {
	private DateFormatUtils() {

	}

	public static final String format(Date date, String pattern) {
		DateFormat dateFormat = null;
		dateFormat = DateFormatUtils.getInCache(pattern);
		if (null == dateFormat) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			DateFormatUtils.putInCache(pattern, simpleDateFormat);
			dateFormat = simpleDateFormat;
		}
		return dateFormat.format(date);
	}

	public static final Date parse(String dateString, String pattern) {
		DateFormat dateFormat = null;
		dateFormat = DateFormatUtils.getInCache(pattern);
		if (null == dateFormat) {
			dateFormat = new SimpleDateFormat(pattern);
			DateFormatUtils.putInCache(pattern, dateFormat);
		}
		Date result = null;
		try {
			result = dateFormat.parse(dateString);
		} catch (ParseException e) {

		}
		Assert.notNull(result, "String[" + dateString
				+ "] cann't match pattern[" + pattern + "]");
		return result;

	}

	private static final void putInCache(String pattern, DateFormat dateFormat) {
		Assert.notNull(pattern, "Pattern in cache cann't be null.");
		if (null != dateFormat) {
			Reference<DateFormat> dateFormatReference = new WeakReference<DateFormat>(
					dateFormat);
			DateFormatUtils.cache.put(pattern, dateFormatReference);
		}
	}

	private static final DateFormat getInCache(String pattern) {
		Assert.notNull(pattern, "Pattern in cache cann't be null.");
		Reference<DateFormat> dateFormatReference = DateFormatUtils.cache
				.get(pattern);
		DateFormat dateFormat = null;
		if (null != dateFormatReference) {
			dateFormat = dateFormatReference.get();
		}
		return dateFormat;
	}

	private static final Map<String, Reference<DateFormat>> cache = new WeakHashMap<String, Reference<DateFormat>>();

	public static void contextDestroyed(ServletContextEvent event) {
		Log log = LogFactory.getLog(DateFormatUtils.class);
		if(!cache.isEmpty()){
			cache.clear();
			log.info("MethodUtils cache cleared.");
		}else{
			log.info("MethodUtils cache has nothing now.");
		}		
	}

}

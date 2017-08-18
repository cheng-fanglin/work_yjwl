/**
 * ObjectUtils.java
 */
package com.base.util;

/**
 * @fileName ObjectUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-9-1
 * @time 上午10:43:55
 */
public final class ObjectUtils {
	private ObjectUtils(){
		
	}
	public static final boolean isEmpty(final Object objectArray[]) {
		return objectArray == null || objectArray.length == 0;
	}
}

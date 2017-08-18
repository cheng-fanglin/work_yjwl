/**
 * CollectionUtils.java
 */
package com.base.util;

import java.util.Collection;
import java.util.Map;

/**
 * @fileName CollectionUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-9-1
 * @time 上午10:55:21
 */
public final class CollectionUtils {
	private CollectionUtils() {

	}

	public static final boolean isEmpty(Collection<? extends Object> collection) {
		return null == collection || collection.isEmpty();
	}

	public static final boolean isEmpty(Map<Object, Object> map) {
		return null == map || map.isEmpty();
	}
}

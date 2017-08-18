package com.base.domain;

import java.util.HashMap;
import java.util.Map;

import com.bstek.dorado.core.Context;

public abstract class MyDataObjectUtils {
	private static final String CONTEXT_KEY = MyDataObjectUtils.class.getName();

	@SuppressWarnings("unchecked")
	static void bindEntity(MyDataObject myDataObject, Map<String, Object> entity) {
		Context current = Context.getCurrent();
		Map<MyDataObject, Object> map = ((Map<MyDataObject, Object>) current
				.getAttribute(CONTEXT_KEY));
		if (map == null) {
			map = new HashMap<MyDataObject, Object>();
			current.setAttribute(CONTEXT_KEY, map);
		}
		map.put(myDataObject, entity);
	}

	@SuppressWarnings("unchecked")
	public static Map<String, Object> getEntity(MyDataObject myDataObject) {
		Context current = Context.getCurrent();
		Map<MyDataObject, Object> map = ((Map<MyDataObject, Object>) current
				.getAttribute(CONTEXT_KEY));
		return (map == null) ? null : (Map<String, Object>) map
				.get(myDataObject);
	}
}

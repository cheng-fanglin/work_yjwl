package com.base.domain;

import java.util.HashMap;
import java.util.Map;

public class MyDataObject {
	private Map<String, Object> map = new HashMap<String, Object>();

	public Object getValue(String property) {
		return map.get(property);
	}

	public void setValue(String property, Object value) {
		map.put(property, value);
	}
}

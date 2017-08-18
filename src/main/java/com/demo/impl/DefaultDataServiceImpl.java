package com.demo.impl;

import com.bstek.bdf2.componentprofile.service.IDataService;
import com.bstek.bdf2.core.context.ContextHolder;

public class DefaultDataServiceImpl implements IDataService {

	public static String UNKNOWN = "unknown";

	public String getProfileKey() {
		String profileKey = null;
		try {
			profileKey = ContextHolder.getLoginUserName();
		} catch (Exception e) {
			profileKey = UNKNOWN;
		}
		return profileKey;
	}

}

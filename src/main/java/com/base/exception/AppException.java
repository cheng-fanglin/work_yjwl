package com.base.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统中异常处理的基类
 * */
public class AppException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> parameters = new HashMap<String, Object>();
	private String message = null;
	
	public AppException() {
		this.message = "未知异常";
	}

	public AppException(String message) {
		this.message = message;
	}

	public AppException(String message, String key) {
		String jsonstr = "$w{\""+key+"\":"+"\""+message+"\"}";
		this.message = jsonstr;
	}
	
	public Map<String, Object> getParameters() {
		return this.parameters;
	}

	public void addParameter(String key, Object obj) {
		this.parameters.put(key, obj);
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}

}

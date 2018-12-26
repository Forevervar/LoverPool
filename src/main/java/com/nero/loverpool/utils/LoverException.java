package com.nero.loverpool.utils;

public class LoverException extends Exception {

	/**
	 * author Nero 2018-12-26
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	public LoverException(String code, String msg) {
		super(code + Operator.COLON + msg);
	}
	
	public String getCode() {
		return code;
	}

}

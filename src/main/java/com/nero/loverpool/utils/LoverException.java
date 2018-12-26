package com.nero.loverpool.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoverException extends Exception {

	/**
	 * author Nero 2018-12-26
	 */
	private static final long serialVersionUID = 1L;
	
	private static Logger logger = LoggerFactory.getLogger(LoverException.class);
	
	
	public LoverException(String code, String msg) {
		super(code + Operator.COLON + msg);
		logger.debug(code + Operator.COLON + msg);
	}
}

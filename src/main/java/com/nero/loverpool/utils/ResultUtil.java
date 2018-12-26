package com.nero.loverpool.utils;

import java.util.HashMap;
import java.util.Map;

public class ResultUtil {
	
	@SuppressWarnings("rawtypes")
	public static Map success(Object data) {
		Map<String, Object> result = new HashMap<>();
		result.put("code", LoverConstant.RESULT_SUCCESS);
		result.put("msg", "success");
		result.put("data", data);
		return result;
	}

	@SuppressWarnings("rawtypes")
	public static Map fail(Object data, String msg) {
		Map<String, Object> result = new HashMap<>();
		result.put("code", LoverConstant.RESULT_FAIL);
		result.put("msg", msg);
		result.put("data", data);
		return result;
	}
}

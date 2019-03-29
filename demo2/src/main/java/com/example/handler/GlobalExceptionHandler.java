package com.example.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> exceptionHandler(RuntimeException e) {
		Map<String, Object>map = new HashMap<String, Object>();
		map.put("errorCode", "101");
		map.put("errorMsg", e.getMessage());
		return map;
	}

}

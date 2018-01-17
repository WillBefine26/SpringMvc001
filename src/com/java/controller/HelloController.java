package com.java.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class HelloController {
	@RequestMapping("/test")
	@ResponseBody
	public Map<String, Object> name(HttpServletRequest paramsMap) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		
		return map ;
	}
}

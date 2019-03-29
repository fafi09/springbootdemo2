package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class FreeMarkerController {
	@RequestMapping("/login")
	public String login(Map<String, Object> map) {
		map.put("name", "mingzi...");
		map.put("sex", 1);
		List<String> userlist = new ArrayList<String>();
		userlist.add("余");
		userlist.add("张三");
		userlist.add("李四");
		map.put("userlist", userlist);

		return "login";
	}
}

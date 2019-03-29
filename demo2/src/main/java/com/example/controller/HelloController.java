package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.entity.UserJpa;
import com.example.service.User2TsService;

@RestController
@EnableAutoConfiguration
public class HelloController {
	
	@Autowired
	private User2TsService user2TsService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/errorpage")
	public String error() {
		/*
		 * int a = 2/0; return "error";
		 */
		throw new RuntimeException();
	}

	
	@RequestMapping("/create2tsuser")
	public String create2TsUser(@RequestParam(value = "userid") String userid,
			@RequestParam(value = "username") String username, 
			@RequestParam(value = "password") String password,
			@RequestParam(value = "status") String status) {
		User user = new User();
		user.setUserid(Integer.valueOf(userid));
		user.setUsername(username);
		user.setPassword(password);
		user.setStatus(status);
		user2TsService.insert(user);
		return "success";
	}
}

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	@RequestMapping("/myJsp")
	public String index() {
		return"myjsp";
	}

}

package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	@RequestMapping(value = "/222")
	public String index22() {
		
		return "index2";
	}
}

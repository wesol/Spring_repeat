package com.mw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/contact")
	public String con() {
		return "contact";
	}
	@RequestMapping("/blog")
	public String blog() {
		System.out.println("ddddd");
		return "blog";
	}

}

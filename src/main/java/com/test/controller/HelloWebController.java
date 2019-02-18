package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类说明:测试spring-boot-web应用
 * @author:pgf
 * @date:  2018年5月2日下午1:54:35
 */
@Controller
public class HelloWebController {
	
	@RequestMapping("helloWeb")
	public String hello(Model model){
		model.addAttribute("msg", "hello-spring-boot-web !");
		return "hello";
	}
}

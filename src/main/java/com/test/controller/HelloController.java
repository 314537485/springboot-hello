package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明:测试spring-boot的controller
 * @author:pgf
 * @date:  2018年5月2日上午11:24:10
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "Hello SpringBoot !";
	}
}

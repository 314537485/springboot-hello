package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类说明:
 * @author:pgf
 * @date:  2018年5月2日上午11:30:49
 */
@SpringBootApplication//标记为springboot应用
public class App {
	public static void main(String[] args) {
		//启动应用
		SpringApplication.run(App.class, args);
	}
}

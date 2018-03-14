package com.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello Controller.
 * 
 * @since 1.0.0 2017年11月20日
 */
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}

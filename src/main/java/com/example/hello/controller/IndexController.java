package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "Application Running";
	}
	
	@GetMapping("/hello")
	public String helloWord() {
		return "Hello World Spring Boot Application...";
	}
}

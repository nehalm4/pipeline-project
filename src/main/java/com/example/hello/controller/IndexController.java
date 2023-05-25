package com.example.hello.controller;

import java.util.Arrays;
import java.util.List;

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

	@GetMapping("/list")
	public List<String> listApi() {
		List<String> list = Arrays.asList("NEHAL", "GAURI", "SAGAR");
		return list;
	}
}

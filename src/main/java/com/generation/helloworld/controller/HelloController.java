package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String Hello() {
		return "<h1>Hello world<h1>"
				+ "<br>"
				+ "<h3>My names is pedro<h3>"; 
	}
}

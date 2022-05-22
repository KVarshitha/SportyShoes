package com.spring.boot.ss.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

	@GetMapping("/welcome")
	public String display() {
	String mess="idiot";
		return mess;
	}
}

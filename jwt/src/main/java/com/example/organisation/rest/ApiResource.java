package com.example.organisation.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiResource {

	@RequestMapping("/hello")
	public String greeting() {
		return "So you knew the password, Cool !";
	}
}

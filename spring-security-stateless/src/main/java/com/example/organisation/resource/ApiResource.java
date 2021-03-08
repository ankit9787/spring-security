package com.example.organisation.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiResource {

		@RequestMapping("/thought")
		public String getGreeting() {
			return "Thought for everyday: The way you do anything is the way you do anything";
		}
		
		@RequestMapping("/")
		public String getG() {
			return "Welcome user ! Navigate to /thought";
		}
	}

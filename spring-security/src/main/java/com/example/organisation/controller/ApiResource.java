package com.example.organisation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiResource {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "Welcome user";
	}

	@RequestMapping(value = { "/browser-shortcuts" }, method = RequestMethod.GET)
	public List<String> getBrowserShortcuts() {
		List<String> shortcuts = new ArrayList<>();
		shortcuts.add("Open a new window Ctrl + n");
		shortcuts.add("Open a new tab, and jump to it Ctrl + t");
		shortcuts.add("Reopen previously closed tabs in the order they were closed Ctrl + Shift + t");
		shortcuts.add("Jump to a specific tab Ctrl + 1 through Ctrl + 8");
		shortcuts.add("Close the current tab Ctrl + w or Ctrl + F4");
		shortcuts.add("Maximize the current window Alt + Space then x");
		shortcuts.add("Search from anywhere on the page Ctrl + k or Ctrl + e");
		return shortcuts;
	}
}

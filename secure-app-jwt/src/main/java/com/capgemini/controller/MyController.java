package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "<h1> Home Page</h1>";
	}
	@GetMapping("/user")
	public String user() {
		return "<h1> User Page</h1>";
	}
	@GetMapping("/admin")
	public String admin() {
		return "<h1> Admin Page</h1>";
	}
	
	@GetMapping("/update")
	@PreAuthorize("hasAuthority('Admin')")
	public String update() {
		return "<h1> Only ADMIN can access this Page</h1>";
	}
	
	@GetMapping("/user1")
	@PreAuthorize("hasAuthority('User')")
	public String user1() {
		return "<h1> Only USERS can access this page</h1>";
	}
	
	
}

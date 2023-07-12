package com.nagarro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nagarro.model.User;
import com.nagarro.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index() {
		
		return "Form";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user) {
		 
		userService.registerUser(user);
		return "Welcome";
	}
}

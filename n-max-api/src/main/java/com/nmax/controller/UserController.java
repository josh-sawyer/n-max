package com.nmax.controller;

import java.util.List;

import com.nmax.model.UserInfo;
import com.nmax.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping()
	public List<UserInfo> fetchUsers() {
		return userService.fetchUsers();
	}
	
	@GetMapping("new")
	public UserInfo newUser() {
		return userService.newUser();
	}
	
}

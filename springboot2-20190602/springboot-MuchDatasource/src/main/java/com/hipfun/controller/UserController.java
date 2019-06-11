package com.hipfun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hipfun.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/insertUser")
	public int insert(String name,Integer age) {
		return userService.insert(name, age);
	}
}

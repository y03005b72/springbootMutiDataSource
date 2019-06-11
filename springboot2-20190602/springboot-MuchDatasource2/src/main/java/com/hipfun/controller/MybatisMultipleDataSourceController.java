package com.hipfun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hipfun.test01.service.UserServiceTest01;
import com.hipfun.test02.service.UserServiceTest02;

//多数据源测试
@RestController
public class MybatisMultipleDataSourceController {
	@Autowired
	private UserServiceTest01 userServiceTest01;

	@Autowired
	private UserServiceTest02 userServiceTest02;

	@RequestMapping("/insertUserTest1")
	public int insertUserTest1(String name, Integer age) {
		return userServiceTest01.insert(name, age);
	}

	@RequestMapping("/insertUserTest2")
	public int insertUserTest2(String name, Integer age) {
		return userServiceTest02.insert(name, age);
	}
}

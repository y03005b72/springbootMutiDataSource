package com.hipfun.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hipfun.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserMapper userMapper;

	@SuppressWarnings("unused")
	@Transactional
	public int insert(String name, Integer age) {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString().replace("-", "");
		int insertUserResult = userMapper.insert(id, name, age);
		int i = 1 / age;
		log.info("#####insertUserResult:{}#####", insertUserResult);
		return insertUserResult;
	}
}

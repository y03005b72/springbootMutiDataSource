package com.hipfun.test01.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hipfun.test01.mapper.UserMapperTest01;

import lombok.extern.slf4j.Slf4j;

/*
 * 
 * */
@Service
@Slf4j
public class UserServiceTest01 {
	@Autowired
	private UserMapperTest01 userMapperTest01;

	@SuppressWarnings("unused")
	@Transactional(transactionManager = "test1TransactionManager")
	public int insert(String name, Integer age) {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString().replace("-", "");
		int insertUserResult = userMapperTest01.insert(id, name, age);
		int i = 1 / age;
		log.info("#####insertUserResult:{}#####", insertUserResult);
		return insertUserResult;
	}
}

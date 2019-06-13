package com.hipfun.test02.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hipfun.test02.mapper.UserMapperTest02;

import lombok.extern.slf4j.Slf4j;

/*
 * 
 * */
@Service
@Slf4j
public class UserServiceTest02 {
	@Autowired
	private UserMapperTest02 userMapperTest02;

	@SuppressWarnings("unused")
	//多数据源要指定事务管理器
	@Transactional(transactionManager = "test2TransactionManager")
	public int insert(String name, Integer age) {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString().replace("-", "");
		int insertUserResult = userMapperTest02.insert(id, name, age);
		int i = 1 / age;
		log.info("#####insertUserResult:{}#####", insertUserResult);
		return insertUserResult;
	}
}

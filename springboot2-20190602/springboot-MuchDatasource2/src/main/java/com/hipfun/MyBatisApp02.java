package com.hipfun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = { "com.hipfun.test01.mapper","com.hipfun.test02.mapper" })
public class MyBatisApp02 {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisApp02.class, args);
	}

}

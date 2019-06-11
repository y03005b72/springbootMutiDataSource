package com.hipfun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.hipfun.mapper" })
public class MyBatisApp01 {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisApp01.class, args);
	}

}

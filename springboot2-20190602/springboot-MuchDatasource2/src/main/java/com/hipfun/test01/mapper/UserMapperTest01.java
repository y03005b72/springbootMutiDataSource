package com.hipfun.test01.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hipfun.entity.User;

//@Mapper
public interface UserMapperTest01 {
	@Select("select * from users where name =#{name}")
	User findByName(@Param("name") String name);

	@Insert("insert into users(id,name,age) value(#{id},#{name},#{age})")
	int insert(@Param("id") String id,@Param("name") String name, @Param("age") Integer age);
}
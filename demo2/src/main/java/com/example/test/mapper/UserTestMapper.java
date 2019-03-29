package com.example.test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import com.example.entity.User;

@CacheConfig(cacheNames="baseCache")
public interface UserTestMapper {
	@Select("SELECT * FROM USER WHERE userid = #{userid}")
	@Cacheable
	User findByName(@Param("userid") String userid);
	@Insert("INSERT INTO USER(userid, username, password, status) VALUES(#{userid}, #{username}, #{password}, #{status})")
	int insert(@Param("userid") Integer userid, @Param("username") String username, @Param("password") String password, @Param("status") String status);

}

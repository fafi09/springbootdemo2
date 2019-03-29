package com.example.test1.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.entity.Student;


public interface StudentMapper {
	@Select("SELECT * FROM student WHERE id = #{userid}")
	Student findByName(@Param("userid") String userid);
	@Insert("INSERT INTO student(id, name, age, status) VALUES(#{userid}, #{username}, #{age}, #{status})")
	int insert(@Param("userid") Integer userid, @Param("username") String username, @Param("age") Integer age, @Param("status") String status);

}

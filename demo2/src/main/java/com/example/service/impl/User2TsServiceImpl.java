package com.example.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.service.User2TsService;
import com.example.test.mapper.UserTestMapper;
import com.example.test1.mapper.StudentMapper;



@Service
public class User2TsServiceImpl implements User2TsService {
	
	private static final Logger log = LoggerFactory.getLogger(User2TsServiceImpl.class);

	@Autowired
	private UserTestMapper userMapper;
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	@Transactional
	public int insert(User user) {
		log.info("insert前");
		userMapper.insert(user.getUserid(), user.getUsername(), user.getPassword(), user.getStatus());
		int i = 2/0;
		studentMapper.insert(user.getUserid(), user.getUsername(), 12, user.getStatus());
		log.info("insert后");
		return 0;
	}

	
}

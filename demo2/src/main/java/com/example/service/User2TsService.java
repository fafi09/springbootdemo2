package com.example.service;

import com.example.entity.User;

public interface User2TsService {
	int insert(User user);
	User findUser(String userId);
}

package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.UserJpa;

public interface UserDao extends JpaRepository<UserJpa, Integer> {

}

package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.UserInfo;
import com.test.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper mapper;
	
	public List<UserInfo> queryAll() {
		return mapper.queryAll();
	}

}

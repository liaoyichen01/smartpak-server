package com.eason.smartpark.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eason.smartpark.bean.User;
import com.eason.smartpark.mapper.UserMapper;
import com.eason.smartpark.server.UserService;

public class UserServiceimpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Integer id) {
		return userMapper.getManagerById(id);
	}

	@Override
	public List<User> getUserList() {
		return userMapper.getUserList();
	}

	@Override
	public int add(User user) {
		return userMapper.add(user);
	}

	@Override
	public int update(Integer id, User user) {
		return userMapper.update(id, user);
	}

	@Override
	public int delete(Integer id) {
		return userMapper.delete(id);
	}

	@Override
	public User getUserByName(String username) {
		return userMapper.getUserByName(username);
	}
}

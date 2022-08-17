package com.pace.wisdom.jdbcdemo.dao;

import java.util.List;

import com.pace.wisdom.jdbcdemo.entity.User;

public interface UserDao {

	public User saveUser(User user);
	public User updateUser();
	public User getById(int id);
	public List<User> getAll();
	public void deleteById(int id);
	
	
}

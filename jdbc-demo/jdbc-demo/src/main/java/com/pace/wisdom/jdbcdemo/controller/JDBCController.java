package com.pace.wisdom.jdbcdemo.controller;

import javax.websocket.server.PathParam;

import com.pace.wisdom.jdbcdemo.dao.UserDao;
import com.pace.wisdom.jdbcdemo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JDBCController {

	@Autowired
	UserDao userDao;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		
		User userResult = userDao.saveUser(user);
		return userResult;
	}
	
	@GetMapping("/user/{id}")
	public User getuserById(@PathVariable("id") int id) {
		
		User user = userDao.getById(id);
		
		return user;
	}
	
	
	@DeleteMapping("/user/{id}")
	public void deleteByid(@PathVariable("id") int id) {
		
		userDao.deleteById(id);
		
	
	}
	
	
	@GetMapping("/test")
	public String test() {
		
		return "Hello Spring boot";
	}
}

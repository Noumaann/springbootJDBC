package com.pace.wisdom.jdbcdemo.dao;

import java.util.List;

import com.pace.wisdom.jdbcdemo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	
	private static final String INSERT_USER_QUERY = "Insert into user (id, fname, lname, email) values (?,?,?,?)";
	private static final String GET_USER_BY_ID = "select * from user where id =?";
	private static final String DELETE_USER_BY_ID = "delete from user where id =?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(" ############### Inside Dao");
		System.out.println("QUERY : " + INSERT_USER_QUERY);
		System.out.println("Usaer : "+  user);
		jdbcTemplate.update(INSERT_USER_QUERY, user.getId(), user.getFname(), user.getLname(), user.getEmail());
		return user;
	}

	@Override
	public User updateUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		/*
		 * User user = jdbcTemplate.queryForObject(GET_USER_BY_ID, User.class, id); User
		 * user = jdbcTemplate.query(GET_USER_BY_ID, );
		 */
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		jdbcTemplate.update(DELETE_USER_BY_ID, id);
		//return user;
	}


}

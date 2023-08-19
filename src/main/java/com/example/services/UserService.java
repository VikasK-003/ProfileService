package com.example.services;

import java.util.List;

import com.example.entities.User;

public interface UserService {
	
	//create
	User saveUser(User user);
	
	//get all users
	List<User> getAllUsers();
	
	//get single user by given user id
	User getUser(String userId);
	

}

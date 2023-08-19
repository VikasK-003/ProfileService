package com.example.services.impl;

import java.util.List;
import java.util.UUID;

import com.example.Exception.ResourceNotFoundException;
import com.example.entities.User;
import com.example.repositories.UserRepository;
import com.example.services.UserService;

public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUserId=UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id : "+userId+" not found on server!!"));
	}

	

}

package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	//fake user service
	List<User> list=List.of(
			new User(1311L,"Pradeep",98765454),
			new User(1312L,"Pritesh",98765652),
			new User(1313l,"Abhishek",88765453)
			
			);
	
	@Override
	public User getUser(Long id) {
		
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}

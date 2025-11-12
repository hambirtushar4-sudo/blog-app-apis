package com.example.demo.services;

import java.util.List;

import com.example.demo.payloads.UserDto;

public interface UserService {
	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto GetUserById(Integer UserId);

	List<UserDto> getAllUsers();

	void deleteUser(Integer userId);

}

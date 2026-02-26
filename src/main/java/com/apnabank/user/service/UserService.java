package com.apnabank.user.service;

import com.apnabank.user.dto.CreateUserRequest;
import com.apnabank.user.dto.UserDto;

public interface UserService {
	
	UserDto createUser(CreateUserRequest createUserRequest);

	UserDto getUserById(Long id);
}

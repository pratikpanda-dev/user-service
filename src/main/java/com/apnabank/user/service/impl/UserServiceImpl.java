package com.apnabank.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnabank.user.dto.CreateUserRequest;
import com.apnabank.user.dto.UserDto;
import com.apnabank.user.entities.User;
import com.apnabank.user.mapper.UserMapper;
import com.apnabank.user.repository.UserRepository;
import com.apnabank.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;

	@Override
    public UserDto createUser(CreateUserRequest request) {
        User user = UserMapper.toEntity(request);
        return UserMapper.toDto(userRepository.save(user));
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.toDto(user);
    }
}

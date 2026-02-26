package com.apnabank.user.mapper;

import com.apnabank.user.dto.UserDto;
import com.apnabank.user.dto.CreateUserRequest;
import com.apnabank.user.entities.User;

public class UserMapper {

    private UserMapper() {}

    public static User toEntity(CreateUserRequest req) {
        User user = new User();
        user.setFullName(req.getFullName());
        user.setEmail(req.getEmail());
        user.setMobile(req.getMobile());
        return user;
    }

    public static UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setFullName(user.getFullName());
        dto.setEmail(user.getEmail());
        dto.setMobile(user.getMobile());
        return dto;
    }
}

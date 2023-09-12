package com.example.server.service.impl;

import com.example.server.dto.UserDto;
import com.example.server.service.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements User {
    @Override
    public List<UserDto> getUsers() {
        UserDto user = new UserDto();
        user.setId("111");
        user.setLogin("admin");
        return List.of(user);
    }

    @Override
    public UserDto getUserByLogin(String login) {
        UserDto user = new UserDto();
        user.setId("111");
        user.setLogin("admin");
        return user;
    }
}

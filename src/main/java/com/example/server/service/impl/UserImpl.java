package com.example.server.service.impl;

import com.example.server.dto.UserDto;
import com.example.server.service.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserImpl implements User {
    @Override
    public List<UserDto> getUsers() {


        List<UserDto> users = new ArrayList<>();
        UserDto user = new UserDto();
        user.setId("111");
        user.setLogin("admin");
        users.add(user);

        UserDto user1 = new UserDto();
        user1.setId("222");
        user1.setLogin("user");
        users.add(user1);

        return users;
    }

    @Override
    public UserDto getUserByLogin(String login) {
        UserDto user = new UserDto();
        user.setId("111");
        user.setLogin("admin");
        return user;
    }
}

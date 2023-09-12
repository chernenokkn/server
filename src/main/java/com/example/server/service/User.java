package com.example.server.service;

import com.example.server.dto.UserDto;

import java.util.List;

public interface User {

    List<UserDto> getUsers();

    UserDto getUserByLogin(String login);
}

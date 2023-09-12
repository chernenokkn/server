package com.example.server.controller;

import com.example.server.dto.UserDto;
import com.example.server.service.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final User user;

    @GetMapping
    public List<UserDto> getUsers() {
        return user.getUsers();
    }
}

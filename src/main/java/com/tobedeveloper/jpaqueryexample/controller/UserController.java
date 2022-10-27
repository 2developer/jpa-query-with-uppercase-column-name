package com.tobedeveloper.jpaqueryexample.controller;

import com.tobedeveloper.jpaqueryexample.entity.UserEntity;
import com.tobedeveloper.jpaqueryexample.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public UserEntity findUserById(@PathVariable("userId") Integer userId) {
        return userService.findUserById(userId);
    }

    @GetMapping("/find/{username}")
    public UserEntity findUserByUsername(@PathVariable("username") String username) {
        return userService.findUserByUsername(username);
    }

}

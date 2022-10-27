package com.tobedeveloper.jpaqueryexample.service;

import com.tobedeveloper.jpaqueryexample.entity.UserEntity;

public interface UserService {
    UserEntity findUserById(Integer userId);
    UserEntity findUserByUsername(String username);
}

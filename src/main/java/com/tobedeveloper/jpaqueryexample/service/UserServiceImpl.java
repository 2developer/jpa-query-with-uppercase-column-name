package com.tobedeveloper.jpaqueryexample.service;

import com.tobedeveloper.jpaqueryexample.entity.UserEntity;
import com.tobedeveloper.jpaqueryexample.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity findUserById(Integer userId) {
        return userRepository.findUserById(userId);
    }

    @Override
    public UserEntity findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}

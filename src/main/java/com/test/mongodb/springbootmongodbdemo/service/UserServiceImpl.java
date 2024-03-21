package com.test.mongodb.springbootmongodbdemo.service;

import com.test.mongodb.springbootmongodbdemo.models.User;
import com.test.mongodb.springbootmongodbdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public String saveUser(User user) {
        return userRepository.save(user).getId();
    }

    @Override
    public Optional<User> getUser(String id) {

        return userRepository.findById(id);

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String id) {

    }
}

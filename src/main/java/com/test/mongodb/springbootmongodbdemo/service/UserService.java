package com.test.mongodb.springbootmongodbdemo.service;

import com.test.mongodb.springbootmongodbdemo.models.User;

import java.util.Optional;

public interface UserService {

     String saveUser(User user);
     Optional<User> getUser(String id);
     void updateUser(User user);
     void deleteUser(String id);
}

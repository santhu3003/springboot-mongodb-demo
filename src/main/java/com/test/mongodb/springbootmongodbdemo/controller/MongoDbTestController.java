package com.test.mongodb.springbootmongodbdemo.controller;

import com.test.mongodb.springbootmongodbdemo.models.User;
import com.test.mongodb.springbootmongodbdemo.repositories.UserRepository;
import com.test.mongodb.springbootmongodbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MongoDbTestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping("/create/user")
    public String saveUserData(@RequestBody User userInput) {
        return userService.saveUser(userInput);
    }

    @GetMapping("/get/userinfo")
    public Optional<User> getUserInfo(@RequestParam("id") String id) {
        return userService.getUser(id);
    }

    @PutMapping("/update/userinfo")
    public String updateUserInfo(@RequestBody User userInput) {
        userService.updateUser(userInput);
        return "Successfully saved data";
    }

    @DeleteMapping("/delete/userinfo")
    public String deleteUser(String id) {
        userService.deleteUser(id);
        return "Successfully saved data";
    }
}

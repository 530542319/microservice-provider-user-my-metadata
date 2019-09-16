package com.baiyu.springCloudTest.controller;

import com.baiyu.springCloudTest.dao.UserRepository;
import com.baiyu.springCloudTest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User one = userRepository.getOne(id);
        return one;
    }
}

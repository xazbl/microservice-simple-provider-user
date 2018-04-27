package com.example.provider.user.web;

import com.example.provider.user.dao.UserRepository;
import com.example.provider.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        User user = userRepository.findOne(id);
        return user;
    }
}

package com.example.springtesting.service;

import com.example.springtesting.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("John");
        return user;
    }
}

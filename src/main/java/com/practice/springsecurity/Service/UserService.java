package com.practice.springsecurity.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.springsecurity.Entity.User;

@Service
public interface UserService {

    List<User> getAllUsers();

    User saveUser(User user);

}

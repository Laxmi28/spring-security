package com.practice.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springsecurity.Entity.User;
import com.practice.springsecurity.Service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
  
    @GetMapping("/user")
    private List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/csrf-token")
    private CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf") ;
    }
    
    @PostMapping("/user")
    private ResponseEntity<User> saveUser(@RequestBody User user){
       User savedUser = userService.saveUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.OK);

    }

}

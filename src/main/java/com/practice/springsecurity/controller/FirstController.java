package com.practice.springsecurity.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class FirstController {
    

    @GetMapping("/")
    public String welcome(HttpServletRequest servlet) {
        return "Hello welcome to the page " + servlet.getSession().getId();
    }
    
}

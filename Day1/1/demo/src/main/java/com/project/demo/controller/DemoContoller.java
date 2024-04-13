package com.project.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {
    @GetMapping("/welcome")
    public String getMethodName() {
        return new String("Welcome Spring Boot!");
    }

}

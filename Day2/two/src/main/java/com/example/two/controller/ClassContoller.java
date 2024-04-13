package com.example.two.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.two.model.Classs;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ClassContoller {
    @GetMapping("/path")
    public Classs getMethodName() {
        return new Classs("Nithish",20);
    }
    
}

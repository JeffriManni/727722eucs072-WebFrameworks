package com.example.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.one.config.ValueCongif;

@RestController
public class ValueController {
    @Autowired
    public ValueCongif config;
    @GetMapping("/info")
    public String getConfig()
    {
        return "App Name: " + config.getAppName() + ",Version: " + config.getAppVersion();
    }
}

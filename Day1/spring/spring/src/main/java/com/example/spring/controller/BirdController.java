package com.example.spring.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.spring.BirdService;
import com.example.spring.CseB;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/land")
public class BirdController {

    // @Autowired
    // public BirdService birdService;//FIeld injection

    public BirdService birdService;

    public BirdController(BirdService se)    //constructor injection this is good practise//constructor injection
    {
        birdService=se;
    }
    
    @GetMapping("/species/{url}")
    public CseB getMethodName(@PathVariable("url") String url) {
        return birdService.getCseB(url);
    }
    
}

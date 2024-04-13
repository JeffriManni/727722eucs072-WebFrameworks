package com.example.spring;

import org.springframework.stereotype.Service;

@Service
public class BirdService {

    public CseB getCseB(String url)
    {
        return new CseB(100, "Computer",url);
    }
    
}

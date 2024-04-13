package com.project.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Address;

@RestController
public class AddressController {

    @GetMapping("/address")
    public Address hello() {
        return new Address(123, "Main St");
    }
}

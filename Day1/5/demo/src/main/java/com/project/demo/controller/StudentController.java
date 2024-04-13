package com.project.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Student;

import java.util.*;

@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> hello() {
        List<Student> l = new ArrayList<>();
        l.add(new Student("John", "Welcome, John!"));
        return l;
    }
}
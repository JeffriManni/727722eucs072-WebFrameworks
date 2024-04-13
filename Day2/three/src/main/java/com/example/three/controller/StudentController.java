package com.example.three.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.three.model.Student;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStu()
    {
        Student s= new Student();
        s.setId(1L);
        s.setName("John Doe");
        s.setDescription("This is a student description");
        return s;
    }
}

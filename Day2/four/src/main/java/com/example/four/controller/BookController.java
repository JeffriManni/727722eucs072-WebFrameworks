package com.example.four.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.four.model.Book;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book book()
    {
        return new Book("The Great Soldier", "G.Gyan");
    }
}

package com.example.two.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Classs {
    @JsonProperty("Student Created: ")
    private String name;
    @JsonProperty("Age: ")
    private int age;
    public Classs(String a,int b){
        this.name=a;
        this.age=b;
    }
}

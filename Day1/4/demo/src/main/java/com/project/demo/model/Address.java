package com.project.demo.model;

public class Address {
    public String name = "nis";
    public int doorNo;
    public String streetName;
    public int pincode = 123;
    public String area = "hel";
    public String district = "hel";
    public String state = "hel";
    public String country = "hel";

    public Address(int d, String s) {
        this.doorNo = d;
        this.streetName = s;
    }
}

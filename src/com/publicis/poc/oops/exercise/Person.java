package com.publicis.poc.oops.exercise;

public class Person {
    protected String name;
    protected String phone;
    protected String email; //Or we can use getter

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

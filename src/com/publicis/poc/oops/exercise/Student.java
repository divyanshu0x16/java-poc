package com.publicis.poc.oops.exercise;

public class Student extends Person{
    private String college;
    private String currentClass;

    public Student(String name, String phone, String email, String college, String currentClass) {
        super(name, phone, email);
        this.college = college;
        this.currentClass = currentClass;
    }
}

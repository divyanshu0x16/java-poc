package com.publicis.poc.oops.exercise;

public class Employee extends Person{
    private String title;
    private String employer;
    private String employeeGrade;
    private int salary;

    //Since this extends Peron, that constructor is called first, then followed by Employee
    //super() gets called by default
    public Employee(String name, String phone, String email, String title, String employer, String employeeGrade, int salary) {
        super(name, phone, email);
        this.title = title;
        this.employer = employer;
        this.employeeGrade = employeeGrade;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.name + '\'' +
                ", phone='" + super.phone + '\'' +
                ", email='" + super.email + '\'' +
                ", title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employeeGrade='" + employeeGrade + '\'' +
                ", salary=" + salary +
                '}';
    }
}

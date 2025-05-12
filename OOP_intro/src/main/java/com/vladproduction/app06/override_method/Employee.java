package com.vladproduction.app06.override_method;

public class Employee extends Person{

    private String role;

    public Employee(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void greeting() {
        System.out.println("Hi there, my name is " + super.getName() + " I`m " + role);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                "} " + super.toString();
    }
}

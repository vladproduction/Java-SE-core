package com.vladproduction.assignment1;

public class Employee {

    String name;
    int age;
    double salary;
    StateLocation location;

    public Employee(String name, int age, double salary, StateLocation location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public void raiseSalary(){
        this.salary = this.salary * 1.2;
        System.out.println("Salary after raise for " + this.name + " is now: " + this.salary);
    }
}

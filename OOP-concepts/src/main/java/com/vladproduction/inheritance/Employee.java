package com.vladproduction.inheritance;

//Base class (parent)
public class Employee {

    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public void work() {
        System.out.println(name + " is working...");
    }

    public double calculateSalary() {
        return baseSalary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}

package com.vladproduction.inheritance;

/**
 * respective getter methods from the Person superclass, providing access to the name and age attributes;
 * using super.getName() and super.getAge(), we are accessing the inherited data through the designated methods in the superclass,
 *      maintaining encapsulation;
 * */
public class Employee extends Person{
    private final int id;
    protected double salary; //protected in case to get access for subclasses inherited attributes

    public Employee(int id, String name, double salary, int age) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(){
        this.salary = this.salary * 1.2; //raising after call this function on 20%
    }

}

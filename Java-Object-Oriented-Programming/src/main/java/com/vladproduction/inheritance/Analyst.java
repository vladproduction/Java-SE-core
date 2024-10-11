package com.vladproduction.inheritance;

public class Analyst extends Employee{

    public Analyst(int id, String name, double salary, int age) {
        super(id, name, salary, age);
    }

    public double getAnnualBonus(){
//        return this.salary * .5;
        return super.salary * .5;
    }
}

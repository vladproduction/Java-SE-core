package com.vladproduction.inheritance;

public class Salesman extends Employee{

    private double commissionPercentage;

    public Salesman(int id, String name, double salary, int age, double commissionPercentage) {
        super(id, name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void raiseCommission(){
        if(this.commissionPercentage < .30){ //raising in case of commission value is less 0.30
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}

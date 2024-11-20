package com.vladproduction.hiding_fields;

public class Vehicle {

    protected int maxSpeed = 100;

    public void showSpeed(){
        System.out.println("Vehicle showSpeed()method of max speed: " + maxSpeed);
    }

}

package com.vladproduction.change_access_modifier.pack1;

public class Vehicle {
    protected int maxSpeed = 230;
    protected void showSpeed() {
        System.out.println(maxSpeed);
    }
}
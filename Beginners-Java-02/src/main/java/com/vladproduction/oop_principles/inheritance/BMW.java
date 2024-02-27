package com.vladproduction.oop_principles.inheritance;

public class BMW extends Car{

    private boolean isMPerformance = false;

    public BMW(String model, float weight, String color, boolean isWork, short speed, boolean isMPerformance) {
        super(model, weight, color, isWork);
        this.speed = speed;
        this.isMPerformance = isMPerformance;
    }
}

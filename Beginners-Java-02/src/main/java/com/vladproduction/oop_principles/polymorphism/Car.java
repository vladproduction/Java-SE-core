package com.vladproduction.oop_principles.polymorphism;

public class Car {

    private String model;
    protected short speed;
    private float weight;
    private String color;
    private boolean isWork;

    public Car(short speed){
        this.speed = speed;
    }

    public Car(String model, float weight, String color, boolean isWork) {
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
//        printAll();
    }

    public Car() {
        System.out.println("object created".toUpperCase() + "\n");
    }

    public void setAll(String model, float weight, String color, boolean  isWork){
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
    }

    public void printAll(){
        String isWork = this.isWork ? "started" : "not started";
        System.out.println("Car: " + this.model +
                " (speed: " + this.speed +
                "; weight: " + this.weight +
                "; color: " + this.color +
                ") // engine: " + isWork);
    }

}

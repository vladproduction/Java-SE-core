package com.vladproduction.oop_class_object_constructor;

public class CarModel {

    private String model;
    short speed;
    private float weight;
    private String color;
    private boolean isWork;

    public CarModel(short speed){
        this.speed = speed;
    }

    public CarModel(String model, float weight, String color, boolean isWork) {
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
        printAll();
    }

    public CarModel() {
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

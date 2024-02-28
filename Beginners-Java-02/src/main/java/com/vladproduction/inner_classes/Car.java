package com.vladproduction.inner_classes;

abstract class Car {

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

    abstract void howToStartEngine();

    class Driving{
        private boolean isDrive;

        public Driving(boolean isDrive) {
            this.isDrive = isDrive;
        }

        void drive(){
            System.out.println(this.isDrive);
        }
    }

    Driving engine = new Driving(true);

}

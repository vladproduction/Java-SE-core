package com.vladproduction.oop_principles.polymorphism;

public class BMW extends Car {

    private boolean isMPerformance = false;

    public static int number = 90; // no need to create object, could use directly from the class instance

    public BMW(String model, float weight, String color, boolean isWork, short speed, boolean isMPerformance) {
        super(model, weight, color, isWork);
        super.speed = speed;
        this.isMPerformance = isMPerformance;
    }

    public void printAll(){
        super.printAll();
        String isMPerformance = this.isMPerformance ? "This car is " : "No, this car isn`t ";
        System.out.println("Car: " + isMPerformance + " M Performance".toUpperCase());
    }

    public static void printTest(){ // static function example;
        System.out.println("Test static function");
    }
}

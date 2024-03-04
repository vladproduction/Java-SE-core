package com.vladproduction.vp15_methods;

public class MethodsMain {
    public static void main(String[] args) {

        CarClass car1 = new CarClass();
        car1.model = "BMW";
        car1.year = 2024;
        car1.info();

        CarClass car2 = new CarClass();
        car2.maxSpeed(245.0);



    }
}

class CarClass{
    String model;
    int year;
    void info(){
        System.out.println("car info:".toUpperCase());
        System.out.println("Model: " + model + "; year: " + year);
    }
    void maxSpeed(double speed){
        System.out.println("Max speed: " + speed);
    }
}

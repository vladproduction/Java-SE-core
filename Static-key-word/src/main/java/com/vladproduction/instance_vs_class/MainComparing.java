package com.vladproduction.instance_vs_class;

public class MainComparing {
    public static void main(String[] args) {
        CarInstance carInstance1 = new CarInstance();
        CarInstance carInstance2 = new CarInstance();
        CarInstance carInstance3 = new CarInstance();
        System.out.println("Amount of cars (instance approach): " + carInstance3.getCountCars()); //1

        CarClass carClass1 = new CarClass();
        CarClass carClass2 = new CarClass();
        CarClass carClass3 = new CarClass();
        System.out.println("Amount of cars (class approach with static): " + CarClass.getAmountCarsCreated()); //3
    }
}

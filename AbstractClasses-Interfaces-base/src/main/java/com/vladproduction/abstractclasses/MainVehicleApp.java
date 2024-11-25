package com.vladproduction.abstractclasses;

/**
 * In the Main class, we create a reference of type Vehicle, and initialize it with an object of the SportCar subclass,
 * on which we then call the drive( ) method.
 * Everything works correctly - dynamic polymorphism.
 * */
public class MainVehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new SportCar();
        vehicle.drive();
        //Sport car is drive
    }
}

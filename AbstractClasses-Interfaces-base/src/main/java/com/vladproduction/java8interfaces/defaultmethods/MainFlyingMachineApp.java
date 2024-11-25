package com.vladproduction.java8interfaces.defaultmethods;

/**
 * Let's consider an example in which we describe the FlyingMachine interface:
 * with abstract methods for takeoff blastOff() and landing landing()
 * by default: makeTravel() – flight from one point to another; and fly() – flight along the echelon
 * These methods have an implementation, because their operation does not depend much on the type of aircraft.
 * Let's describe the Plane aircraft class, which implements the FlyingMachine interface, to work with which it is enough
 * to override only the abstract methods of the interface, and the class can be used.
 * In the MainFlyingMachineApp class, we create a reference of the FlyingMachine interface type and initialize it with an object of the Plane class,
 * then call the makeTravel() method. The code works correctly.
 * */
public class MainFlyingMachineApp {
    public static void main(String[] args) {
        FlyingMachine plane = new Plane();
        plane.makeTravel();
    }
}

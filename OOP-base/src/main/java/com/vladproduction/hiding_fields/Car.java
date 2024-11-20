package com.vladproduction.hiding_fields;

public class Car extends Vehicle {

    // New field in the subclass that shadows the superclass field
    protected int maxSpeed = 200;

    // Method to show the speed of the Car, using 'super' to access the parent's field
    public void showCarSpeed() {
        // Accessing the shadowed field in the subclass
        System.out.println("Car (subclass) max speed: " + maxSpeed);

        // Accessing the field in the superclass
        System.out.println("Vehicle (superclass) max speed (using super): " + super.maxSpeed);
    }
}

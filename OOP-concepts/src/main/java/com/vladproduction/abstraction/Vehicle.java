package com.vladproduction.abstraction;

public abstract class Vehicle {

    private final String brand;
    private final String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract method - no implementation
    public abstract void accelerate();

    // Concrete method with implementation
    public void displayInfo() {
        System.out.println("Vehicle: " + brand + " " + model);
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }

}

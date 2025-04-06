package com.vladproduction.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        // Cannot instantiate abstract class
        // Vehicle vehicle = new Vehicle("Generic", "Vehicle"); // Compile error

        // Using the concrete implementation
        ElectricCar tesla = new ElectricCar("Tesla", "Model S");
        tesla.displayInfo();
        tesla.accelerate();
        System.out.println("Battery level: " + tesla.getBatteryLevel() + "%");
        tesla.charge();
        System.out.println("Battery level after charging: " + tesla.getBatteryLevel() + "%");

    }
}

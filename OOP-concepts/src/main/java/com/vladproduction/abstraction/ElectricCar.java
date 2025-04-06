package com.vladproduction.abstraction;

public class ElectricCar extends Vehicle implements ElectricVehicle {

    private int batteryLevel;

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.batteryLevel = 100;
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car accelerating silently...");
        batteryLevel -= 5;
    }

    @Override
    public void charge() {
        System.out.println("Charging electric car...");
        batteryLevel = 100;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }


}

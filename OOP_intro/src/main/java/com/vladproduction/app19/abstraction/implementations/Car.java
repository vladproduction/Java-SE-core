package com.vladproduction.app19.abstraction.implementations;

import com.vladproduction.app19.abstraction.interfaces.Vehicle;

/**
 * Concrete implementation of the Vehicle interface for Car
 * Demonstrates how abstraction hides implementation details
 */
public class Car implements Vehicle {
    private boolean isRunning;
    private int currentSpeed;
    private final String model;
    private final int maxSpeed;
    
    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.isRunning = false;
        this.currentSpeed = 0;
    }
    
    @Override
    public void start() {
        if (!isRunning) {
            System.out.println("Car engine starting... ignition... running!");
            isRunning = true;
        } else {
            System.out.println("Car is already running");
        }
    }
    
    @Override
    public void stop() {
        if (isRunning) {
            if (currentSpeed > 0) {
                System.out.println("Bringing the car to a stop first...");
                currentSpeed = 0;
            }
            System.out.println("Car engine stopped");
            isRunning = false;
        } else {
            System.out.println("Car is already stopped");
        }
    }
    
    @Override
    public void accelerate(int speed) {
        if (!isRunning) {
            System.out.println("Cannot accelerate. Car is not running!");
            return;
        }
        
        if (currentSpeed + speed > maxSpeed) {
            currentSpeed = maxSpeed;
            System.out.println("Reached maximum speed of " + maxSpeed + " km/h");
        } else {
            currentSpeed += speed;
            System.out.println("Car accelerating to " + currentSpeed + " km/h");
        }
    }
    
    @Override
    public void brake() {
        if (currentSpeed > 0) {
            currentSpeed = Math.max(0, currentSpeed - 20);
            System.out.println("Braking... Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Car is already stationary");
        }
    }
    
    @Override
    public void honk() {
        System.out.println("Car horn: Beep! Beep!");
    }
    
    @Override
    public String getStatus() {
        return "Car{" +
                "model='" + model + '\'' +
                ", isRunning=" + isRunning +
                ", currentSpeed=" + currentSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
    
    // Car-specific method (not part of the Vehicle interface)
    public void switchAirConditioner(boolean on) {
        if (isRunning) {
            System.out.println("Air conditioner turned " + (on ? "on" : "off"));
        } else {
            System.out.println("Cannot use AC when car is not running");
        }
    }
}
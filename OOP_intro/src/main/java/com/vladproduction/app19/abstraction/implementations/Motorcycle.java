package com.vladproduction.app19.abstraction.implementations;

import com.vladproduction.app19.abstraction.interfaces.Vehicle;

/**
 * Concrete implementation of the Vehicle interface for Motorcycle
 */
public class Motorcycle implements Vehicle {
    private boolean isRunning;
    private int currentSpeed;
    private final String model;
    private final int maxSpeed;
    private boolean standDeployed;
    
    public Motorcycle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.isRunning = false;
        this.currentSpeed = 0;
        this.standDeployed = true;
    }
    
    @Override
    public void start() {
        if (standDeployed) {
            System.out.println("Cannot start motorcycle while stand is deployed!");
            return;
        }
        
        if (!isRunning) {
            System.out.println("Motorcycle engine starting... vroom!");
            isRunning = true;
        } else {
            System.out.println("Motorcycle is already running");
        }
    }
    
    @Override
    public void stop() {
        if (isRunning) {
            if (currentSpeed > 0) {
                System.out.println("Bringing the motorcycle to a stop first...");
                currentSpeed = 0;
            }
            System.out.println("Motorcycle engine stopped");
            isRunning = false;
        } else {
            System.out.println("Motorcycle is already stopped");
        }
    }
    
    @Override
    public void accelerate(int speed) {
        if (!isRunning) {
            System.out.println("Cannot accelerate. Motorcycle is not running!");
            return;
        }
        
        if (currentSpeed + speed > maxSpeed) {
            currentSpeed = maxSpeed;
            System.out.println("Reached maximum speed of " + maxSpeed + " km/h");
        } else {
            currentSpeed += speed;
            System.out.println("Motorcycle accelerating to " + currentSpeed + " km/h");
        }
    }
    
    @Override
    public void brake() {
        if (currentSpeed > 0) {
            currentSpeed = Math.max(0, currentSpeed - 15);
            System.out.println("Braking... Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Motorcycle is already stationary");
        }
    }
    
    @Override
    public void honk() {
        System.out.println("Motorcycle horn: Beep!");
    }
    
    @Override
    public String getStatus() {
        return "Motorcycle{" +
                "model='" + model + '\'' +
                ", isRunning=" + isRunning +
                ", currentSpeed=" + currentSpeed +
                ", maxSpeed=" + maxSpeed +
                ", standDeployed=" + standDeployed +
                '}';
    }
    
    // Motorcycle-specific methods (not part of the Vehicle interface)
    public void deployStand(boolean deploy) {
        if (currentSpeed > 0) {
            System.out.println("Cannot deploy stand while moving!");
        } else {
            this.standDeployed = deploy;
            System.out.println("Stand " + (deploy ? "deployed" : "retracted"));
        }
    }
    
    public void wheelie() {
        if (isRunning && currentSpeed > 20) {
            System.out.println("Performing a wheelie! Front wheel in the air!");
        } else {
            System.out.println("Cannot perform wheelie. Need to be running at speed > 20 km/h");
        }
    }
}
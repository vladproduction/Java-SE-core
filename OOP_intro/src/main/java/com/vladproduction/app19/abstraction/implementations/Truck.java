package com.vladproduction.app19.abstraction.implementations;

import com.vladproduction.app19.abstraction.interfaces.Vehicle;

/**
 * Concrete implementation of the Vehicle interface for Truck
 */
public class Truck implements Vehicle {
    private boolean isRunning;
    private int currentSpeed;
    private final String model;
    private final int maxSpeed;
    private boolean cargoLoaded;
    private final int maxCargoWeight;
    private int currentCargoWeight;
    
    public Truck(String model, int maxSpeed, int maxCargoWeight) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxCargoWeight = maxCargoWeight;
        this.isRunning = false;
        this.currentSpeed = 0;
        this.cargoLoaded = false;
        this.currentCargoWeight = 0;
    }
    
    @Override
    public void start() {
        if (!isRunning) {
            System.out.println("Truck engine starting... diesel rumbling sound");
            isRunning = true;
        } else {
            System.out.println("Truck is already running");
        }
    }
    
    @Override
    public void stop() {
        if (isRunning) {
            if (currentSpeed > 0) {
                System.out.println("Bringing the truck to a stop first...");
                currentSpeed = 0;
            }
            System.out.println("Truck engine stopped");
            isRunning = false;
        } else {
            System.out.println("Truck is already stopped");
        }
    }
    
    @Override
    public void accelerate(int speed) {
        if (!isRunning) {
            System.out.println("Cannot accelerate. Truck is not running!");
            return;
        }
        
        // Adjust acceleration based on cargo weight
        int effectiveAcceleration = speed;
        if (currentCargoWeight > 0) {
            // Reduce acceleration proportionally to cargo weight
            double weightFactor = 1.0 - ((double)currentCargoWeight / maxCargoWeight) * 0.5; 
            effectiveAcceleration = (int)(speed * weightFactor);
            System.out.println("Heavy cargo affecting acceleration (reduced by " + 
                              (int)((1-weightFactor)*100) + "%)");
        }
        
        if (currentSpeed + effectiveAcceleration > maxSpeed) {
            currentSpeed = maxSpeed;
            System.out.println("Reached maximum speed of " + maxSpeed + " km/h");
        } else {
            currentSpeed += effectiveAcceleration;
            System.out.println("Truck accelerating to " + currentSpeed + " km/h");
        }
    }
    
    @Override
    public void brake() {
        if (currentSpeed > 0) {
            // Heavier trucks brake more slowly
            int brakeAmount = 10;
            if (currentCargoWeight > 0) {
                double weightFactor = 1.0 - ((double)currentCargoWeight / maxCargoWeight) * 0.5;
                brakeAmount = (int)(brakeAmount * weightFactor);
            }
            
            currentSpeed = Math.max(0, currentSpeed - brakeAmount);
            System.out.println("Braking... Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Truck is already stationary");
        }
    }
    
    @Override
    public void honk() {
        System.out.println("Truck horn: HOOOONK! HOOOONK!");
    }
    
    @Override
    public String getStatus() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", isRunning=" + isRunning +
                ", currentSpeed=" + currentSpeed +
                ", maxSpeed=" + maxSpeed +
                ", cargoLoaded=" + cargoLoaded +
                ", currentCargoWeight=" + currentCargoWeight +
                ", maxCargoWeight=" + maxCargoWeight +
                '}';
    }
    
    // Truck-specific methods (not part of the Vehicle interface)
    public void loadCargo(int weight) {
        if (weight <= 0) {
            System.out.println("Invalid cargo weight");
            return;
        }
        
        if (currentSpeed > 0) {
            System.out.println("Cannot load cargo while the truck is moving!");
            return;
        }
        
        if (currentCargoWeight + weight > maxCargoWeight) {
            System.out.println("Cannot load cargo. Would exceed maximum weight of " + maxCargoWeight + " kg");
        } else {
            currentCargoWeight += weight;
            cargoLoaded = currentCargoWeight > 0;
            System.out.println("Loaded " + weight + " kg of cargo. Current cargo: " + currentCargoWeight + " kg");
        }
    }
    
    public void unloadCargo(int weight) {
        if (weight <= 0) {
            System.out.println("Invalid cargo weight");
            return;
        }
        
        if (currentSpeed > 0) {
            System.out.println("Cannot unload cargo while the truck is moving!");
            return;
        }
        
        if (weight > currentCargoWeight) {
            System.out.println("Cannot unload more cargo than currently loaded (" + currentCargoWeight + " kg)");
        } else {
            currentCargoWeight -= weight;
            cargoLoaded = currentCargoWeight > 0;
            System.out.println("Unloaded " + weight + " kg of cargo. Remaining cargo: " + currentCargoWeight + " kg");
        }
    }
}
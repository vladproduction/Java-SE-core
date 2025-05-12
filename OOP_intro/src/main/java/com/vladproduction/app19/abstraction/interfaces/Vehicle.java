package com.vladproduction.app19.abstraction.interfaces;

/**
 * Vehicle interface that defines the common behaviors for all vehicles
 * This is an example of abstraction - hiding implementation details and showing only functionality
 */
public interface Vehicle {

    // Constants (implicitly public, static, and final)
    int DEFAULT_MAX_SPEED = 120;

    // Abstract methods (implicitly public and abstract)
    void start();

    void stop();

    void accelerate(int speed);

    void brake();

    // Default method added in Java 8+
    default void honk() {
        System.out.println("Generic honking sound");
    }

    // Static method added in Java 8+
    static String getVehicleType() {
        return "Generic Vehicle";
    }

    // Method to return current state
    String getStatus();
}
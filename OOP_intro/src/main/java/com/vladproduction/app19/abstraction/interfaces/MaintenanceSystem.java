package com.vladproduction.app19.abstraction.interfaces;

/**
 * Interface for vehicle maintenance systems
 * Demonstrates how interfaces can be used to define functionality without implementation
 */
public interface MaintenanceSystem {

    // Constants
    int ROUTINE_CHECK_INTERVAL = 5000; // in kilometers/miles

    // Abstract methods
    void performRoutineCheck();

    void repairVehicle();

    boolean isMaintenanceRequired();

    // Default method
    default void displayMaintenanceSchedule() {
        System.out.println("Standard maintenance needed every " + ROUTINE_CHECK_INTERVAL + " kilometers/miles");
    }
}
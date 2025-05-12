package com.vladproduction.app19.abstraction.maintenance;

import com.vladproduction.app19.abstraction.implementations.Car;
import com.vladproduction.app19.abstraction.interfaces.MaintenanceSystem;

/**
 * Concrete implementation of the MaintenanceSystem interface for Car maintenance
 */
public class CarMaintenance implements MaintenanceSystem {
    private final Car car;
    private int mileage;
    private int lastMaintenanceMileage;
    
    public CarMaintenance(Car car) {
        this.car = car;
        this.mileage = 0;
        this.lastMaintenanceMileage = 0;
    }
    
    public void addMileage(int distance) {
        if (distance > 0) {
            this.mileage += distance;
            System.out.println("Car mileage updated: " + mileage + " km");
        }
    }
    
    @Override
    public void performRoutineCheck() {
        System.out.println("Performing routine car maintenance check:");
        System.out.println("- Checking engine oil level");
        System.out.println("- Inspecting brake pads");
        System.out.println("- Examining tire pressure and tread depth");
        System.out.println("- Testing battery voltage");
        System.out.println("- Checking all lights and signals");
        
        lastMaintenanceMileage = mileage;
        System.out.println("Car maintenance completed at " + mileage + " km");
    }
    
    @Override
    public void repairVehicle() {
        System.out.println("Repairing car:");
        System.out.println("- Diagnosing issues with computer system");
        System.out.println("- Replacing worn parts");
        System.out.println("- Performing engine tuning");
        System.out.println("- Testing systems functionality");
        
        System.out.println("Car repairs completed");
    }
    
    @Override
    public boolean isMaintenanceRequired() {
        int mileageSinceLastMaintenance = mileage - lastMaintenanceMileage;
        boolean required = mileageSinceLastMaintenance >= ROUTINE_CHECK_INTERVAL;
        
        if (required) {
            System.out.println("Car is due for maintenance! " + 
                              mileageSinceLastMaintenance + " km since last maintenance");
        } else {
            System.out.println("Car maintenance not yet required. " + 
                              (ROUTINE_CHECK_INTERVAL - mileageSinceLastMaintenance) + 
                              " km remaining until next service");
        }
        
        return required;
    }
    
    @Override
    public void displayMaintenanceSchedule() {
        System.out.println("Car Maintenance Schedule:");
        System.out.println("- Oil change: Every 5,000 km");
        System.out.println("- Brake inspection: Every 10,000 km");
        System.out.println("- Air filter replacement: Every 15,000 km");
        System.out.println("- Full service: Every " + ROUTINE_CHECK_INTERVAL + " km");
    }
    
    // Car-specific maintenance method
    public void performOilChange() {
        System.out.println("Performing oil change for the car");
        System.out.println("- Draining old oil");
        System.out.println("- Replacing oil filter");
        System.out.println("- Adding new synthetic oil");
        System.out.println("Oil change completed");
    }
}
package com.vladproduction.app19.abstraction.maintenance;

import com.vladproduction.app19.abstraction.implementations.Motorcycle;
import com.vladproduction.app19.abstraction.interfaces.MaintenanceSystem;

/**
 * Concrete implementation of the MaintenanceSystem interface for Motorcycle maintenance
 */
public class MotorcycleMaintenance implements MaintenanceSystem {
    private final Motorcycle motorcycle;
    private int mileage;
    private int lastMaintenanceMileage;
    private boolean chainLubricated;
    
    public MotorcycleMaintenance(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
        this.mileage = 0;
        this.lastMaintenanceMileage = 0;
        this.chainLubricated = true; // Assume new motorcycle has a lubricated chain
    }
    
    public void addMileage(int distance) {
        if (distance > 0) {
            this.mileage += distance;
            
            // Chain needs lubrication every 500km
            if (mileage - getLastChainLubricationMileage() > 500) {
                chainLubricated = false;
            }
            
            System.out.println("Motorcycle mileage updated: " + mileage + " km");
        }
    }
    
    private int getLastChainLubricationMileage() {
        // Simple calculation for demonstration purposes
        return lastMaintenanceMileage;
    }
    
    @Override
    public void performRoutineCheck() {
        System.out.println("Performing routine motorcycle maintenance check:");
        System.out.println("- Checking chain tension and lubrication");
        System.out.println("- Inspecting brake pads and fluid");
        System.out.println("- Examining tire pressure and tread depth");
        System.out.println("- Testing lights and signals");
        System.out.println("- Checking suspension");
        
        // Reset maintenance flags
        lastMaintenanceMileage = mileage;
        chainLubricated = true;
        
        System.out.println("Motorcycle maintenance completed at " + mileage + " km");
    }
    
    @Override
    public void repairVehicle() {
        System.out.println("Repairing motorcycle:");
        System.out.println("- Diagnosing electrical and mechanical issues");
        System.out.println("- Replacing worn parts");
        System.out.println("- Adjusting valve clearance");
        System.out.println("- Testing systems functionality");
        
        System.out.println("Motorcycle repairs completed");
    }
    
    @Override
    public boolean isMaintenanceRequired() {
        int mileageSinceLastMaintenance = mileage - lastMaintenanceMileage;
        
        // Motorcycles need more frequent maintenance than cars
        int motorcycleCheckInterval = ROUTINE_CHECK_INTERVAL / 2;
        boolean required = mileageSinceLastMaintenance >= motorcycleCheckInterval || !chainLubricated;
        
        if (required) {
            if (!chainLubricated) {
                System.out.println("Motorcycle chain needs lubrication!");
            }
            
            if (mileageSinceLastMaintenance >= motorcycleCheckInterval) {
                System.out.println("Motorcycle is due for maintenance! " + 
                                  mileageSinceLastMaintenance + " km since last maintenance");
            }
        } else {
            System.out.println("Motorcycle maintenance not yet required. " + 
                              (motorcycleCheckInterval - mileageSinceLastMaintenance) + 
                              " km remaining until next service");
        }
        
        return required;
    }
    
    @Override
    public void displayMaintenanceSchedule() {
        System.out.println("Motorcycle Maintenance Schedule:");
        System.out.println("- Chain lubrication: Every 500 km");
        System.out.println("- Oil change: Every 2,500 km");
        System.out.println("- Brake inspection: Every 2,500 km");
        System.out.println("- Valve adjustment: Every 12,000 km");
        System.out.println("- Full service: Every " + (ROUTINE_CHECK_INTERVAL / 2) + " km");
    }
    
    // Motorcycle-specific maintenance method
    public void lubricateChain() {
        System.out.println("Lubricating motorcycle chain:");
        System.out.println("- Cleaning chain with brush and solvent");
        System.out.println("- Applying chain lubricant");
        System.out.println("- Wiping excess lubricant");
        chainLubricated = true;
        System.out.println("Chain lubrication completed");
    }
}
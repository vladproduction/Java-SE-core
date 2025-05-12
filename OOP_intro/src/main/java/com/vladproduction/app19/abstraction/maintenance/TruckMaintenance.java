package com.vladproduction.app19.abstraction.maintenance;

import com.vladproduction.app19.abstraction.implementations.Truck;
import com.vladproduction.app19.abstraction.interfaces.MaintenanceSystem;

/**
 * Concrete implementation of the MaintenanceSystem interface for Truck maintenance
 */
public class TruckMaintenance implements MaintenanceSystem {
    private final Truck truck;
    private int mileage;
    private int lastMaintenanceMileage;
    private int engineHours;
    private int lastEngineHoursCheck;

    public TruckMaintenance(Truck truck) {
        this.truck = truck;
        this.mileage = 0;
        this.lastMaintenanceMileage = 0;
        this.engineHours = 0;
        this.lastEngineHoursCheck = 0;
    }

    public void addMileage(int distance) {
        if (distance > 0) {
            this.mileage += distance;

            // Roughly estimate engine hours based on distance
            // Assuming average speed of 60 km/h
            this.engineHours += distance / 60;

            System.out.println("Truck mileage updated: " + mileage + " km");
            System.out.println("Estimated engine hours: " + engineHours + " hours");
        }
    }

    @Override
    public void performRoutineCheck() {
        System.out.println("Performing routine truck maintenance check:");
        System.out.println("- Checking diesel engine and injectors");
        System.out.println("- Inspecting air brake system");
        System.out.println("- Examining tire pressure and tread depth on all wheels");
        System.out.println("- Testing lights, signals, and air horn");
        System.out.println("- Checking cargo area integrity");
        System.out.println("- Inspecting suspension and chassis");

        lastMaintenanceMileage = mileage;
        lastEngineHoursCheck = engineHours;

        System.out.println("Truck maintenance completed at " + mileage + " km and " + engineHours + " engine hours");
    }

    @Override
    public void repairVehicle() {
        System.out.println("Repairing truck:");
        System.out.println("- Diagnosing electrical and mechanical issues");
        System.out.println("- Performing diesel engine repairs");
        System.out.println("- Fixing air brake system");
        System.out.println("- Repairing hydraulic systems");
        System.out.println("- Testing full functionality under load");

        System.out.println("Truck repairs completed");
    }

    @Override
    public boolean isMaintenanceRequired() {
        int mileageSinceLastMaintenance = mileage - lastMaintenanceMileage;
        int engineHoursSinceLastCheck = engineHours - lastEngineHoursCheck;

        // Trucks need maintenance based on either mileage or engine hours
        boolean mileageBasedMaintenanceRequired = mileageSinceLastMaintenance >= ROUTINE_CHECK_INTERVAL;
        boolean hourBasedMaintenanceRequired = engineHoursSinceLastCheck >= 200; // 200 engine hours threshold

        boolean required = mileageBasedMaintenanceRequired || hourBasedMaintenanceRequired;

        if (required) {
            if (mileageBasedMaintenanceRequired) {
                System.out.println("Truck is due for mileage-based maintenance! " +
                        mileageSinceLastMaintenance + " km since last maintenance");
            }

            if (hourBasedMaintenanceRequired) {
                System.out.println("Truck is due for engine hours-based maintenance! " +
                        engineHoursSinceLastCheck + " hours since last check");
            }
        } else {
            System.out.println("Truck maintenance not yet required:");
            System.out.println("- " + (ROUTINE_CHECK_INTERVAL - mileageSinceLastMaintenance) +
                    " km remaining until next mileage-based service");
            System.out.println("- " + (200 - engineHoursSinceLastCheck) +
                    " engine hours remaining until next hour-based service");
        }

        return required;
    }

    @Override
    public void displayMaintenanceSchedule() {
        System.out.println("Truck Maintenance Schedule:");
        System.out.println("- Oil and filter change: Every 20,000 km or 300 engine hours");
        System.out.println("- Air system check: Every 15,000 km");
        System.out.println("- Brake inspection: Every 15,000 km");
        System.out.println("- Tire rotation: Every 25,000 km");
        System.out.println("- Full service: Every " + ROUTINE_CHECK_INTERVAL + " km or 200 engine hours");
    }

    // Truck-specific maintenance methods
    public void checkAirBrakeSystem() {
        System.out.println("Checking truck air brake system:");
        System.out.println("- Testing air pressure buildup time");
        System.out.println("- Inspecting air lines for leaks");
        System.out.println("- Verifying brake chamber function");
        System.out.println("- Testing emergency brake system");
        System.out.println("Air brake system check completed");
    }

    public void inspectUnderHeavyLoad() {
        System.out.println("Inspecting truck performance under heavy load:");
        System.out.println("- Testing engine performance at maximum load");
        System.out.println("- Checking transmission under load");
        System.out.println("- Observing brake effectiveness with full cargo");
        System.out.println("- Monitoring fuel efficiency under load");
        System.out.println("Heavy load inspection completed");
    }
}
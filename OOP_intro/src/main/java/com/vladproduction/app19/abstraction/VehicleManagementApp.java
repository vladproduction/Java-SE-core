package com.vladproduction.app19.abstraction;

import com.vladproduction.app19.abstraction.implementations.Car;
import com.vladproduction.app19.abstraction.implementations.Motorcycle;
import com.vladproduction.app19.abstraction.implementations.Truck;
import com.vladproduction.app19.abstraction.interfaces.MaintenanceSystem;
import com.vladproduction.app19.abstraction.interfaces.Vehicle;
import com.vladproduction.app19.abstraction.maintenance.CarMaintenance;
import com.vladproduction.app19.abstraction.maintenance.MotorcycleMaintenance;
import com.vladproduction.app19.abstraction.maintenance.TruckMaintenance;

import java.util.ArrayList;
import java.util.List;

/**
 * Main application demonstrating the abstraction principle through vehicle management
 */
public class VehicleManagementApp {

    public static void main(String[] args) {
        System.out.println("==== Vehicle Management System ====");
        System.out.println("Demonstrating abstraction in Java OOP");
        System.out.println("----------------------------------------");

        // Create different vehicles
        Car sedan = new Car("Toyota Camry", 180);
        Motorcycle sportBike = new Motorcycle("Kawasaki Ninja", 250);
        Truck deliveryTruck = new Truck("Volvo FH16", 120, 20000);

        // Create maintenance systems
        CarMaintenance sedanMaintenance = new CarMaintenance(sedan);
        MotorcycleMaintenance bikeMaintenance = new MotorcycleMaintenance(sportBike);
        TruckMaintenance truckMaintenance = new TruckMaintenance(deliveryTruck);

        // Store vehicles in a list using the interface type (abstraction)
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(sedan);
        vehicles.add(sportBike);
        vehicles.add(deliveryTruck);

        // Store maintenance systems in a list using the interface type (abstraction)
        List<MaintenanceSystem> maintenanceSystems = new ArrayList<>();
        maintenanceSystems.add(sedanMaintenance);
        maintenanceSystems.add(bikeMaintenance);
        maintenanceSystems.add(truckMaintenance);

        System.out.println("\n==== Demonstrating Vehicle Operations ====");

        // Example 1: Operate vehicles through the abstract interface
        System.out.println("\n--- Operating vehicles through abstract interface ---");
        operateVehicles(vehicles);

        // Example 2: Using specific vehicle implementations
        System.out.println("\n--- Using specific vehicle features ---");
        useSpecificVehicleFeatures(sedan, sportBike, deliveryTruck);

        // Example 3: Managing maintenance through abstract interface
        System.out.println("\n--- Managing maintenance through abstract interface ---");
        performMaintenance(maintenanceSystems);

        // Example 4: Using specific maintenance features
        System.out.println("\n--- Using specific maintenance features ---");
        useSpecificMaintenanceFeatures(sedanMaintenance, bikeMaintenance, truckMaintenance);

        // Example 5: Simulating a road trip to demonstrate abstraction benefits
        System.out.println("\n==== Road Trip Simulation ====");
        simulateRoadTrip(vehicles, maintenanceSystems);

        System.out.println("\n==== End of Demonstration ====");
    }

    /**
     * Demonstrates how we can operate on vehicles through their abstract interface
     * This method doesn't need to know the specific vehicle type
     */
    private static void operateVehicles(List<Vehicle> vehicles) {
        int index = 1;
        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle #" + index + ":");
            vehicle.start();
            vehicle.accelerate(30);
            vehicle.honk();
            vehicle.brake();
            vehicle.stop();
            System.out.println("Status: " + vehicle.getStatus());
            index++;
        }
    }

    /**
     * Demonstrates specific features of each vehicle type
     * This requires knowledge of the concrete implementation
     */
    private static void useSpecificVehicleFeatures(Car car, Motorcycle motorcycle, Truck truck) {
        // Car specific features
        System.out.println("\n- Car specific features:");
        car.start();
        car.switchAirConditioner(true);
        car.stop();

        // Motorcycle specific features
        System.out.println("\n- Motorcycle specific features:");
        motorcycle.deployStand(false);
        motorcycle.start();
        motorcycle.accelerate(30);
        motorcycle.wheelie();
        motorcycle.stop();

        // Truck specific features
        System.out.println("\n- Truck specific features:");
        truck.start();
        truck.loadCargo(5000);
        truck.accelerate(20);
        truck.unloadCargo(5000);
        truck.stop();
    }

    /**
     * Demonstrates how we can manage maintenance through the abstract interface
     * This method doesn't need to know the specific maintenance system type
     */
    private static void performMaintenance(List<MaintenanceSystem> maintenanceSystems) {
        int index = 1;
        for (MaintenanceSystem system : maintenanceSystems) {
            System.out.println("\nMaintenance System #" + index + ":");
            system.displayMaintenanceSchedule();
            system.isMaintenanceRequired();
            system.performRoutineCheck();
            index++;
        }
    }

    /**
     * Demonstrates specific features of each maintenance system type
     * This requires knowledge of the concrete implementation
     */
    private static void useSpecificMaintenanceFeatures(
            CarMaintenance carMaintenance,
            MotorcycleMaintenance motorcycleMaintenance,
            TruckMaintenance truckMaintenance) {

        // Car maintenance specific features
        System.out.println("\n- Car maintenance specific features:");
        carMaintenance.addMileage(2000);
        carMaintenance.performOilChange();

        // Motorcycle maintenance specific features
        System.out.println("\n- Motorcycle maintenance specific features:");
        motorcycleMaintenance.addMileage(600);
        motorcycleMaintenance.lubricateChain();

        // Truck maintenance specific features
        System.out.println("\n- Truck maintenance specific features:");
        truckMaintenance.addMileage(3000);
        truckMaintenance.checkAirBrakeSystem();
        truckMaintenance.inspectUnderHeavyLoad();
    }

    /**
     * Simulates a road trip to demonstrate benefits of abstraction
     * Shows how we can work with different vehicles and maintenance systems
     * through their common interfaces
     */
    private static void simulateRoadTrip(List<Vehicle> vehicles, List<MaintenanceSystem> maintenanceSystems) {
        System.out.println("\n--- Starting a road trip with multiple vehicles ---");

        // Since the lists should be in the same order, we can use the same index for both
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            MaintenanceSystem maintenance = maintenanceSystems.get(i);

            // Pre-trip check (using abstraction)
            System.out.println("\nPre-trip check for " + vehicle.getClass().getSimpleName());
            maintenance.isMaintenanceRequired();

            // Start the trip (using abstraction)
            vehicle.start();
            vehicle.accelerate(60);
            System.out.println("Cruising along the highway...");

            // Stop for a break (using abstraction)
            vehicle.brake();
            System.out.println("Taking a break...");

            // Continue the trip (using abstraction)
            vehicle.accelerate(80);
            System.out.println("Back on the road...");

            // End the trip (using abstraction)
            vehicle.brake();
            vehicle.stop();

            // Add mileage (need to cast to specific type)
            System.out.println("Trip completed. Adding mileage to maintenance record.");
            if (maintenance instanceof CarMaintenance) {
                ((CarMaintenance) maintenance).addMileage(300);
            } else if (maintenance instanceof MotorcycleMaintenance) {
                ((MotorcycleMaintenance) maintenance).addMileage(300);
            } else if (maintenance instanceof TruckMaintenance) {
                ((TruckMaintenance) maintenance).addMileage(300);
            }

            // Post-trip check (using abstraction)
            System.out.println("\nPost-trip check for " + vehicle.getClass().getSimpleName());
            maintenance.isMaintenanceRequired();
        }
    }
}

package com.vladproduction.app07.composition_aggregation_delegation;

/**
 * Main class to demonstrate the vehicle system with
 * composition, aggregation, and inheritance concepts.
 */
public class MainApp {
    public static void main(String[] args) {

        System.out.println("=== Vehicle System Demonstration ===");

        // Using aggregation - create a shared air freshener
        AirFreshener freshener = new AirFreshener("Pine");

        // Create and operate a vehicle with the air freshener (aggregation)
        System.out.println("\n-- Vehicle with Air Freshener --");
        Vehicle car = new Vehicle(freshener);
        car.operate();

        // Create and operate a basic vehicle (composition only)
        System.out.println("\n-- Basic Vehicle --");
        Vehicle basicCar = new Vehicle();
        basicCar.operate();

        // Create and operate a motorcycle (inheritance)
        System.out.println("\n-- Motorcycle --");
        Motorcycle motorcycle = new Motorcycle(freshener);
        motorcycle.operate();

        // The same air freshener can be used in an apartment (shared aggregation)
        System.out.println("\n-- Apartment using same Air Freshener --");
        Apartment apartment = new Apartment(freshener);
        System.out.println("Apartment scent: " + apartment.getInteriorScent());

    }
}

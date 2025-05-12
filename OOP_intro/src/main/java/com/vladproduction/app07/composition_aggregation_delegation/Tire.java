package com.vladproduction.app07.composition_aggregation_delegation;

/**
 * Represents a tire for a vehicle.
 * Part of a composition relationship with Vehicle.
 * Also includes a singleton implementation example (commented).
 */
public class Tire {

    private String model;

    // Singleton pattern - uncomment to use
    /*
    private static Tire instance;

    public static Tire getInstance() {
        if (instance == null) {
            instance = new Tire("Standard");
        }
        return instance;
    }
    */

    /**
     * Create a new tire with the specified model.
     *
     * @param model The tire model
     */
    public Tire(String model) {
        this.model = model;
    }

    /**
     * Simulate tire rotation.
     */
    public void rotate() {
        System.out.println(model + " tire rotating.");
    }

    public String getModel() {
        return model;
    }

}

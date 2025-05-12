package com.vladproduction.app07.composition_aggregation_delegation;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a general vehicle with core components.
 * Demonstrates composition (owns engine and wheels) and
 * aggregation (uses accessories but doesn't own them).
 */
public class Vehicle {

    // Composition: Vehicle fully owns these components
    private final PowerUnit powerUnit;
    private final List<Tire> tires;

    // Aggregation: Vehicle uses but doesn't fully own this component
    private AirFreshener airFreshener;

    /**
     * Create a basic vehicle with required components only.
     * Demonstrates composition relationship.
     */
    public Vehicle() {
        // Composition - Vehicle owns and controls lifecycle of these components
        this.powerUnit = new PowerUnit();
        this.tires = new ArrayList<>();

        // Adding standard number of tires
        for (int i = 0; i < getRequiredTireCount(); i++) {
            this.tires.add(new Tire("Standard"));
        }
    }

    /**
     * Create a vehicle with accessories.
     * Demonstrates both composition and aggregation relationships.
     *
     * @param airFreshener An optional accessory (aggregation example)
     */
    public Vehicle(AirFreshener airFreshener) {
        // Call the default constructor to set up composition parts
        this();

        // Aggregation - Vehicle uses but doesn't control lifecycle
        this.airFreshener = airFreshener;
    }

    /**
     * Operate the vehicle by delegating to its components.
     * Demonstrates delegation pattern.
     */
    public void operate() {
        // Delegation to composed objects
        this.powerUnit.start();

        for (Tire tire : tires) {
            tire.rotate();
        }

        // Using the aggregated object if available
        if (airFreshener != null) {
            System.out.println("Interior smells like: " + airFreshener.getScent());
        }
    }

    /**
     * @return Number of tires this vehicle requires
     */
    protected int getRequiredTireCount() {
        return 4; // Standard 4-wheel vehicle
    }

    /**
     * Check if the vehicle has an air freshener.
     *
     * @return true if the vehicle has an air freshener
     */
    public boolean hasAirFreshener() {
        return airFreshener != null;
    }

}















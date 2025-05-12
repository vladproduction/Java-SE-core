package com.vladproduction.app07.composition_aggregation_delegation;

/**
 * Represents a power source for a vehicle.
 * Part of a composition relationship with Vehicle.
 */
public class PowerUnit {

    private final String type;

    public PowerUnit() {
        this.type = "Standard Engine";
    }

    public PowerUnit(String type) {
        this.type = type;
    }

    /**
     * Start the power unit.
     */
    public void start() {
        System.out.println(type + " started and running");
    }

    public String getType() {
        return type;
    }
}

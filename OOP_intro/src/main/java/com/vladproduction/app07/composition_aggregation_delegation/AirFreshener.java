package com.vladproduction.app07.composition_aggregation_delegation;

/**
 * Represents an air freshener accessory.
 * Part of an aggregation relationship with Vehicle.
 */
public class AirFreshener {

    private final String scent;

    public AirFreshener(String scent) {
        this.scent = scent;
    }

    public AirFreshener() {
        this.scent = "New Car";
    }

    public String getScent() {
        return scent;
    }
}

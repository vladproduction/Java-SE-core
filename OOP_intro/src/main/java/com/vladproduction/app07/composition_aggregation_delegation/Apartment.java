package com.vladproduction.app07.composition_aggregation_delegation;

/**
 * Represents an apartment that can also have an air freshener.
 * Demonstrates that AirFreshener can be aggregated by multiple classes.
 */
public class Apartment {

    private final AirFreshener airFreshener;

    public Apartment(AirFreshener airFreshener) {
        this.airFreshener = airFreshener;
    }

    public String getInteriorScent() {
        return airFreshener != null ? airFreshener.getScent() : "Unknown";
    }

}

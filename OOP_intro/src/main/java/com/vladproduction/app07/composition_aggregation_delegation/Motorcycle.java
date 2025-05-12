package com.vladproduction.app07.composition_aggregation_delegation;

/**
 * A specific type of vehicle with fewer tires.
 * Demonstrates inheritance and method overriding.
 */
public class Motorcycle extends Vehicle{

    public Motorcycle() {
        super();
    }

    public Motorcycle(AirFreshener airFreshener) {
        super(airFreshener);
    }

    /**
     * Override to specify that motorcycles need only 2 tires.
     */
    @Override
    protected int getRequiredTireCount() {
        return 2; // Motorcycle has 2 wheels only
    }
}

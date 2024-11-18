package com.vladproduction.instance_vs_class;

public class CarClass {

    private static int amountCarsCreated;

    public CarClass() {
        amountCarsCreated++;
    }

    public static int getAmountCarsCreated() {
        return amountCarsCreated;
    }
}

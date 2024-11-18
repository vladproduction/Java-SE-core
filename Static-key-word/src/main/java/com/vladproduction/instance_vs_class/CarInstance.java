package com.vladproduction.instance_vs_class;

public class CarInstance {

    private int countCars;

    public CarInstance() {
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }
}

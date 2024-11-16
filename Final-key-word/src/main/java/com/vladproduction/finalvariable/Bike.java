package com.vladproduction.finalvariable;

public class Bike {
    private final int speed = 22; // in-line
    private final int sizeWheel; // define here, but initialization in initialization block
    private final String type; // define here, but initialization by invoke constructor method


    //initialization block
    {
        sizeWheel = 34;
    }

    //constructor
    public Bike(String type) {

        this.type = type;
    }
}

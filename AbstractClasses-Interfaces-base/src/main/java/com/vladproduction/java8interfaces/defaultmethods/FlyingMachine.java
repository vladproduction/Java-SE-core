package com.vladproduction.java8interfaces.defaultmethods;

public interface FlyingMachine {
    void blastOff();
    void landing();
    default void makeTravel() {
        blastOff();
        fly();
        landing();
    }
    default void fly() {
        System.out.println("Machine is flying!");
    }
}

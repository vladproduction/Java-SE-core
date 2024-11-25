package com.vladproduction.interfaces;

/**
 * Implementing Interfaces in Classes: A concrete class that implements an interface
 * must provide implementations for all abstract methods defined in the interface.
 * */
public class Dog implements Mammal {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks");
    }
}
package com.vladproduction.interfaces;

/**
 * Multiple Implementations: A class can implement multiple interfaces, allowing it to inherit the abstract methods
 * of different interfaces.
 * This is in contrast to classes, which cannot extend more than one superclass.
 * */
public class Dolphin implements Mammal, Swimmer {
    @Override
    public void eat() {
        System.out.println("Dolphin eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleeps");
    }

    @Override
    public void walk() {
        System.out.println("Dolphin walks");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin swims");
    }
}
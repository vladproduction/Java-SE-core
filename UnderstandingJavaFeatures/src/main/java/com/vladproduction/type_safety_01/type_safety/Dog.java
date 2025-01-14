package com.vladproduction.type_safety_01.type_safety;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

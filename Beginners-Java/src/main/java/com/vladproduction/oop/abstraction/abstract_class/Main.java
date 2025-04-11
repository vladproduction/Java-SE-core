package com.vladproduction.oop.abstraction.abstract_class;

/**
 * Abstraction is the concept of hiding the complex implementation details and
 * showing only the essential features of the object. It helps in reducing programming complexity and effort.
 * In Java, abstraction is achieved using abstract classes and interfaces.
 * */

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Calls the overridden method in Dog
        myDog.sleep();  // Inherited method
    }
}

abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}


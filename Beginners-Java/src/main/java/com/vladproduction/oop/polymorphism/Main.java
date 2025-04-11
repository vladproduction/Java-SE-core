package com.vladproduction.oop.polymorphism;

/**
 * Polymorphism allows objects to be treated as instances of their parent class rather than their actual class.
 * It enables one interface to be used for a general class of actions.
 * The two main types of polymorphism are compile-time (method overloading) and runtime (method overriding).
 * */

public class Main {
    public static void main(String[] args) {

        //Compile-time Polymorphism
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10));       // Calls int add(int, int)
        System.out.println(math.add(5.5, 10.5));   // Calls double add(double, double)

        //Runtime Polymorphism
        Animal myAnimal = new Dog();
        myAnimal.sound();  // Calls the overridden method in Dog
    }
}

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}
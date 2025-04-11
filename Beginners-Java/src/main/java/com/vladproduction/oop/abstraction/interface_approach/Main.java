package com.vladproduction.oop.abstraction.interface_approach;



public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Calls the implemented method in Dog
        myDog.sleep();  // Calls the implemented method in Dog
    }
}

interface Animal {
    void sound();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps.");
    }
}
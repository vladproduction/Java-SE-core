package com.vladproduction._02_polymorphism.override_overload;

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }

    // Method Overloading
    void printInfo(String name) {
        System.out.println("Animal Name: " + name);
    }

    void printInfo(String name, int age) {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
}


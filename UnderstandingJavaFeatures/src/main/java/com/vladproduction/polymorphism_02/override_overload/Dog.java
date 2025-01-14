package com.vladproduction.polymorphism_02.override_overload;

// Subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

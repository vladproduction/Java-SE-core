package com.vladproduction._02_polymorphism.override_overload;

// Subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

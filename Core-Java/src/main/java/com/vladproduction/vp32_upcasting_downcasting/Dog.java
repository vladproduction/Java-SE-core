package com.vladproduction.vp32_upcasting_downcasting;

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    public void bark() {
        System.out.println("Dog barking noisy!");
    }
}
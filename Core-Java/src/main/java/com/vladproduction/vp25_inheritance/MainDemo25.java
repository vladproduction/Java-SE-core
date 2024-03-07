package com.vladproduction.vp25_inheritance;

public class MainDemo25 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}

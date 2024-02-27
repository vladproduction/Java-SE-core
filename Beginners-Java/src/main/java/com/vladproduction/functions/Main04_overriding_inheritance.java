package com.vladproduction.functions;

public class Main04_overriding_inheritance {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.speak(); // "Я животное!"

        Dog dog = new Dog();
        dog.speak(); // "Гав!"


    }

    static class Animal {
        public void speak() {
            System.out.println("Я животное!");
        }
    }

    static class Dog extends Animal {
        @Override
        public void speak() {
            System.out.println("Гав!");
        }
    }
}

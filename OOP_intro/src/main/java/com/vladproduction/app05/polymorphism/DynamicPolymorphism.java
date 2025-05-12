package com.vladproduction.app05.polymorphism;

public class DynamicPolymorphism {

    public static void main(String[] args) {

        Animal animal;

        //makeSound() is overridden in each subclass
        //The method that gets executed is based on the actual object type (Dog or Cat),
        //not the reference type (Animal), which is determined at runtime — that’s dynamic polymorphism

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

    }

    static class Animal{
        public void makeSound(){
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println("Dog sound");
        }
    }

    static class Cat extends Animal{
        @Override
        public void makeSound(){
            System.out.println("Cat sound");
        }
    }

}

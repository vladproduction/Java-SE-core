package com.vladproduction.app21.upcasting_downcasting;

public class Main {
    public static void main(String[] args) {

        //upcasting:
        System.out.println("\nupcasting:");
        //A Dog object is created, but it is stored in an Animal reference.
        //This is safe and happens implicitly because Dog is-a Animal (inheritance).
        Animal animal = new Dog();
        animal.animalMethod();
        //animal.bark(); //if we want to use this method we have to cast as qualifier: ((Dog) animal).bark()
        //animal.purr(); //method purr() does not exist in Dog class

        //downcasting:
        System.out.println("\ndowncasting:");
        //An animal actually holds a Dog object, so downcasting is valid.
        //The explicit cast (Dog) animal tells Java to treat animal as a Dog object.
        //Now, dog can access both Animal and Dog methods.
        Dog dog = (Dog) animal;
        dog.animalMethod();
        dog.bark();

        System.out.println("\nmethods for Cat:");
        //Create an object of Cat class, and we can use our overridden + own methods
        Cat cat = new Cat();
        cat.animalMethod();
        cat.purr();

        System.out.println("\nmethods for BritishCat:");
        BritishCat britishCat = new BritishCat();
        britishCat.animalMethod();
        britishCat.purr();

    }
}

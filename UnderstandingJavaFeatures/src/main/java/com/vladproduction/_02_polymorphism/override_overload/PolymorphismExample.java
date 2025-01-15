package com.vladproduction._02_polymorphism.override_overload;

public class PolymorphismExample {
    public static void main(String[] args) {
        // Demonstrating Method Overriding
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound(); // Output: Bark
        myCat.makeSound(); // Output: Meow

        // Demonstrating Method Overloading
        Animal animal = new Animal();
        animal.printInfo("Bella"); // Output: Animal Name: Bella
        animal.printInfo("Charlie", 2); // Output: Animal Name: Charlie, Age: 2
    }
}

/**
 * Method Overriding:
 * The makeSound method is overridden in the Dog and Cat subclasses, providing specific animal sounds based
 * on the actual object type referenced by the superclass (Animal). This demonstrates runtime polymorphism.
 *
 * Method Overloading:
 * The printInfo method is overloaded in the Animal class, allowing it to accept different parameter lists.
 * This shows compile-time polymorphism, where the compiler determines which method to call based on the arguments provided.
 * */
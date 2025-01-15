package com.vladproduction._01_type_safety.type_safety;

public class Main_InheritanceRuntime {
    public static void main(String[] args) {

        // Valid assignment
        Animal myDog = new Dog(); // myDog reference contains type information for Animal
        myDog.makeSound(); // Calls Dog's makeSound method

        // Attempting an invalid assignment
        // This line, when uncommented, will cause a compile-time error
        // String myString = new String("Hello");
        // Animal myAnimal = myString; // Invalid: String is not an Animal

        // To demonstrate runtime check, you can cast an object
        try {
            Animal anotherDog = new Dog();
            Dog dog = (Dog) anotherDog; // Valid: no exception thrown
            dog.makeSound();

            // Attempt to cast to an incompatible type, which will cause a ClassCastException
            Animal myAnimal = new Animal();
            Dog wrongDog = (Dog) myAnimal; // This will throw ClassCastException at runtime
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

/**
 * Compilation:
 * When you assign new Dog() to Animal myDog, the Java compiler verifies that Dog is a subclass of Animal.
 * This assignment is valid, and myDog holds a reference to a Dog object while the reference type is Animal.
 *
 * Method Invocation:
 * When myDog.makeSound() is called, the JVM checks the actual object’s class (the object type is Dog)
 *  and invokes the overridden makeSound() method from the Dog class, resulting in "Bark".
 *
 * Invalid Assignment Example:
 * If we attempt to assign a String to an Animal reference (as commented out),
 *  the Java compiler catches this during compile time, preventing invalid assignments.
 *
 * Runtime Checks:
 * When you try to cast an Animal reference to a Dog reference with Dog wrongDog = (Dog) myAnimal, the JVM performs a type check at runtime.
 * Since myAnimal is of type Animal and not Dog, this results in a ClassCastException.
 * */

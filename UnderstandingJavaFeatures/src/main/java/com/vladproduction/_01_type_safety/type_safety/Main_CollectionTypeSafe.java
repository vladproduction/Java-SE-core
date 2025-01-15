package com.vladproduction._01_type_safety.type_safety;



import java.util.ArrayList;
import java.util.List;

public class Main_CollectionTypeSafe {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Adding Dogs and Cats to the shelter
        shelter.addAnimal(new Dog());
        shelter.addAnimal(new Cat());

        // Making all the animals sound
        shelter.makeAllSounds();

        // Attempting to run unsafe operations
        try {
            // This will compile, but could lead to a runtime error if not type-checked
            List nonGenericList = new ArrayList();  // Raw type
            nonGenericList.add("I'm a String"); // Adding a String to a raw type list

            // Casting to Animal and checking for class cast exception
            for (Object obj : nonGenericList) {
                Animal animal = (Animal) obj; // Will throw ClassCastException at runtime
            }
        } catch (ClassCastException e) {
            System.out.println("Error during unsafe operation: " + e.getMessage());
        }
    }
}

/**
 * Class Hierarchy:
 * We have an Animal superclass and two subclasses: Dog and Cat. Each subclass implements its own version of the makeSound() method.
 *
 * Using Generics:
 * In the AnimalShelter class, we use a List<Animal> to maintain a collection of Animal objects. This ensures type safety because
 * only objects of type Animal (or its subclasses) can be added to the list.
 *
 * Adding Animals:
 * The addAnimal method allows adding any Animal instance (including Dog and Cat) into the shelter. This shows polymorphism, where
 * a superclass reference can point to subclass objects.
 *
 * Making Sounds:
 * The makeAllSounds() method iterates over the animals list and invokes the makeSound() method on each Animal. The method calls are
 * resolved based on the actual object type, demonstrating polymorphism in action.
 *
 * Unsafe Operations:
 * We illustrate a scenario where a raw type List is used, and a String is added to it. Even though this compiles, trying to cast it
 * to an Animal type at runtime leads to a ClassCastException. This highlights the pitfalls of not using generics and showcases how
 * the JVM performs type checks dynamically.
 * */
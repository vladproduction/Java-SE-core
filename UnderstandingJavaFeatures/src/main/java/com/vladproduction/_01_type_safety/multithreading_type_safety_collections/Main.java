package com.vladproduction._01_type_safety.multithreading_type_safety_collections;


import com.vladproduction._01_type_safety.type_safety.Cat;
import com.vladproduction._01_type_safety.type_safety.Dog;

/**
 * This example demonstrates how to achieve type safety and polymorphism in a multithreaded environment using
 * Java's Collections Framework.
 * The use of CopyOnWriteArrayList ensures that we can safely modify the collection while reading from it.
 * */
public class Main {
    public static void main(String[] args) {

        //create task
        AnimalShelterTask animalShelterTask = new AnimalShelterTask();

        //create threads to add elements for worker:
        Thread thread1 = new Thread(new AnimalWorkerAdder(animalShelterTask, new Dog()));
        Thread thread2 = new Thread(new AnimalWorkerAdder(animalShelterTask, new Cat()));
        Thread thread3 = new Thread(new AnimalWorkerAdder(animalShelterTask, new Dog()));

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        animalShelterTask.makeAllSounds();

    }
}

/**
 * Class Hierarchy:
 * Similar to previous examples, we have an Animal superclass and subclasses Dog and Cat. Each subclass implements its own makeSound() method.
 *
 * Thread-Safe Collection:
 * The AnimalShelter uses CopyOnWriteArrayList, which ensures thread safety when adding animals.
 * This collection allows safe concurrent modifications while maintaining consistent read access.
 *
 * Adding Animals Concurrently:
 * The AnimalAdder class implements the Runnable interface, which allows instances of this class to be run by separate threads.
 * Each thread tries to add an instance of either Dog or Cat to the AnimalShelter.
 *
 * Starting Threads:
 * We create three threads (thread1, thread2, and thread3) that attempt to add animals to the shelter concurrently.
 *
 * Waiting for Thread Completion:
 * We call join() to ensure that the main thread waits for the completion of all threads before proceeding to the next step.
 *
 * Making Sounds:
 * After all animals have been added, the main thread calls the makeAllSounds() method, iterating through the animals
 * list and invoking each animal's makeSound() method, demonstrating polymorphism.
 * */

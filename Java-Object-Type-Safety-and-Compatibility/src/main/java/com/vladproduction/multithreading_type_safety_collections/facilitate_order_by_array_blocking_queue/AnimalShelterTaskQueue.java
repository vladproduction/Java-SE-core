package com.vladproduction.multithreading_type_safety_collections.facilitate_order_by_array_blocking_queue;

import com.vladproduction.inheritance_runtime.Animal;
import com.vladproduction.multithreading_type_safety_collections.AnimalShelterTask;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AnimalShelterTaskQueue{

    private BlockingQueue<Animal> animalQueue;

    public AnimalShelterTaskQueue(int capacity) {
        animalQueue = new ArrayBlockingQueue<>(capacity);
    }

    public void addAnimal(Animal animal) throws InterruptedException {
        animalQueue.put(animal);  // Blocks if the queue is full
        System.out.println("Added: " + animal.getClass().getSimpleName());
    }

    public void makeAllSounds() {
        while (!animalQueue.isEmpty()) {
            try {
                Animal animal = animalQueue.take();  // Retrieves and removes the head of the queue
                animal.makeSound();  // Polymorphic method call
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}

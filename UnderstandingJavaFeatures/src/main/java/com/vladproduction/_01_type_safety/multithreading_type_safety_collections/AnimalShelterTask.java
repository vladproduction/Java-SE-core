package com.vladproduction._01_type_safety.multithreading_type_safety_collections;



import com.vladproduction._01_type_safety.type_safety.Animal;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AnimalShelterTask {

    private List<Animal> animals;

    public AnimalShelterTask() {
        this.animals = new CopyOnWriteArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);  // Thread-safe addition due to CopyOnWriteArrayList
        System.out.println("Added: " + animal.getClass().getSimpleName());
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();  // Polymorphic method call
        }
    }
}

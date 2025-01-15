package com.vladproduction._01_type_safety.multithreading_type_safety_collections;


import com.vladproduction._01_type_safety.type_safety.Animal;

public class AnimalWorkerAdder implements Runnable{

    private AnimalShelterTask shelterTask;
    private Animal animal;

    public AnimalWorkerAdder(AnimalShelterTask shelterTask, Animal animal) {
        this.shelterTask = shelterTask;
        this.animal = animal;
    }

    @Override
    public void run() {
        shelterTask.addAnimal(animal);
    }
}

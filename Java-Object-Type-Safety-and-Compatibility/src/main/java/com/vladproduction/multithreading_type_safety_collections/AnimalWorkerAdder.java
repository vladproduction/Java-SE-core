package com.vladproduction.multithreading_type_safety_collections;

import com.vladproduction.inheritance_runtime.Animal;

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

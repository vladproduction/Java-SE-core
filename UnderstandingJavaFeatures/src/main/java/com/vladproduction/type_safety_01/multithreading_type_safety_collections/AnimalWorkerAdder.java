package com.vladproduction.type_safety_01.multithreading_type_safety_collections;


import com.vladproduction.type_safety_01.type_safety.Animal;

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

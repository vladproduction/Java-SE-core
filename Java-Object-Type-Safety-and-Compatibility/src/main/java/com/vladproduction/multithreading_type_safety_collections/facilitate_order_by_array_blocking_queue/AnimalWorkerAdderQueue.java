package com.vladproduction.multithreading_type_safety_collections.facilitate_order_by_array_blocking_queue;

import com.vladproduction.inheritance_runtime.Animal;

public class AnimalWorkerAdderQueue  implements Runnable {

    private AnimalShelterTaskQueue shelterTaskQueue;
    private Animal animal;

    public AnimalWorkerAdderQueue(AnimalShelterTaskQueue shelterTaskQueue, Animal animal) {
        this.shelterTaskQueue = shelterTaskQueue;
        this.animal = animal;
    }

    @Override
    public void run() {
        try {
            shelterTaskQueue.addAnimal(animal);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }

}

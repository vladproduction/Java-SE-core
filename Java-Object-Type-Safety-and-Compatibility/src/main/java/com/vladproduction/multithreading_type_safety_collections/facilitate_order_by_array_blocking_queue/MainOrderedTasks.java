package com.vladproduction.multithreading_type_safety_collections.facilitate_order_by_array_blocking_queue;

import com.vladproduction.collections_type_safety.Cat;
import com.vladproduction.inheritance_runtime.Dog;

public class MainOrderedTasks {
    public static void main(String[] args) {

        //create task:
        AnimalShelterTaskQueue taskQueue = new AnimalShelterTaskQueue(10);

        //create threads:
        Thread thread1 = new Thread(new AnimalWorkerAdderQueue(taskQueue, new Dog()));
        Thread thread2 = new Thread(new AnimalWorkerAdderQueue(taskQueue, new Cat()));
        Thread thread3 = new Thread(new AnimalWorkerAdderQueue(taskQueue, new Cat()));
        Thread thread4 = new Thread(new AnimalWorkerAdderQueue(taskQueue, new Dog()));
        Thread thread5 = new Thread(new AnimalWorkerAdderQueue(taskQueue, new Cat()));
        Thread thread6 = new Thread(new AnimalWorkerAdderQueue(taskQueue, new Dog()));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //execute task and print in order tasks were put in queue:
        taskQueue.makeAllSounds();

    }
}

package com.vladproduction._04_multithreading.synchronization;

public class CounterProgram {
    public static void main(String[] args) {
        //create instance of Counter:
        Counter counter = new Counter();

        //creating 3 threads and incrementing value in each:
        //used helper method to get array of threads with counter instance as parameter
        //for each thread we start()
        Thread[] threads = getThreads(counter);
        for (Thread thread : threads) {
            thread.start();
        }

        //joining the started threads (ensure to finish all):
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //printing result (expected 3000: 1000 for each)
        System.out.println("Final result: " + counter.getCount());

    }

    //creating threads and incrementing counter:
    //increment method is synchronized (ensure consistency)
    private static Thread[] getThreads(Counter counter) {
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread thread3 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        //return threads array
        Thread[] threads = {thread1, thread2, thread3};
        return threads;
    }


}

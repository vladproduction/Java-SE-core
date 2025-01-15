package com.vladproduction._04_multithreading.synchronization;

public class Counter {

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

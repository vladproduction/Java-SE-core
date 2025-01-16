package com.vladproduction.threadsafe_classes;

import java.time.LocalDate;

public class LocalDateExample implements Runnable {
    @Override
    public void run() {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date from thread " + Thread.currentThread().getName() + ": " + today);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new LocalDateExample());
        Thread thread2 = new Thread(new LocalDateExample());

        thread1.start();
        thread2.start();
    }
}

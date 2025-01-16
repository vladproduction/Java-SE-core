package com.vladproduction.threadsafe_classes;

import java.time.LocalDateTime;

public class LocalDateTimeExample implements Runnable {
    @Override
    public void run() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime from thread " + Thread.currentThread().getName() + ": " + now);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new LocalDateTimeExample());
        Thread thread2 = new Thread(new LocalDateTimeExample());

        thread1.start();
        thread2.start();
    }
}

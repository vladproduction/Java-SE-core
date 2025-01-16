package com.vladproduction.threadsafe_classes;

import java.time.ZonedDateTime;

public class ZonedDateTimeExample implements Runnable {
    @Override
    public void run() {
        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println("Current Zoned DateTime from thread " + Thread.currentThread().getName() + ": " + zonedNow);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ZonedDateTimeExample());
        Thread thread2 = new Thread(new ZonedDateTimeExample());

        thread1.start();
        thread2.start();
    }
}

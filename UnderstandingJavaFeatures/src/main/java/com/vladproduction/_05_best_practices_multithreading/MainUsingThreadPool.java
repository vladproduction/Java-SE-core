package com.vladproduction._05_best_practices_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainUsingThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 7; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is running");
                // Simulate work
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
    }
}

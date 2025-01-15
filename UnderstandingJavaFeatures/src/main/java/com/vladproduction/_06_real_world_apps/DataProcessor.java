package com.vladproduction._06_real_world_apps;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataProcessor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            final int taskID = i;
            executorService.submit(()->{
                System.out.println("Processing data: " + taskID);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executorService.shutdown();
    }
}

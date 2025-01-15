package com.vladproduction._06_real_world_apps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/**
 * This AdvancedDataProcessor class demonstrates multithreading with more complex logic while maintaining
 * thread safety and providing clear feedback about the computations performed.
 * */
public class AdvancedDataProcessor {
    private static final Logger log = Logger.getLogger(String.valueOf(AdvancedDataProcessor.class));
    private static final AtomicInteger totalSumOfSquares = new AtomicInteger(0);
    private static final AtomicInteger totalSumOfQubes = new AtomicInteger(0);

    public static void main(String[] args) {
        //executor created:
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        //store for futures results of calculating data:
        List<Future<String>> results = new ArrayList<>();

        //initiating and submit tasks for calculating:
        for (int i = 0; i < 10; i++) {
            final int taskID = i;

            results.add(executorService.submit(()->{
                try {
                    //perform calculations:
                    int square = calculateSquare(taskID);
                    int qube = calculateQube(taskID);

                    //update totals in thread-safe manner:
                    totalSumOfSquares.addAndGet(square);
                    totalSumOfQubes.addAndGet(qube);

                    return "Task: " + taskID + ", processed:  Square [" + square + "]; " + " Qube [" + qube + "]";

                } catch (Exception e) {
                    log.severe("TaskID: " + taskID + " encountered an error: " + e.getMessage());
                    return "Task ID: " + taskID + " encountered an error: " + e.getMessage();
                }
            }));

        }

        //printing results
        for (Future<String> result : results) {
            try {
                System.out.println(result.get());
            }catch (Exception e){
                log.severe("Error retrieving result: " + e.getMessage());
            }
        }

        //print total sums:
        System.out.println("Total sum of Squares: " + totalSumOfSquares.get());
        System.out.println("Total sum of Qubes: " + totalSumOfQubes.get());

        //end of work and shutdown executor:
        executorService.shutdown();
    }

    private static int calculateSquare(int number){
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        return number * number;
    }

    private static int calculateQube(int number){
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        return number * number * number;
    }
}

/*Task: 0, processed:  Square [0];  Qube [0]
Task: 1, processed:  Square [1];  Qube [1]
Task: 2, processed:  Square [4];  Qube [8]
Task: 3, processed:  Square [9];  Qube [27]
Task: 4, processed:  Square [16];  Qube [64]
Task: 5, processed:  Square [25];  Qube [125]
Task: 6, processed:  Square [36];  Qube [216]
Task: 7, processed:  Square [49];  Qube [343]
Task: 8, processed:  Square [64];  Qube [512]
Task: 9, processed:  Square [81];  Qube [729]
Total sum of Squares: 285
Total sum of Qubes: 2025*/

package com.vladproduction._06_real_world_apps;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

/**
 * results as square of the given numbers by taskID (0-99)
 * */
public class EnhancedDataProcessor {

    private static final Logger log = Logger.getLogger(String.valueOf(EnhancedDataProcessor.class));
    public static void main(String[] args) {
        //instantiate executor as ThreadPool:
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        //creating results of future execution as list
        List<Future<String>> results = new ArrayList<>();

        //creating a tasks (0-100), add them to the list of results -> properly submitted to the executor
        for (int i = 0; i < 100; i++) {
            final int taskID = i;

            results.add(executorService.submit(()->{
                try {
                    return "Task ID: " + taskID + " processed, result: " + computeSquare(taskID);
                }catch (Exception e){
                    return "Task ID: " + taskID + " encountered an error: " + e.getMessage();
                }
            }));

        }

        //wait for all tasks (computation complete and print results)
        for (Future<String> result : results) {
            try{
                System.out.println(result.get());
            }catch (Exception e){
                log.severe(e.getMessage());
            }
        }

        //shutdown executor friendly:
        executorService.shutdown();

    }

    //helper to compute square:
    public static int computeSquare(int number){
        //simulating work (computing):
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        return number * number;
    }
}

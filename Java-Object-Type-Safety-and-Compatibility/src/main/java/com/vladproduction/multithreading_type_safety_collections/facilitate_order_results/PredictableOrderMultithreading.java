package com.vladproduction.multithreading_type_safety_collections.facilitate_order_results;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class PredictableOrderMultithreading {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //number of tasks:
        int tasks = 5;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        //create and submit tasks:
        for (int i = 0; i < tasks; i++) {

            final int taskID = i;

            Callable<String> task = () -> {
                Thread.sleep(100 * taskID); // Different sleep times for demonstration
                return "Result: " + taskID;
            };

            futures.add(executor.submit(task));

        }

        //collect results in order:
        List<String> results = new ArrayList<>();
        for (int i = 0; i < tasks; i++) {
            results.add(futures.get(i).get()); // Get result in order of submission
        }

        //print output
        results.forEach(System.out::print);

        //shutdown
        executor.shutdown();

        /*  Result: 0
            Result: 1
            Result: 2
            Result: 3
            Result: 4
        */

    }
}

/**
 * Explanation
 * ExecutorService: A thread pool is created using the Executors.newFixedThreadPool method to manage a pool of threads.
 *
 * Callable Tasks: You define tasks using Callable, which allows for returning results and throwing exceptions.
 *
 * Future: You submit each task to the executor and store the Future object returned by the submit() method.
 * Each Future holds the result of the respective task.
 *
 * Collect Results: You loop through the futures list in the order of submission, calling get() on each Future to retrieve results.
 * This ensures you collect them in the same order that you submitted the tasks.
 *
 * Output: Finally, output the results in a predictable order.
 *
 * By following this approach, you can manage concurrency while ensuring that the results are gathered in the order of task submission.
 * */

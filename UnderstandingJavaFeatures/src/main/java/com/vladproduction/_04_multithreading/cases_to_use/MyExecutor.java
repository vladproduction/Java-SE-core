package com.vladproduction._04_multithreading.cases_to_use;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {
    public static void main(String[] args) {
        //create pool of threads:
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //submitting task and execute:
        for (int i = 0; i < 10; i++) {
            final int taskID = i;
            executor.submit(()-> System.out.println("[Thread executing using Executor Framework] task: " + taskID));
        }
        //shutdown executor (will close  and no more tasks available to execute)
        //main thread program is down
        executor.shutdown();
    }
}

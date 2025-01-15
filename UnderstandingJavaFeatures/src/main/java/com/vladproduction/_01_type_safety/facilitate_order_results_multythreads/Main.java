package com.vladproduction._01_type_safety.facilitate_order_results_multythreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int tasks = 5;
        ExecutorService executors = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        //creating and submitting tasks:
        for (int i = 0; i < tasks; i++) {
            final int taskID = i;

            Callable<String> task = () -> {
                Person person;
                if(taskID % 2 == 0){
                    person = new Employee("Employee#" + taskID, taskID + 100);
                }
                else {
                    person = new Client("Client#" + taskID, taskID + 500);
                }
                Thread.sleep(100 * taskID);
                return "Task " + taskID + " : " + person.getInfo();
            };
            futures.add(executors.submit(task));
        }

        //create a storage for executed tasks:
        List<String> resultsList = new ArrayList<>();
        for (int i = 0; i < tasks; i++) {
            resultsList.add(futures.get(i).get());
        }

        resultsList.forEach(System.out::println);

        executors.shutdown();

    }
}

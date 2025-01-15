package com.vladproduction._05_best_practices_multithreading;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Using Concurrent Collections in example of ConcurrentHashMap;
 * */
public class MainConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        //add elements:
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        //check status before:
        System.out.println("before modification map:");
        map.forEach((s, integer) -> System.out.print("[" + s + " : " + integer + "] "));
        System.out.println("\nMap SIZE (before): " + map.size());

        //check status after:
        System.out.println("after concurrently modification:");
        // Concurrently modifying the map
        map.forEach((key, value) -> {

            if (key.equals("Five-NotExistKey")) {
                map.put("Six", 6);
            }
            if (key.equals("Five")) { //if such key exist - if statement will execute
                map.put("Six", 6); // No ConcurrentModificationException
            }
            if (key.equals("Six")) {
                map.put("Seven", 7);
            }
            if(key.equals("One")){
                map.put("Eight", 8);
            }
            System.out.print("[" + key + ": " + value + "] "); //not all keys is viewed

        });
        System.out.println("\nMap SIZE (after): " + map.size()); //but size is correct

        System.out.println("***final result:***");
        map.forEach((s, integer) -> System.out.print("[" + s + " : " + integer + "]")); //we could see all keys
        System.out.println("\nMap SIZE (after): " + map.size());

        /*      before modification map:
            [Five : 5] [One : 1] [Four : 4] [Two : 2] [Three : 3]
            Map SIZE (before): 5

                after concurrently modification:
            [Five: 5] [Six: 6] [One: 1] [Four: 4] [Seven: 7] [Two: 2] [Three: 3]
            Map SIZE (after): 8

                ***final result:***
            [Eight : 8][Five : 5][Six : 6][One : 1][Four : 4][Seven : 7][Two : 2][Three : 3]
            Map SIZE (after): 8         */

    }
}

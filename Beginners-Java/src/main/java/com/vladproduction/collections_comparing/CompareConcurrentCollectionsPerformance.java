package com.vladproduction.collections_comparing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CompareConcurrentCollectionsPerformance {

    // Variables to store performance results
    private static long concurrentHashMapInsertTime;
    private static long copyOnWriteArrayListInsertTime;
    private static long concurrentHashMapAccessTime;
    private static long copyOnWriteArrayListAccessTime;
    private static long concurrentHashMapUpdateTime;
    private static long copyOnWriteArrayListUpdateTime;

    public static void main(String[] args) {
        // Test insertion performance
        testInsertionPerformance();

        // Test access performance
        testAccessPerformance();

        // Test update performance
        testUpdatePerformance();

        // Summary of results
        printSummary();
    }

    private static void testInsertionPerformance() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMapInsertTime = timingInsertionMapOperation(concurrentHashMap);
        System.out.println("ConcurrentHashMap insertion time: " + concurrentHashMapInsertTime + " ns");

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayListInsertTime = timingInsertionListOperation(copyOnWriteArrayList);
        System.out.println("CopyOnWriteArrayList insertion time: " + copyOnWriteArrayListInsertTime + " ns");
    }

    private static long timingInsertionMapOperation(ConcurrentHashMap<String, String> map) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            map.put(String.valueOf(i), "Value-" + i); // Insert elements to the map
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingInsertionListOperation(CopyOnWriteArrayList<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add("Value-" + i); // Insert elements to the list
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testAccessPerformance() {
        // Create and populate collections for access testing
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 10000; i++) {
            concurrentHashMap.put(String.valueOf(i), "Value-" + i);
            copyOnWriteArrayList.add("Value-" + i);
        }

        concurrentHashMapAccessTime = timingAccessMapOperation(concurrentHashMap);
        System.out.println("ConcurrentHashMap access time: " + concurrentHashMapAccessTime + " ns");

        copyOnWriteArrayListAccessTime = timingAccessListOperation(copyOnWriteArrayList);
        System.out.println("CopyOnWriteArrayList access time: " + copyOnWriteArrayListAccessTime + " ns");
    }

    private static long timingAccessMapOperation(ConcurrentHashMap<String, String> map) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            map.get(String.valueOf(i)); // Access elements from the map
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingAccessListOperation(CopyOnWriteArrayList<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            list.get(i); // Access elements from the list
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testUpdatePerformance() {
        // Create and populate collections for update testing
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 10000; i++) {
            concurrentHashMap.put(String.valueOf(i), "Value-" + i);
            copyOnWriteArrayList.add("Value-" + i);
        }

        concurrentHashMapUpdateTime = timingUpdateMapOperation(concurrentHashMap);
        System.out.println("ConcurrentHashMap update time: " + concurrentHashMapUpdateTime + " ns");

        copyOnWriteArrayListUpdateTime = timingUpdateListOperation(copyOnWriteArrayList);
        System.out.println("CopyOnWriteArrayList update time: " + copyOnWriteArrayListUpdateTime + " ns");
    }

    private static long timingUpdateMapOperation(ConcurrentHashMap<String, String> map) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            map.put(String.valueOf(i), "Updated-" + i); // Update elements in the map
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingUpdateListOperation(CopyOnWriteArrayList<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            list.set(i, "Updated-" + i); // Update elements in the list
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void printSummary() {
        System.out.println("\nPerformance Summary:");
        System.out.println("ConcurrentHashMap Insertion Time: " + concurrentHashMapInsertTime + " ns");
        System.out.println("CopyOnWriteArrayList Insertion Time: " + copyOnWriteArrayListInsertTime + " ns");
        System.out.println("ConcurrentHashMap Access Time: " + concurrentHashMapAccessTime + " ns");
        System.out.println("CopyOnWriteArrayList Access Time: " + copyOnWriteArrayListAccessTime + " ns");
        System.out.println("ConcurrentHashMap Update Time: " + concurrentHashMapUpdateTime + " ns");
        System.out.println("CopyOnWriteArrayList Update Time: " + copyOnWriteArrayListUpdateTime + " ns");
    }

}

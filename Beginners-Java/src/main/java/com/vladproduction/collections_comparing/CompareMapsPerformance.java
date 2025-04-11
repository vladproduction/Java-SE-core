package com.vladproduction.collections_comparing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CompareMapsPerformance {

    // Variables to store performance results
    private static long hashMapPutTime;
    private static long treeMapPutTime;
    private static long linkedHashMapPutTime;
    private static long hashMapGetTime;
    private static long treeMapGetTime;
    private static long linkedHashMapGetTime;
    private static long hashMapUpdateTime;
    private static long treeMapUpdateTime;
    private static long linkedHashMapUpdateTime;
    private static long hashMapRemoveTime;
    private static long treeMapRemoveTime;
    private static long linkedHashMapRemoveTime;

    public static void main(String[] args) {
        // Test put performance
        testPutPerformance();

        // Test get performance
        testGetPerformance();

        // Test update performance
        testUpdatePerformance();

        // Test remove performance
        testRemovePerformance();

        // Summary of results
        printSummary();
    }

    private static void testPutPerformance() {
        Map<String, String> hashMap = new HashMap<>();
        hashMapPutTime = timingPutOperation(hashMap);
        System.out.println("HashMap put time: " + hashMapPutTime + " ns");

        Map<String, String> treeMap = new TreeMap<>();
        treeMapPutTime = timingPutOperation(treeMap);
        System.out.println("TreeMap put time: " + treeMapPutTime + " ns");

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMapPutTime = timingPutOperation(linkedHashMap);
        System.out.println("LinkedHashMap put time: " + linkedHashMapPutTime + " ns");
    }

    private static long timingPutOperation(Map<String, String> map) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            map.put(String.valueOf(i), "Value-" + i); // Add elements to the map
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testGetPerformance() {
        // Create and populate maps for get testing
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 10000; i++) {
            hashMap.put(String.valueOf(i), "Value-" + i);
            treeMap.put(String.valueOf(i), "Value-" + i);
            linkedHashMap.put(String.valueOf(i), "Value-" + i);
        }

        hashMapGetTime = timingGetOperation(hashMap);
        System.out.println("HashMap get time: " + hashMapGetTime + " ns");

        treeMapGetTime = timingGetOperation(treeMap);
        System.out.println("TreeMap get time: " + treeMapGetTime + " ns");

        linkedHashMapGetTime = timingGetOperation(linkedHashMap);
        System.out.println("LinkedHashMap get time: " + linkedHashMapGetTime + " ns");
    }

    private static long timingGetOperation(Map<String, String> map) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            map.get(String.valueOf(i)); // Get elements from the map
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testUpdatePerformance() {
        // Create and populate maps for update testing
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 10000; i++) {
            hashMap.put(String.valueOf(i), "Value-" + i);
            treeMap.put(String.valueOf(i), "Value-" + i);
            linkedHashMap.put(String.valueOf(i), "Value-" + i);
        }

        hashMapUpdateTime = timingUpdateOperation(hashMap);
        System.out.println("HashMap update time: " + hashMapUpdateTime + " ns");

        treeMapUpdateTime = timingUpdateOperation(treeMap);
        System.out.println("TreeMap update time: " + treeMapUpdateTime + " ns");

        linkedHashMapUpdateTime = timingUpdateOperation(linkedHashMap);
        System.out.println("LinkedHashMap update time: " + linkedHashMapUpdateTime + " ns");
    }

    private static long timingUpdateOperation(Map<String, String> map) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            map.put(String.valueOf(i), "Updated-" + i); // Update elements in the map
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testRemovePerformance() {
        // Create and populate maps for removal testing
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 10000; i++) {
            hashMap.put(String.valueOf(i), "Value-" + i);
            treeMap.put(String.valueOf(i), "Value-" + i);
            linkedHashMap.put(String.valueOf(i), "Value-" + i);
        }

        hashMapRemoveTime = timingRemoveOperation(hashMap);
        System.out.println("HashMap remove time: " + hashMapRemoveTime + " ns");

        treeMapRemoveTime = timingRemoveOperation(treeMap);
        System.out.println("TreeMap remove time: " + treeMapRemoveTime + " ns");

        linkedHashMapRemoveTime = timingRemoveOperation(linkedHashMap);
        System.out.println("LinkedHashMap remove time: " + linkedHashMapRemoveTime + " ns");
    }

    private static long timingRemoveOperation(Map<String, String> map) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            map.remove(String.valueOf(i)); // Remove elements from the map
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void printSummary() {
        System.out.println("\nPerformance Summary:");
        System.out.println("HashMap Put Time: " + hashMapPutTime + " ns");
        System.out.println("TreeMap Put Time: " + treeMapPutTime + " ns");
        System.out.println("LinkedHashMap Put Time: " + linkedHashMapPutTime + " ns");
        System.out.println("HashMap Get Time: " + hashMapGetTime + " ns");
        System.out.println("TreeMap Get Time: " + treeMapGetTime + " ns");
        System.out.println("LinkedHashMap Get Time: " + linkedHashMapGetTime + " ns");
        System.out.println("HashMap Update Time: " + hashMapUpdateTime + " ns");
        System.out.println("TreeMap Update Time: " + treeMapUpdateTime + " ns");
        System.out.println("LinkedHashMap Update Time: " + linkedHashMapUpdateTime + " ns");
        System.out.println("HashMap Remove Time: " + hashMapRemoveTime + " ns");
        System.out.println("TreeMap Remove Time: " + treeMapRemoveTime + " ns");
        System.out.println("LinkedHashMap Remove Time: " + linkedHashMapRemoveTime + " ns");
    }

}

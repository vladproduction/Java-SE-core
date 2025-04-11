package com.vladproduction.collections_comparing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CompareVectorWithOtherListsPerformance {

    // Variables to store performance results
    private static long vectorAddTime;
    private static long arrayListAddTime;
    private static long linkedListAddTime;
    private static long copyOnWriteArrayListAddTime;
    private static long vectorReadTime;
    private static long arrayListReadTime;
    private static long linkedListReadTime;
    private static long copyOnWriteArrayListReadTime;
    private static long vectorRemoveTime;
    private static long arrayListRemoveTime;
    private static long linkedListRemoveTime;
    private static long copyOnWriteArrayListRemoveTime;

    public static void main(String[] args) {
        // Test add performance
        testAddPerformance();

        // Test read performance
        testReadPerformance();

        // Test remove performance
        testRemovePerformance();

        // Summary of results
        printSummary();
    }

    private static void testAddPerformance() {
        Vector<String> vector = new Vector<>();
        vectorAddTime = timingAddOperation(vector);
        System.out.println("Vector add time: " + vectorAddTime + " ns");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayListAddTime = timingAddOperation(arrayList);
        System.out.println("ArrayList add time: " + arrayListAddTime + " ns");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedListAddTime = timingAddOperation(linkedList);
        System.out.println("LinkedList add time: " + linkedListAddTime + " ns");

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayListAddTime = timingAddOperation(copyOnWriteArrayList);
        System.out.println("CopyOnWriteArrayList add time: " + copyOnWriteArrayListAddTime + " ns");
    }

    private static <T extends java.util.List<String>> long timingAddOperation(T list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(String.valueOf(i)); // Add elements to the list
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testReadPerformance() {
        // Create and populate lists for read testing
        Vector<String> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 10000; i++) {
            vector.add(String.valueOf(i));
            arrayList.add(String.valueOf(i));
            linkedList.add(String.valueOf(i));
            copyOnWriteArrayList.add(String.valueOf(i));
        }

        vectorReadTime = timingReadOperation(vector);
        System.out.println("Vector read time: " + vectorReadTime + " ns");

        arrayListReadTime = timingReadOperation(arrayList);
        System.out.println("ArrayList read time: " + arrayListReadTime + " ns");

        linkedListReadTime = timingReadOperation(linkedList);
        System.out.println("LinkedList read time: " + linkedListReadTime + " ns");

        copyOnWriteArrayListReadTime = timingReadOperation(copyOnWriteArrayList);
        System.out.println("CopyOnWriteArrayList read time: " + copyOnWriteArrayListReadTime + " ns");
    }

    private static <T extends java.util.List<String>> long timingReadOperation(T list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            list.get(i); // Read elements from the list
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testRemovePerformance() {
        // Create and populate lists for remove testing
        Vector<String> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 10000; i++) {
            vector.add(String.valueOf(i));
            arrayList.add(String.valueOf(i));
            linkedList.add(String.valueOf(i));
            copyOnWriteArrayList.add(String.valueOf(i));
        }

        vectorRemoveTime = timingRemoveOperation(vector);
        System.out.println("Vector remove time: " + vectorRemoveTime + " ns");

        arrayListRemoveTime = timingRemoveOperation(arrayList);
        System.out.println("ArrayList remove time: " + arrayListRemoveTime + " ns");

        linkedListRemoveTime = timingRemoveOperation(linkedList);
        System.out.println("LinkedList remove time: " + linkedListRemoveTime + " ns");

        copyOnWriteArrayListRemoveTime = timingRemoveOperation(copyOnWriteArrayList);
        System.out.println("CopyOnWriteArrayList remove time: " + copyOnWriteArrayListRemoveTime + " ns");
    }

    private static <T extends java.util.List<String>> long timingRemoveOperation(T list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            // Remove from the end to minimize shifting for ArrayList and Vector
            list.remove(list.size() - 1);
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void printSummary() {
        System.out.println("\nPerformance Summary:");
        System.out.println("Vector Add Time: " + vectorAddTime + " ns");
        System.out.println("ArrayList Add Time: " + arrayListAddTime + " ns");
        System.out.println("LinkedList Add Time: " + linkedListAddTime + " ns");
        System.out.println("CopyOnWriteArrayList Add Time: " + copyOnWriteArrayListAddTime + " ns");
        System.out.println("Vector Read Time: " + vectorReadTime + " ns");
        System.out.println("ArrayList Read Time: " + arrayListReadTime + " ns");
        System.out.println("LinkedList Read Time: " + linkedListReadTime + " ns");
        System.out.println("CopyOnWriteArrayList Read Time: " + copyOnWriteArrayListReadTime + " ns");
        System.out.println("Vector Remove Time: " + vectorRemoveTime + " ns");
        System.out.println("ArrayList Remove Time: " + arrayListRemoveTime + " ns");
        System.out.println("LinkedList Remove Time: " + linkedListRemoveTime + " ns");
        System.out.println("CopyOnWriteArrayList Remove Time: " + copyOnWriteArrayListRemoveTime + " ns");
    }

}

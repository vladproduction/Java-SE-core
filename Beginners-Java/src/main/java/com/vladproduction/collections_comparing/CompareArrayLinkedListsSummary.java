package com.vladproduction.collections_comparing;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareArrayLinkedListsSummary {

    // Variables to store performance results
    private static long linkedListInsertionTime;
    private static long arrayListInsertionTime;
    private static long linkedListDeletionTime;
    private static long arrayListDeletionTime;
    private static long linkedListAccessTime;
    private static long arrayListAccessTime;
    private static long linkedListUpdateTime;
    private static long arrayListUpdateTime;

    public static void main(String[] args) {
        // Test insertion performance
        testInsertionPerformance();

        // Test deletion performance
        testDeletionPerformance();

        // Test access performance
        testAccessPerformance();

        // Test update performance
        testUpdatePerformance();

        // Summary of results
        printSummary();
    }

    private static void testInsertionPerformance() {
        List<String> linkedList = new LinkedList<>();
        linkedListInsertionTime = timingInsertion(linkedList);
        System.out.println("LinkedList insertion time: " + linkedListInsertionTime + " ns");

        List<String> arrayList = new ArrayList<>();
        arrayListInsertionTime = timingInsertion(arrayList);
        System.out.println("ArrayList insertion time: " + arrayListInsertionTime + " ns");
    }

    private static long timingInsertion(List<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(String.valueOf(i)); // Add elements to the list
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testDeletionPerformance() {
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(String.valueOf(i));
        }
        linkedListDeletionTime = timingDeletion(linkedList);
        System.out.println("LinkedList deletion time: " + linkedListDeletionTime + " ns");

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(String.valueOf(i));
        }
        arrayListDeletionTime = timingDeletion(arrayList);
        System.out.println("ArrayList deletion time: " + arrayListDeletionTime + " ns");
    }

    private static long timingDeletion(List<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            list.remove(0); // Remove elements from the beginning
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testAccessPerformance() {
        List<String> linkedList = new LinkedList<>();
        // Initialize the linked list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            linkedList.add(String.valueOf(i));
        }
        linkedListAccessTime = timingAccess(linkedList);
        System.out.println("LinkedList access time: " + linkedListAccessTime + " ns");

        List<String> arrayList = new ArrayList<>();
        // Initialize the array list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            arrayList.add(String.valueOf(i));
        }
        arrayListAccessTime = timingAccess(arrayList);
        System.out.println("ArrayList access time: " + arrayListAccessTime + " ns");
    }

    private static long timingAccess(List<String> list) {
        long startTime = System.nanoTime();
        String element = list.get(500); // Access the 500th element
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testUpdatePerformance() {
        List<String> linkedList = new LinkedList<>();
        // Initialize the linked list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            linkedList.add(String.valueOf(i));
        }
        linkedListUpdateTime = timingUpdate(linkedList);
        System.out.println("LinkedList update time: " + linkedListUpdateTime + " ns");

        List<String> arrayList = new ArrayList<>();
        // Initialize the array list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            arrayList.add(String.valueOf(i));
        }
        arrayListUpdateTime = timingUpdate(arrayList);
        System.out.println("ArrayList update time: " + arrayListUpdateTime + " ns");
    }

    private static long timingUpdate(List<String> list) {
        long startTime = System.nanoTime();
        // Update the 500th element
        list.set(500, "Updated Value");
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void printSummary() {
        System.out.println("\nPerformance Summary:");
        System.out.println("LinkedList Insertion Time: " + linkedListInsertionTime + " ns");
        System.out.println("ArrayList Insertion Time: " + arrayListInsertionTime + " ns");
        System.out.println("LinkedList Deletion Time: " + linkedListDeletionTime + " ns");
        System.out.println("ArrayList Deletion Time: " + arrayListDeletionTime + " ns");
        System.out.println("LinkedList Access Time: " + linkedListAccessTime + " ns");
        System.out.println("ArrayList Access Time: " + arrayListAccessTime + " ns");
        System.out.println("LinkedList Update Time: " + linkedListUpdateTime + " ns");
        System.out.println("ArrayList Update Time: " + arrayListUpdateTime + " ns");
    }


}

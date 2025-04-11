package com.vladproduction.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareArrayListLinkedList {
    public static void main(String[] args) {
        // Test insertion performance
        testInsertionPerformance();

        // Test deletion performance
        testDeletionPerformance();

        // Test access performance
        testAccessPerformance();

        // Test update performance
        testUpdatePerformance();

    }

    private static void testInsertionPerformance() {
        List<String> linkedList = new LinkedList<>();
        long linkedListInsertionTime = timingInsertion(linkedList);
        System.out.println("LinkedList insertion time: " + linkedListInsertionTime + " ns");

        List<String> arrayList = new ArrayList<>();
        long arrayListInsertionTime = timingInsertion(arrayList);
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
        // Initialize the linked list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            linkedList.add(String.valueOf(i));
        }
        long linkedListDeletionTime = timingDeletion(linkedList);
        System.out.println("LinkedList deletion time: " + linkedListDeletionTime + " ns");

        List<String> arrayList = new ArrayList<>();
        // Initialize the array list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            arrayList.add(String.valueOf(i));
        }
        long arrayListDeletionTime = timingDeletion(arrayList);
        System.out.println("ArrayList deletion time: " + arrayListDeletionTime + " ns");
    }

    private static long timingDeletion(List<String> list) {
        long startTime = System.nanoTime();
        // Delete the first 500 elements from the list
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
        long linkedListAccessTime = timingAccess(linkedList);
        System.out.println("LinkedList access time: " + linkedListAccessTime + " ns");

        List<String> arrayList = new ArrayList<>();
        // Initialize the array list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            arrayList.add(String.valueOf(i));
        }
        long arrayListAccessTime = timingAccess(arrayList);
        System.out.println("ArrayList access time: " + arrayListAccessTime + " ns");
    }

    private static long timingAccess(List<String> list) {
        long startTime = System.nanoTime();
        // Access the 500th element
        String element = list.get(500);
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testUpdatePerformance() {
        List<String> linkedList = new LinkedList<>();
        // Initialize the linked list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            linkedList.add(String.valueOf(i));
        }
        long linkedListUpdateTime = timingUpdate(linkedList);
        System.out.println("LinkedList update time: " + linkedListUpdateTime + " ns");

        List<String> arrayList = new ArrayList<>();
        // Initialize the array list with 1000 elements
        for (int i = 0; i < 1000; i++) {
            arrayList.add(String.valueOf(i));
        }
        long arrayListUpdateTime = timingUpdate(arrayList);
        System.out.println("ArrayList update time: " + arrayListUpdateTime + " ns");
    }

    private static long timingUpdate(List<String> list) {
        long startTime = System.nanoTime();
        // Update the 500th element
        list.set(500, "Updated Value");
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }


}

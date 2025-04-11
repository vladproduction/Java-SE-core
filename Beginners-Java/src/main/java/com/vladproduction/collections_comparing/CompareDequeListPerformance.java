package com.vladproduction.collections_comparing;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class CompareDequeListPerformance {

    // Variables to store performance results
    private static long arrayDequeAddFirstTime;
    private static long linkedListAddFirstTime;
    private static long arrayDequeAddLastTime;
    private static long linkedListAddLastTime;
    private static long arrayDequeRemoveFirstTime;
    private static long linkedListRemoveFirstTime;
    private static long arrayDequeRemoveLastTime;
    private static long linkedListRemoveLastTime;

    public static void main(String[] args) {
        // Test adding elements at front performance
        testAddFirstPerformance();

        // Test adding elements at end performance
        testAddLastPerformance();

        // Test removing elements from front performance
        testRemoveFirstPerformance();

        // Test removing elements from end performance
        testRemoveLastPerformance();

        // Summary of results
        printSummary();
    }

    private static void testAddFirstPerformance() {
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDequeAddFirstTime = timingAddFirstOperation(arrayDeque);
        System.out.println("ArrayDeque addFirst time: " + arrayDequeAddFirstTime + " ns");

        Deque<String> linkedList = new LinkedList<>();
        linkedListAddFirstTime = timingAddFirstOperation(linkedList);
        System.out.println("LinkedList addFirst time: " + linkedListAddFirstTime + " ns");
    }

    private static long timingAddFirstOperation(Deque<String> deque) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            deque.addFirst(String.valueOf(i)); // Add elements to the front
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testAddLastPerformance() {
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDequeAddLastTime = timingAddLastOperation(arrayDeque);
        System.out.println("ArrayDeque addLast time: " + arrayDequeAddLastTime + " ns");

        Deque<String> linkedList = new LinkedList<>();
        linkedListAddLastTime = timingAddLastOperation(linkedList);
        System.out.println("LinkedList addLast time: " + linkedListAddLastTime + " ns");
    }

    private static long timingAddLastOperation(Deque<String> deque) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            deque.addLast(String.valueOf(i)); // Add elements to the end
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testRemoveFirstPerformance() {
        // Create and populate deques for removal testing
        Deque<String> arrayDeque = new ArrayDeque<>();
        Deque<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            arrayDeque.addLast(String.valueOf(i));
            linkedList.addLast(String.valueOf(i));
        }

        arrayDequeRemoveFirstTime = timingRemoveFirstOperation(arrayDeque);
        System.out.println("ArrayDeque removeFirst time: " + arrayDequeRemoveFirstTime + " ns");

        linkedListRemoveFirstTime = timingRemoveFirstOperation(linkedList);
        System.out.println("LinkedList removeFirst time: " + linkedListRemoveFirstTime + " ns");
    }

    private static long timingRemoveFirstOperation(Deque<String> deque) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            deque.removeFirst(); // Remove elements from the front
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testRemoveLastPerformance() {
        // Create and populate deques for removal testing
        Deque<String> arrayDeque = new ArrayDeque<>();
        Deque<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            arrayDeque.addLast(String.valueOf(i));
            linkedList.addLast(String.valueOf(i));
        }

        arrayDequeRemoveLastTime = timingRemoveLastOperation(arrayDeque);
        System.out.println("ArrayDeque removeLast time: " + arrayDequeRemoveLastTime + " ns");

        linkedListRemoveLastTime = timingRemoveLastOperation(linkedList);
        System.out.println("LinkedList removeLast time: " + linkedListRemoveLastTime + " ns");
    }

    private static long timingRemoveLastOperation(Deque<String> deque) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            deque.removeLast(); // Remove elements from the end
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void printSummary() {
        System.out.println("\nPerformance Summary:");
        System.out.println("ArrayDeque AddFirst Time: " + arrayDequeAddFirstTime + " ns");
        System.out.println("LinkedList AddFirst Time: " + linkedListAddFirstTime + " ns");
        System.out.println("ArrayDeque AddLast Time: " + arrayDequeAddLastTime + " ns");
        System.out.println("LinkedList AddLast Time: " + linkedListAddLastTime + " ns");
        System.out.println("ArrayDeque RemoveFirst Time: " + arrayDequeRemoveFirstTime + " ns");
        System.out.println("LinkedList RemoveFirst Time: " + linkedListRemoveFirstTime + " ns");
        System.out.println("ArrayDeque RemoveLast Time: " + arrayDequeRemoveLastTime + " ns");
        System.out.println("LinkedList RemoveLast Time: " + linkedListRemoveLastTime + " ns");
    }

}

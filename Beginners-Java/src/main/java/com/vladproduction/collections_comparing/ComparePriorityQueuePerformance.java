package com.vladproduction.collections_comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class ComparePriorityQueuePerformance {

    // Variables to store performance results
    private static long priorityQueueAddTime;
    private static long arrayListAddTime;
    private static long linkedListAddTime;
    private static long priorityQueueRemoveTime;
    private static long arrayListRemoveTime;
    private static long linkedListRemoveTime;
    private static long priorityQueueAccessTime;
    private static long arrayListAccessTime;
    private static long linkedListAccessTime;

    public static void main(String[] args) {
        // Test addition performance
        testAddPerformance();

        // Test removal of highest priority element performance
        testRemovePerformance();

        // Test accessing highest priority element performance
        testAccessPerformance();

        // Summary of results
        printSummary();
    }

    private static void testAddPerformance() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueueAddTime = timingAddOperation(priorityQueue);
        System.out.println("PriorityQueue add time: " + priorityQueueAddTime + " ns");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayListAddTime = timingAddOperationList(arrayList);
        System.out.println("ArrayList add time: " + arrayListAddTime + " ns");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedListAddTime = timingAddOperationList(linkedList);
        System.out.println("LinkedList add time: " + linkedListAddTime + " ns");
    }

    private static long timingAddOperation(PriorityQueue<Integer> queue) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            queue.add(i); // Add elements to the queue
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingAddOperationList(ArrayList<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(i); // Add elements to the list
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingAddOperationList(LinkedList<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(i); // Add elements to the list
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testRemovePerformance() {
        // Create and populate collections for removal testing
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            priorityQueue.add(i);
            arrayList.add(i);
            linkedList.add(i);
        }

        // Sort lists in reverse order to simulate priority queue behavior
        Collections.sort(arrayList, Collections.reverseOrder());
        Collections.sort(linkedList, Collections.reverseOrder());

        priorityQueueRemoveTime = timingRemoveOperation(priorityQueue);
        System.out.println("PriorityQueue remove time: " + priorityQueueRemoveTime + " ns");

        arrayListRemoveTime = timingRemoveOperationList(arrayList);
        System.out.println("ArrayList remove time: " + arrayListRemoveTime + " ns");

        linkedListRemoveTime = timingRemoveOperationList(linkedList);
        System.out.println("LinkedList remove time: " + linkedListRemoveTime + " ns");
    }

    private static long timingRemoveOperation(PriorityQueue<Integer> queue) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            queue.poll(); // Remove elements from the queue
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingRemoveOperationList(ArrayList<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(0); // Remove highest priority (first) element
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingRemoveOperationList(LinkedList<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(0); // Remove highest priority (first) element
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testAccessPerformance() {
        // Create and populate collections for access testing
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            priorityQueue.add(i);
            arrayList.add(i);
            linkedList.add(i);
        }

        // Sort lists to simulate priority queue behavior
        Collections.sort(arrayList);
        Collections.sort(linkedList);

        priorityQueueAccessTime = timingAccessOperation(priorityQueue);
        System.out.println("PriorityQueue access time: " + priorityQueueAccessTime + " ns");

        arrayListAccessTime = timingAccessOperationList(arrayList);
        System.out.println("ArrayList access time: " + arrayListAccessTime + " ns");

        linkedListAccessTime = timingAccessOperationList(linkedList);
        System.out.println("LinkedList access time: " + linkedListAccessTime + " ns");
    }

    private static long timingAccessOperation(PriorityQueue<Integer> queue) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            queue.peek(); // Access the highest priority element without removing
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingAccessOperationList(ArrayList<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.get(0); // Access the first element (highest priority)
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingAccessOperationList(LinkedList<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.getFirst(); // Access the first element (highest priority)
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void printSummary() {
        System.out.println("\nPerformance Summary:");
        System.out.println("PriorityQueue Add Time: " + priorityQueueAddTime + " ns");
        System.out.println("ArrayList Add Time: " + arrayListAddTime + " ns");
        System.out.println("LinkedList Add Time: " + linkedListAddTime + " ns");
        System.out.println("PriorityQueue Remove Time: " + priorityQueueRemoveTime + " ns");
        System.out.println("ArrayList Remove Time: " + arrayListRemoveTime + " ns");
        System.out.println("LinkedList Remove Time: " + linkedListRemoveTime + " ns");
        System.out.println("PriorityQueue Access Time: " + priorityQueueAccessTime + " ns");
        System.out.println("ArrayList Access Time: " + arrayListAccessTime + " ns");
        System.out.println("LinkedList Access Time: " + linkedListAccessTime + " ns");
    }

}

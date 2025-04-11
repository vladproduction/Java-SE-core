package com.vladproduction.collections_comparing;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CompareStackDequePerformance {

    // Variables to store performance results
    private static long stackPushTime;
    private static long arrayDequePushTime;
    private static long stackPopTime;
    private static long arrayDequePopTime;

    public static void main(String[] args) {
        // Test push performance
        testPushPerformance();

        // Test pop performance
        testPopPerformance();

        // Summary of results
        printSummary();
    }

    private static void testPushPerformance() {
        Stack<String> stack = new Stack<>();
        stackPushTime = timingPushOperationStack(stack);
        System.out.println("Stack push time: " + stackPushTime + " ns");

        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDequePushTime = timingPushOperationDeque(arrayDeque);
        System.out.println("ArrayDeque push time: " + arrayDequePushTime + " ns");
    }

    private static long timingPushOperationStack(Stack<String> stack) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stack.push(String.valueOf(i)); // Push elements to the stack
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingPushOperationDeque(Deque<String> deque) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            deque.push(String.valueOf(i)); // Push elements to the deque
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testPopPerformance() {
        // Create and populate collections for pop testing
        Stack<String> stack = new Stack<>();
        Deque<String> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 10000; i++) {
            stack.push(String.valueOf(i));
            arrayDeque.push(String.valueOf(i));
        }

        stackPopTime = timingPopOperationStack(stack);
        System.out.println("Stack pop time: " + stackPopTime + " ns");

        arrayDequePopTime = timingPopOperationDeque(arrayDeque);
        System.out.println("ArrayDeque pop time: " + arrayDequePopTime + " ns");
    }

    private static long timingPopOperationStack(Stack<String> stack) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            stack.pop(); // Pop elements from the stack
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static long timingPopOperationDeque(Deque<String> deque) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            deque.pop(); // Pop elements from the deque
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void printSummary() {
        System.out.println("\nPerformance Summary:");
        System.out.println("Stack Push Time: " + stackPushTime + " ns");
        System.out.println("ArrayDeque Push Time: " + arrayDequePushTime + " ns");
        System.out.println("Stack Pop Time: " + stackPopTime + " ns");
        System.out.println("ArrayDeque Pop Time: " + arrayDequePopTime + " ns");
    }

}

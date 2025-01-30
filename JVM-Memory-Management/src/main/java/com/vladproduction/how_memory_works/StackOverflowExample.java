package com.vladproduction.how_memory_works;

public class StackOverflowExample {
    public static void recursiveMethod() {
        // Recursive call without a termination condition
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred: " + e.getMessage());
        }
    }
}

package com.vladproduction.exceptions;

public class ErrorsDemo {
    public static void main(String[] args) {
        // OutOfMemoryError, StackOverflowError, etc.

//        recursiveMethod(); //StackOverflowError

        System.out.println(factorial(5)); //120

    }

    public static void recursiveMethod() {
        // This method calls itself without a base case, leading to infinite recursion
        recursiveMethod();
    }

    // StackOverFlow fixed:
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive call
    }

}

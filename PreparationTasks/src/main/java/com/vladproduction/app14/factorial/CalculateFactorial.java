package com.vladproduction.app14.factorial;

import java.util.stream.IntStream;

/**
 * Iterative Approach: Simple and efficient, particularly for small n.
 * Recursive Approach: Elegant, but not suitable for large n due to stack overflow risk.
 * Tail Recursive Approach: Optimized recursion but needs specific support in some languages.
 * Java Streams: Functional approach for modern Java developers, concise but may not be the most efficient for large values.
 * Memoization: Great for reducing repeated calculations in recursive scenarios.
 * */
public class CalculateFactorial {
    public static void main(String[] args) {

        int n = 5;

        int iterativeApproach = iterativeApproach(n);
        System.out.println("Iterative approach: " + iterativeApproach);

        int recursiveApproach = recursiveApproach(n);
        System.out.println("Recursive approach: " + recursiveApproach);

        int tailRecursiveApproach = tailRecursiveApproach(n);
        System.out.println("Tail recursive approach: " + tailRecursiveApproach);

        int streamApproach = streamApproach(n);
        System.out.println("Stream approach: " + streamApproach);

        int memoizedRecursiveApproach = memoizedRecursiveApproach(n);
        System.out.println("Memoized recursive approach: " + memoizedRecursiveApproach);

    }

    private static int iterativeApproach(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
             result *= i;
        }
        
        return result;
    }

    private static int recursiveApproach(int n) {
        if(n == 1){
            return 1;
        }
        return n * recursiveApproach(n - 1);
    }

    //A more optimized recursive version that maintains a single stack frame is called tail recursion.
    private static int tailRecursiveApproach(int n) {
        return tailRecursive(n, 1); // Initial accumulator value
    }

    private static int tailRecursive(int n, int accumulator){
        if(n == 0 || n == 1){
            return accumulator;
        }
        return tailRecursive(n - 1, n * accumulator);
    }

    //using stream:
    private static int streamApproach(int n){
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    //optimizing recursive calls by storing previously calculated results (memoization)
    private static int memoizedRecursiveApproach(int n){
        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] * i;
        }
        return memo[n];
    }
}

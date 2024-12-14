package com.vladproduction.flow_control.loops;

public class ForLoopSumOfNumbers {
    public static void main(String[] args) {
        case1();
        case2();
        case3();
    }

    private static void case1() {
        int sum = 0;
        int i = 1;
        for(; i <= 100; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private static void case2() {
        int sum = 0;
        for(int i = 1; i <= 100; ){
            sum += i++;
        }
        System.out.println("sum = " + sum);
    }

    private static void case3() {
        // This loop computes the sum of integers from 1 to 100
        for (int i = 1, sum = 0; i <= 100; sum += i++) {
            // Loop body can remain empty
            // The value of sum will be updated in each iteration
        }

        // We cannot access sum here, so we will either declare it
        // outside or simply print directly
        System.out.println("Sum of numbers from 1 to 100 is: " + (sum(100))); // Method to calculate sum
    }

    // A method to calculate the sum
    private static int sum(int n) {
        return n * (n + 1) / 2; // Formula for the sum of the first n natural numbers
    }



}

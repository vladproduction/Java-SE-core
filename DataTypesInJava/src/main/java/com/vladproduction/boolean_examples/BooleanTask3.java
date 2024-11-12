package com.vladproduction.boolean_examples;

/**
 * Write a program that takes three positive integers as command-line
 * arguments and prints false if any one of them is greater than or equal to the sum
 * of the other two and true otherwise.
 * (Note: This computation tests whether the three numbers could be the lengths of the sides of some triangle.)
 * */
public class BooleanTask3 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please provide exactly three positive integers.");
            return;
        }

        //triangle condition case: 3 4 5
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            // Check if any of the numbers is greater than or equal to the sum of the other two
            boolean isTriangleCondition = (a < b + c) && (b < a + c) && (c < a + b);
            System.out.println(isTriangleCondition);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }


    }

}



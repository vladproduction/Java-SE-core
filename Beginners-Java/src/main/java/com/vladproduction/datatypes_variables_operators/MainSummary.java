package com.vladproduction.datatypes_variables_operators;

public class MainSummary {
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 10;
        int num2 = 20;
        double price = 19.99;
        boolean isAvailable = true;
        char grade = 'A';
        String name = "John Doe";

        // Arithmetic operations
        int sum = num1 + num2;
        int difference = num2 - num1;
        int product = num1 * num2;
        double quotient = (double) num2 / num1;
        int remainder = num2 % num1;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational operations
        boolean isGreater = num2 > num1;
        boolean isEqual = num1 == num2;

        // Print results
        System.out.println("Is num2 greater than num1? " + isGreater);
        System.out.println("Are num1 and num2 equal? " + isEqual);

        // Logical operations
        boolean result = (num1 > 5) && (num2 < 30);
        boolean result2 = (num1 > 5) || (num2 > 30);

        // Print results
        System.out.println("Result of AND operation: " + result);
        System.out.println("Result of OR operation: " + result2);
    }
}

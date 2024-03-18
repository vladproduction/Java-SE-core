package com.vladproduction.vp39_checked_unchecked.unchecked;

import java.util.List;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Some_Unchecked {

    public String greetUser(String name) {
        if (name == null) { // Null check to avoid NullPointerException
            throw new NullPointerException("Name cannot be null");
        }
        return "Hello, " + name + "!";
    }

    public int getThirdElement(int[] numbers) {
        if (numbers.length < 3) { // Check array size to avoid ArrayIndexOutOfBoundsException
            throw new ArrayIndexOutOfBoundsException("Array must have at least 3 elements");
        }
        return numbers[2];
    }

    public Object getObjectFromList(List list) {
        Object obj = list.get(0);
        if (obj instanceof String) { // Check type to avoid ClassCastException
            return (String) obj;
        } else {
            throw new ClassCastException("Expected String object in the list");
        }
    }

    public double calculateAverage(int numerator, int denominator) {
        if (denominator == 0) { // Check for division by zero to avoid ArithmeticException
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }
    /**ArithmeticException is thrown for mathematical errors like division by zero. This example showcases
     * checking for division by zero before performing the calculation. If the denominator is zero, it throws
     * an exception, preventing an unexpected error at runtime. The caller can handle this exception and provide
     * a meaningful error message to the user.*/

    public int parseStringToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) { // Handle NumberFormatException for invalid input
            throw new IllegalArgumentException("Invalid input format. Please enter a number.");
        }
    }
    /**NumberFormatException arises when you try to convert a string to a number format (e.g., integer, double)
     * but the string doesn't contain a valid numerical representation. Here, parseStringToInt uses a try-catch block.
     * If the conversion throws NumberFormatException, it throws a more specific IllegalArgumentException to inform
     * the caller about the invalid input format.*/

}

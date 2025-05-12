package com.vladproduction.app20.wrappers_conversions;

public class WrapperClass {
    public static void main(String[] args) {

        // Autoboxing: Converting primitive to Wrapper Object
        int number = 10;
        Integer num1 = number; // Object
        //Or
        Integer num = 10; // Equivalent to Integer.valueOf(10)
        Double price = 99.99;
        Character letter = 'A';
        Boolean bool = true;

        // Unboxing: Converting Wrapper Object to primitive
        int n = num; // Equivalent to num.intValue()
        double p = price;
        char l = letter;
        boolean b = bool;

        // Wrapper class methods
        String str = Integer.toString(100);
        // Convert int to String
        int parsedValue = Integer.parseInt("50");
        // Convert String to int
        System.out.println("Autoboxed Integer: " + num);
        System.out.println("Unboxed int: " + n);
        System.out.println("Converted String: " + str);
        System.out.println("Parsed int: " + parsedValue);

    }
}

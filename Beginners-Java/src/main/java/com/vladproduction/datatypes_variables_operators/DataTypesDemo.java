package com.vladproduction.datatypes_variables_operators;

public class DataTypesDemo {
    public static void main(String[] args) {

        /*Primitive Data Types:

        byte: 8-bit signed integer.
        short: 16-bit signed integer.
        int: 32-bit signed integer.
        long: 64-bit signed integer.
        float: 32-bit floating-point number.
        double: 64-bit floating-point number.
        boolean: Represents true or false values.
        char: 16-bit Unicode character.
        Reference Data Types:

        Classes: e.g., String, Scanner, ArrayList.
                Interfaces: e.g., List, Map.
                Arrays: e.g., int[], String[].*/

        int number = 10;
        number = 11;
        System.out.println("number = " + number);

        float numbFloat = 20.26f;
        double numbDouble = 20.26982734d;
        System.out.println("numbFloat = " + numbFloat);
        System.out.println("numbFloat = " + numbDouble);

        boolean isTrue = true;
        System.out.println("isTrue = " + isTrue);

        char symbol = '1';
        System.out.println("symbol = " + symbol);

        String variable = "Hello World";
        System.out.println("variable = " + variable);

        int age = 25;
        double price = 19.99;
        char grade = 'A';
        boolean isStudent = true;
        String name = "John Doe";
    }
}

package com.vladproduction.datatypes.literals;

/**
 * class demonstrates important concepts regarding how String objects are
 * created, referenced, and compared in Java.
 * Here’s a detailed explanation of each part of the code, focusing on the characteristics and behavior
 * of the String` class*/
public class StringReferencesManipulation {
    public static void main(String[] args) {
        // Declaring and initializing a String literal
        String test1 = "test1";  // test1 references a String object in the String Pool

        // Assigning reference
        String test2 = test1;    // test2 references the same String object as test1

        // Creating a new String object
        String test3 = new String("test1"); // test3 creates a new String object in heap memory

        // Comparison using '==' operator
        System.out.println(test1 == test2);  // true, both reference the same object in String Pool
        System.out.println(test1 == test3);  // false, test3 refers to a different object in heap memory
        System.out.println(test2 == test3);  // false, test2 refers to the String Pool object, while test3 refers to a different object

        // Comparison using 'equals()' method
        System.out.println(test1.equals(test2)); // true, both have the same content
        System.out.println(test1.equals(test3)); // true, both have the same content
        System.out.println(test2.equals(test3)); // true, both have the same content

    }
}

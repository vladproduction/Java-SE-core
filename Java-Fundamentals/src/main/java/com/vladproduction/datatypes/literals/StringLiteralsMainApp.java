package com.vladproduction.datatypes.literals;

public class StringLiteralsMainApp {
    public static void main(String[] args) {

        String string = null; //object as type String.class assign to variable str with value null;
        String string1 = "java"; // String pool hold value 'java' for variable str1 of type String;

        // Declare a String variable named 'str' and initialize it to null.
        // 'null' means that 'str' does not reference any object at this point.
        String str = null;

        // Declare another String variable named 'str1' and initialize it with the literal "java".
        // In Java, String literals are stored in a special memory area called the String Pool.
        // When we create a String in this way, Java checks the String Pool to see if the value already exists.
        // If "java" already exists in the pool, 'str1' will reference that instance; otherwise, a new String
        // object is created and added to the pool.
        String str1 = "java";

        // Let's add some more examples and comments to illustrate String operations:

        // Example of using String concatenation
        String str2 = str1 + " programming"; // Concatenates "java" with " programming"
        // 'str2' now references the String "java programming".

        // Example of comparing Strings
        boolean isEqual = str1.equals("java"); // This checks if 'str1' contains the same sequence of characters as "java"
        // isEqual will be true since both represent the same text.

        // Example of String length
        int length = str1.length(); // This will return the length of the string 'str1', which is 4.

        // Printing out the results:
        System.out.println("str1: " + str1);             // Output: str1: java
        System.out.println("str2: " + str2);             // Output: str2: java programming
        System.out.println("Is str1 equal to 'java'? " + isEqual); // Output: Is str1 equal to 'java'? true
        System.out.println("Length of str1: " + length); // Output: Length of str1: 4

        // Null check example
        if (str == null) {
            System.out.println("str is null."); // Output: str is null.
        } else {
            System.out.println("str has a value: " + str);
        }

    }



}

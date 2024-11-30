package com.vladproduction.app01;

public class Main01 {
    public static void main(String[] args) {
        String message = "Hello, World!";
        System.out.println(message);

// string concatenation
        String greeting = "Hello";
        String name = "John";
        String fullGreeting = greeting + ", " + name + "!";
        System.out.println(fullGreeting);

// string length
        int length = message.length();
        System.out.println("Length of the message: " + length);

// substring extraction
        String subStr = message.substring(7);
        System.out.println("Substring: " + subStr);

// searching in a string
        boolean containsWorld = message.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

    }
}

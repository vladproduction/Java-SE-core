package com.vladproduction.app09.revert_string;

public class RevertString {
    public static void main(String[] args) {

        String reversed1 = reverseString("Hello World!");
//        String reversed1 = reverseString("");


//        String reversed1 = reverseString("  2+2 = 4  ");
        System.out.println("Reversed1: " + reversed1);

        // Using StringBuilder inline
        String reversed2 = new StringBuilder("automation").reverse().toString();
        System.out.println("Reversed2: " + reversed2);

    }

    private static String reverseString(String input) {
        if (input == null || input.length() == 0 || input.trim().length() == 0){
            throw new IllegalArgumentException("Current String is empty or null, reverse string cannot be finished!");
        }
        return new StringBuilder(input).reverse().toString();
    }
}

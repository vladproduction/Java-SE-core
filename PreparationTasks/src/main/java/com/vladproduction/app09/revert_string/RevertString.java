package com.vladproduction.app09.revert_string;

public class RevertString {
    public static void main(String[] args) {

//        String reversed = reverseString("Hello World!");
//        String reversed = reverseString("");
        String reversed = reverseString("  2+2 = 4  ");
        System.out.println("reversed = " + reversed);

    }

    private static String reverseString(String input) {
        if (input == null || input.length() == 0 || input.trim().length() == 0){
            throw new IllegalArgumentException("Current String is empty or null, reverse string cannot be finished!");
        }
        return new StringBuilder(input).reverse().toString();
    }
}

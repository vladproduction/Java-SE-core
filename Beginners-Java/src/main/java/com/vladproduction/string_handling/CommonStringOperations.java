package com.vladproduction.string_handling;

public class CommonStringOperations {
    public static void main(String[] args) {

        //find length of the current string
        String str = "Hello";
        int length = str.length(); // length is 5
        System.out.println(length);

        //Java uses zero-based indexing for Strings, meaning the first character is at index 0 and the last character is at index length - 1
        char firstChar = str.charAt(0); // 'H'
        char lastChar = str.charAt(length - 1); // 'o'

        //String Comparison using equals() method:
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2); // true

        //Using equalsIgnoreCase() Method:
        //This method compares two strings while ignoring case differences.
        String str3 = "hello";
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3); // true

        //Using compareTo() Method:
        //This method compares strings lexicographically. It returns a negative number if the first string comes before,
        //a positive number if it comes after, and 0 if both are equal.
        int comparisonIgnoreCase = str1.compareToIgnoreCase(str3); // 0, because they are equal when case is ignored

    }
}

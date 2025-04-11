package com.vladproduction.string_handling;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //returns the character at the specified index.
        String str = "Hello";
        char ch = str.charAt(1); // 'e'

        //substring(int beginIndex, int endIndex):
        //This method returns a new string that is a substring of the original string.
        //The substring starts from beginIndex and extends to endIndex - 1.
        String sub = str.substring(1, 4); // "ell"

        String car = "car";
        String a = car.substring(1, 2);
        System.out.println("a = " + a);

        //concat(String str):
        //Concatenates the specified string to the end of the current string.
        String carMoving = car.concat(" is moving now").concat(" !");
        System.out.println("carMoving = " + carMoving.toUpperCase()); //and we can make UpperCase

        //toLowerCase() and toUpperCase():
        //These methods convert the entire string to lowercase or uppercase, respectively.

        String lower = str.toLowerCase(); // "hello"
        String upper = str.toUpperCase(); // "HELLO"

        //indexOf(String str):
        //Returns the index of the first occurrence of the specified substring. If the substring is not found, it returns -1.
        int index = str.indexOf("l"); // 2
        System.out.println("index = " + index);

        //lastIndexOf(String str):
        //Similar to indexOf(), but returns the index of the last occurrence of the specified substring.
        String string100 = "String100";
        int lastIndex = string100.lastIndexOf("0"); // 8
        System.out.println("lastIndex = " + lastIndex);

        //replace(CharSequence target, CharSequence replacement):
        //Replaces all occurrences of the specified target sequence with the specified replacement sequence.
        String test = "test";
        String replaced = test.replace("s", "x"); // "text"
        System.out.println("replaced = " + replaced);

        //trim():
        //This method removes leading and trailing whitespace from the string.
        String padded = "   Hello, World!   ";
        String trimmed = padded.trim(); // "Hello, World!"
        System.out.println("trimmed = " + trimmed);

        //split(String regex):
        //Splits the string around matches of the given regular expression and returns an array of strings.
        String csv_fruits = "apple,banana,orange, mango, apricot, lime";
        String[] fruits = csv_fruits.split(","); // ["apple", "banana", "orange"]
        System.out.println("Arrays.toString(fruits) = " + Arrays.toString(fruits));

        //isEmpty():
        //Checks if the string is empty (i.e., has a length of 0).
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty(); // true

        //contains(CharSequence sequence):
        //Checks if the string contains the specified sequence of characters.
        boolean hasHello = str.contains("Hello"); // true

        //check for String is null
        String nullString = null;
        if(nullString != null) {
            System.out.println("nullString = " + nullString);
        }
        else {
            System.out.println("nullString = null");
        }

    }
}

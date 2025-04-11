package com.vladproduction.string_handling;

public class StringDemo {
    public static void main(String[] args) {

        String str = "Hello";
        str = str + " World"; // created a new String object "Hello World" and assigns it to str

        //literals:
        String str1 = "Hello";

        // new keyword:
        String str2 = new String("Hello"); //allocate new memory storage to hold this new string object in the heap

        /*The difference is that string literals are stored in a special memory area called the string pool,
        whereas using new creates a new object in the heap.*/
    }
}

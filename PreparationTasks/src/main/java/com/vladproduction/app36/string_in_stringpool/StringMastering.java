package com.vladproduction.app36.string_in_stringpool;

public class StringMastering {
    public static void main(String[] args) {

        //check the content:
        String a = "Hello";
        String b = "Hello";
        System.out.println(a.equals(b)); // true


        //check if two strings are the same by referencing in memory
        String a1 = new String("Hello");
        String b1 = "Hello";
        System.out.println(a1 == b1); // false
        System.out.println(a1.equals(b1)); // true
        /*have the same content, but == returns false because a was created
        using new, so it's a different object in the heap.*/

    }
}

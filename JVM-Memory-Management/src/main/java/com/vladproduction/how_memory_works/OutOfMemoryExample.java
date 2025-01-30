package com.vladproduction.how_memory_works;

import java.util.ArrayList;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        try {
            // Create a list to hold a large number of elements
            ArrayList<String> list = new ArrayList<>();
            while (true) {
                // Continuously add elements to the list
                list.add("This is a test string to fill up memory");
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError occurred: " + e.getMessage());
        }
    }
}

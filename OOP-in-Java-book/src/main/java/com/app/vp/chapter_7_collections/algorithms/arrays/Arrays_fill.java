package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;

public class Arrays_fill {
    public static void main(String[] args) {

        //1)fill
        int[] numbs = new int[5]; // Create an empty integer array of size 5

        // Fill all elements with the value 10
        Arrays.fill(numbs, 10);

        System.out.println("Array after filling: " + java.util.Arrays.toString(numbs));

        //2)fill (from-to) indexes by values:
        // Array of integers
        int[] numbers = new int[7];

        // Filling the entire array with the value 5
        System.out.println("Original array (empty): " + java.util.Arrays.toString(numbers));
        Arrays.fill(numbers, 5);
        System.out.println("Array after filling all elements (5): " + java.util.Arrays.toString(numbers));

        // Filling a specific range with the value 'X'
        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("Original character array: " + new String(characters));
        Arrays.fill(characters, 2, 5, 'X');  // From index 2 (inclusive) to 5 (exclusive)
        System.out.println("Array after filling a range (2 to 5 with 'X'): " + new String(characters));

    }
}

package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;

public class Arrays_copyOfRange {
    public static void main(String[] args) {
        // Original array of characters
        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f'};

        // Copy characters from index 2 (inclusive) to index 5 (exclusive)
        char[] copy1 = Arrays.copyOfRange(characters, 2, 5);

        // Copy characters from index 0 (inclusive) to the end (exclusive)
        char[] copy2 = Arrays.copyOfRange(characters, 0, characters.length);

        // Copy characters from index 3 (inclusive) beyond the original array length (treated as up to the end)
        char[] copy3 = Arrays.copyOfRange(characters, 3, 10);

        // Print the original and copied arrays
        System.out.println("Original array: " + new String(characters));
        System.out.println("Copy 1 (index 2 to 5): " + new String(copy1));
        System.out.println("Copy 2 (entire array): " + new String(copy2));
        System.out.println("Copy 3 (index 3 to end): " + new String(copy3));
    }
}

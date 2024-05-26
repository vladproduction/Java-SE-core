package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;

public class Arrays_copyOf {
    public static void main(String[] args) {
        // Original array of integers
        int[] original = {1, 2, 3, 4, 5};

        // Create a copy with the same length (5 elements)
        int[] copy1 = Arrays.copyOf(original, original.length);

        // Create a copy with a shorter length (3 elements)
        int[] copy2 = Arrays.copyOf(original, 3);

        // Create a copy with a longer length (7 elements) - filled with zeros for new elements
        int[] copy3 = Arrays.copyOf(original, 7);

        // Print the original and copied arrays
        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Copy 1 (same length): " + Arrays.toString(copy1));
        System.out.println("Copy 2 (shorter length): " + Arrays.toString(copy2));
        System.out.println("Copy 3 (longer length): " + Arrays.toString(copy3));
    }
}

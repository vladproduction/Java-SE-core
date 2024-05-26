package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;

public class ArrayGeneric_copyOf {
    public static <T> T[] copyOf(T[] original, int newLength) {
        // Create a new array of the same type as the original
        T[] copy = (T[]) Arrays.copyOf(original, newLength);
        return copy;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        String[] copy1 = copyOf(names, names.length); // Same length copy

        Integer[] numbers = {10, 20, 30};
        Integer[] copy2 = copyOf(numbers, 2); // Shorter length copy

        System.out.println("Original String array: " + java.util.Arrays.toString(names));
        System.out.println("Copy 1 of String array: " + java.util.Arrays.toString(copy1));
        System.out.println("Original Integer array: " + java.util.Arrays.toString(numbers));
        System.out.println("Copy 2 of Integer array: " + java.util.Arrays.toString(copy2));
    }
}

package com.vladproduction.app22.remove_duplicates_from_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 2, 5, 1, 6, 3, 7};

        removingUsingHashSet(arr); //expected: [1, 2, 3, 5, 6, 7]

    }

    private static void removingUsingHashSet(Integer[] arr) {
        Set<Integer> uniqueSet = new HashSet<>(Arrays.asList(arr));
        Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Unique array (no duplicates): " + Arrays.toString(uniqueArray));
    }
}

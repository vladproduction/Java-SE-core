package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Let's assume that we want to sort an array of objects of type Integer (i.e. T – Integer).
 * In this case, you can use Comparator<Integer> (which compares
 * using Comparator<Integer>)
 * */
public class ArrayGeneric_sort {
    public static void main(String[] args) {
        // Sample array of Integers
        Integer[] numbers = {5, 2, 8, 1, 4};

        // Custom comparator for sorting in descending order
        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // Reverse order by comparing o2 with o1
            }
        };

        // Sort the array using Arrays.sort with the custom comparator
        Arrays.sort(numbers, descendingComparator);

        // Print the sorted array
        System.out.println("Sorted array (descending): ");
        System.out.println(Arrays.toString(numbers));
    }
}

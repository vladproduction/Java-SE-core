package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;

public class Sorting_arr {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the current position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        Sorting_arr.sort(numbers);
        System.out.println(Arrays.toString(numbers));  // Output: [1, 2, 3, 5, 8]
    }

}

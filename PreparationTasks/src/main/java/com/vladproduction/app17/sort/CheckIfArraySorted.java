package com.vladproduction.app17.sort;

public class CheckIfArraySorted {
    public static void main(String[] args) {

        int[] array = {1, 2, 4, 7, 9}; // Sorted array
//        int[] array = {1, 5, 3, 7, 9}; // Unsorted array

        isArraySorted(array);

    }

    private static void isArraySorted(int[] array) {
        boolean isSorted = true;
        int lengthOfArray = array.length;
        System.out.println("Array length: " + lengthOfArray);

        for (int i = 0; i < lengthOfArray - 1; i++) {
            if (array[i] > array[i + 1]) {           //compare two neighbors (if the first one is bigger: return false)
                isSorted = false;
                break;
            }
        }
        System.out.println("Array is sorted: " + isSorted);
    }
}

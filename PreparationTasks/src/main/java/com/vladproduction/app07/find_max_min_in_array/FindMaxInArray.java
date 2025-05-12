package com.vladproduction.app07.find_max_min_in_array;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 700, 8, 9, 10};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max: " + max);
    }
}

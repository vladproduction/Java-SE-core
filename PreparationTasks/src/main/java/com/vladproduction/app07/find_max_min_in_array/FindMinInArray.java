package com.vladproduction.app07.find_max_min_in_array;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 700, 8, 9, 10};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min);
    }
}

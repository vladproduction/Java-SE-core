package com.app.vp.chapter_6_generics;

import java.util.Arrays;

/**
 * Write a generic method to swap the two
 * different elements of the array.
 * */
public class SwapElementsInArray {
    public static void main(String[] args) {

        Integer [] numbs = {1, 2, 3, 4, 5};
        String [] names = {"A", "C", "B"};

        swap(numbs, 2, 4);//[1,2,5,4,3]
        System.out.println(Arrays.toString(numbs));

        swap(names, 1, 2);
        System.out.println(Arrays.toString(names));

    }

    /**
     * method to swap elements in array
     * */
    public static <T> void swap(T[] arr, int i, int j){
        if(i < 0 || i > arr.length || j < 0 || j > arr.length){
            throw new IllegalArgumentException("Invalid indices");
        }
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

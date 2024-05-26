package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;

/**
 * demonstration of static method for searching element from array
 * */
public class Arrays_binarySearch {
    public static void main(String[] args) {

        //content
        int[] arr = {30,20,5,12,55};
        //sorting
        Arrays.sort(arr);
        //print sorted
        System.out.println("arr = " + Arrays.toString(arr));
        //or
        for (int item : arr){
            System.out.println("Element: " + item);
        }
        //value for searching init
        int val = 20;
        int index_of_searching_value = Arrays.binarySearch(arr, val);
        System.out.println("index_of_searching_value (20) = " + index_of_searching_value); //2

    }
}

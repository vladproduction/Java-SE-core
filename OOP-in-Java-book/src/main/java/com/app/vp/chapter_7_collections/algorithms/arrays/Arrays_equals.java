package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;

public class Arrays_equals {
    public static void main(String[] args) {

        //init content
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,7};

        boolean is_arr1_equals_arr2 = Arrays.equals(arr1, arr2);
        System.out.println("is_arr1_equals_arr2 = " + is_arr1_equals_arr2); //false

    }
}

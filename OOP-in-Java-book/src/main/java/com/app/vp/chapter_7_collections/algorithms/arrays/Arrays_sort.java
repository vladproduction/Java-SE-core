package com.app.vp.chapter_7_collections.algorithms.arrays;

import java.util.Arrays;

public class Arrays_sort {
    public static void main(String[] args) {

        //sorting array
        int[] arr1 = {5,3,1,8,1,7,2,4};
        System.out.println("un-sorted: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("sorted: " + Arrays.toString(arr1));
        System.out.println("-------------");
        //sorting array (fromIndex - toIndex)
        int[] arr2 = {4,6,4,3,2,1,16};
        System.out.println("un-sorted: " + Arrays.toString(arr2)); //[4, 6, 4, 3, 2, 1, 16]
        Arrays.sort(arr2, 2, 5);             //index: 0  1  2  3  4  5  6
        System.out.println("sorted: " + Arrays.toString(arr2));   // [4, 6, 2, 3, 4, 1, 16]



    }
}

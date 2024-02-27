package com.vladproduction.arrays;

import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) {


        int arr1 [] = new int[] {5, 8, 9};
        int arr2 [][] = new int[][] {
                {5, 8, 9},
                {6, 7, 8},
                {7, 8, 9, 15}
        };
        System.out.println(arr2[1][1]);
        arr2[0][0] = 15;
        System.out.println(arr2[0][0]);





    }
}

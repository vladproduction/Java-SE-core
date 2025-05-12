package com.vladproduction.app13.revert_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        revertArray1(arr);
        System.out.println(Arrays.toString(arr));

        revertArray2(arr);
        System.out.println(Arrays.toString(arr));

        revertArray3(arr);

    }

    private static void revertArray1(int [] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    private static void revertArray2(int [] array){
        for (int i = 0; i < array.length / 2; i++) {
            //a = a+b
            //b = a-b
            //a = a-b
            //a=5, b=6
            //a=5+6=11; b=6
            //b=11-6=5; a=11
            //a=11-5=6
            //a=6; b=5
            //a=array[i]; b=array[array.length - i - 1]
            array[i] += array[array.length - i - 1];
            array[array.length - i - 1] = array[i] - array[array.length - i - 1];
            array[i] = array[i] - array[array.length - i - 1];
        }
    }

    private static void revertArray3(int [] array){
        System.out.println("Original array: " + Arrays.toString(array));
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            //move pointers
            start++;
            end--;
        }
        System.out.println("Reversed array:" + Arrays.toString(array));
    }

}

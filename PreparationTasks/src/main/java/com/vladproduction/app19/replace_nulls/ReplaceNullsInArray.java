package com.vladproduction.app19.replace_nulls;

import java.util.Arrays;

public class ReplaceNullsInArray {
    public static void main(String[] args) {

        //task: replace each number by product of all other numbers except itself
        //example: 1-> 2*3*4
        //         2-> 1*3*4
        //         3-> 1*2*4
        //         4-> 1*2*3
//        int[] arr = {1,2,3,4}; //standard array                   //Final result: [24, 12, 8, 6]
        int[] arr = {1, 0, 3, 0}; //array with zeros more than 1    //Final result: [0, 0, 0, 0]
//        int[] arr = {1, 2, 3, 0}; //array with one zero ony       //Final result: [0, 0, 0, 6]
        System.out.println("Initial array: " + Arrays.toString(arr)); //Initial array: [1, 2, 3, 4]

        replace(arr);
        System.out.println("Final result: " + Arrays.toString(arr));

    }

    private static void replace(int[] data) {
        int amountedOfZeros = amountOfZeros(data);
        if (amountedOfZeros >= 2) {
            Arrays.fill(data, 0);
            return;
        }
        if (amountedOfZeros == 1) {
            int ignoringZero = calculateProductIgnoringZero(data);
            for (int i = 0; i < data.length; i++) {
                if(data[i] == 0){
                    data[i] = ignoringZero;
                }
                else {
                    data[i] = 0;
                }
            }
            return;
        }
        int product = calculateProduct(data); //1*2*3*4 = 24
        for (int i = 0; i < data.length; i++) {
            data[i] = product / data[i];
            //24/1 = 24
            //24/2 = 12
            //24/3 = 8
            //24/4 = 6
        }

    }

    private static int calculateProduct(int[] data) {
        int p = 1;
        for (int datum : data) {
            p *= datum;
        }
        return p; //24
    }

    private static int calculateProductIgnoringZero(int [] data){
        int p = 1;
        for (int datum : data) {
            if (datum != 0) {
                p *= datum;
            }
        }
        return p;
    }

    private static int amountOfZeros(int[] data) {
        int count = 0;
        for (int datum : data) {
            if (datum == 0) {
                count++;
            }
        }
        return count;
    }

}

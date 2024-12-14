package com.vladproduction.arrays.declare_create;

import java.util.Arrays;

public class ArrayCreator {
    public static void main(String[] args) {
        int[] createdArray = creatorArray();
        System.out.println(Arrays.toString(createdArray));

        //creator with capacity:
        int[] creatorWithCapacity = creatorWithCapacity(10);
        System.out.println(Arrays.toString(creatorWithCapacity));

    }

    private static int[] creatorArray(){
        int[] arr;
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static int[] creatorWithCapacity(int capacity){
        int[] arr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

}

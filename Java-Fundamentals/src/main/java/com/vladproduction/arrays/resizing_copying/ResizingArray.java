package com.vladproduction.arrays.resizing_copying;

public class ResizingArray {
    public static void main(String[] args) {

        //size is 5 in the beginning
        int [] arr = new int[5];

        //we can only change reference to a new arr with a bigger/lower size
        arr = new int[100]; //to make it bigger

        //or to make it smaller:
        arr = new int[3];

        //now arr size is: 3
        System.out.println(arr.length); // 3


    }
}

package com.vladproduction.arrays.reference;

public class Example {
    static int[] arr;

    static {
        int val = arr[0];
    }

    public Example(int[] arrMain){
        this.arr = arrMain;
    }

    public static void main(String[] args) {
        int[] arrMain = {2, 5, 7, 8, 3, 0};
        new Example(arrMain);
    }

}

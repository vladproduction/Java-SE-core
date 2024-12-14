package com.vladproduction.arrays.multidimensional;

public class CreateMultiArray {
    public static void main(String[] args) {

        //create and init simple arr[][];
        int [][] array = new int[][]{ {1,2,3}, {4,5,6}, {7,8,9} };
        int val02 = array[0][2];
        System.out.println("value02 = " + val02); // 3
        int val22 = array[2][2];
        System.out.println("val22 = " + val22); // 9
        int val11 = array[1][1];
        System.out.println("val11 = " + val11); // 5

    }
}

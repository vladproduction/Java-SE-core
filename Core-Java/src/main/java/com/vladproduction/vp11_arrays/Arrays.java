package com.vladproduction.vp11_arrays;

public class Arrays {
    public static void main(String[] args) {

        int number = 10;                //primitive type;   //[10]
        int[] numbers = new int[5];     //referenced type;  //numbers -->[array]
        System.out.println(numbers[0]); //initialized by default as '0'
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
//        System.out.println(numbers[5]); //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        //init our []  (itar hot key)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        System.out.println("-------------------");
//        System.out.println(numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        //if we know numbers before automatic init
        int[] array = {10,20,30,40,50};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }


    }
}

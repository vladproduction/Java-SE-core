package com.vladproduction.arrays.declare_create;

import java.util.Arrays;

public class StringArrayCreator {

    private static final int CAPACITY = 10;
    public static void main(String[] args) {
        //direct init
        String[] strings = {"name1", "name2", "name3", "name4", "name5"};
        System.out.println(Arrays.toString(strings));

        //iterating through for loop
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();

        //String[] array example to create and init method:
        String[] stringArray = createStringArray();
        System.out.println("stringArray = " + Arrays.toString(stringArray));
    }

    private static String[] createStringArray(){
        String[] arr = new String[CAPACITY];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(i); // convert i (integer) into a String value
        }
        return arr;
    }
}

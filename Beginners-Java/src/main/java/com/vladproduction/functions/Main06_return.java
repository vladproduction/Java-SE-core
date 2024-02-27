package com.vladproduction.functions;

import java.util.Arrays;
import java.util.Scanner;

public class Main06_return {
    public static void main(String[] args) {

        String [] names = new String[3];
        String [] sur_names = new String[3];
        Integer [] ages = new Integer[3];

        makeArray(names);
        makeArray(sur_names);
        makeArray(ages);

        printArr(names);
        printArr(sur_names);
        printArr(ages);



    }

    public static String [] makeArray(String [] arr){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter " + (i + 1) + " element: ");
            arr[i] = in.nextLine();
        }
        return arr;
    }

    public static Integer [] makeArray(Integer [] arr){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter " + i + " element: ");
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void printArr(String [] arr){
        for (String item: arr) {
            System.out.println(item);
        }
    }
    public static void printArr(Integer [] arr){
        for (Integer item: arr) {
            System.out.println(item);
        }
    }


}

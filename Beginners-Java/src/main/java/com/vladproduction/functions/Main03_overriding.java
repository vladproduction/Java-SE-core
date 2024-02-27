package com.vladproduction.functions;

import java.util.Arrays;

public class Main03_overriding {
    public static void main(String[] args) {

        String[] names = {"John", "Jonas", "Bob"};
        Integer[] ages = {25, 26, 29};

        function(names);
        function("ages", ages);
        function("names", names);


        System.out.println();
        String[] fruits = {"apple", "banana", "cherry"};
        function("fruits".toUpperCase(), fruits);

    }

    public static void function(String [] arr){
        System.out.println("---------function(...)-------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void function(String title, Integer [] arr){
        System.out.println("---------function_forEach(...)-------");
        System.out.println("context: " + title);
        for (Integer s : arr) {
            System.out.println(s);
        }
    }

    public static void function(String title, String [] arr){
        System.out.println("---------function_forEach_Lambda(...)-------");
        System.out.println("context: " + title);
        Arrays.stream(arr).forEach(System.out::println);
    }


}

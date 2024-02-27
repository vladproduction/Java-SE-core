package com.vladproduction.functions;

import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) {

        String[] names = {"John", "Jonas", "Bob"};
        String[] sur_names = {"Dow", "Hol", "Text"};

        function("names".toUpperCase(), names);
        function("sur_names".toUpperCase(), sur_names);

        System.out.println();
        function_forEach("names".toUpperCase(), names);
        function_forEach("sur_names".toUpperCase(), sur_names);

        System.out.println();
        String[] fruits = {"apple", "banana", "cherry"};
        function_forEach_Lambda("fruits".toUpperCase(), fruits);

    }

    public static void function(String title, String [] arr){
        System.out.println("---------function(...)-------");
        System.out.println("context: " + title);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void function_forEach(String title, String [] arr){
        System.out.println("---------function_forEach(...)-------");
        System.out.println("context: " + title);
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void function_forEach_Lambda(String title, String [] arr){
        System.out.println("---------function_forEach_Lambda(...)-------");
        System.out.println("context: " + title);
        Arrays.stream(arr).forEach(s -> System.out.println(s));
    }


}

package com.vladproduction.creatingString;

public class StringCreatingDemo {

    private static String str = "hello";

    public static void main(String[] args) {

        String str0 = "hello";
        System.out.println(str == str0); //string pool

        char[] chars = {'j', 'a', 'v', 'a'};
        System.out.println(new String(chars));

        byte[] bytes = {48, 53, 65, 90, 97};
        System.out.println(new String(bytes));

        String str1 = 1 + Integer.parseInt("2") + " java" + true + false + null; //this key-words are literals
        System.out.println(str1);

        str1 += str0;
        System.out.println(str1); //concatenation


    }
}

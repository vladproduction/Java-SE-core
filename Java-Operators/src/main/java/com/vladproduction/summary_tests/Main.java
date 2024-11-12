package com.vladproduction.summary_tests;

public class Main {
    public static void main(String[] args) {
        System.out.println(12345 + 5432l); //17777
        System.out.println("2 + 2 = " + 2 + 2); //2 + 2 = 22
        int a = 10;
        int b = 20;
        System.out.println(a > 20 && b > 10);
        System.out.println(a > 20 || b > 10);//true
        System.out.println(! (b > 10));
        System.out.println(! (a > 20));//true
        System.out.println(010 | 4); //12
    }
}

package com.vladproduction.comparing;

public class EqualityOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
        /*a == b = false
        a != b = true
        a > b = false
        a < b = true
        b >= a = true
        b <= a = false*/
    }
}

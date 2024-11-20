package com.vladproduction.super_keyword;

public class Demo {
    public static void main(String[] args) {

        Derived obj = new Derived(1, 2, 3);
        System.out.println("obj = " + obj); //obj = 1 2 (3)
    }
}

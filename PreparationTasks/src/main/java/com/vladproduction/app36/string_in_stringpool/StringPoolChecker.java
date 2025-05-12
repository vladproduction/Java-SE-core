package com.vladproduction.app36.string_in_stringpool;

public class StringPoolChecker {
    public static void main(String[] args) {

        String a = new String("Hello");
        String b = "Hello";
        System.out.println(a == b); // false
        System.out.println(a.equals(b));// true (we check here its content)
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        //place 'a' object from heap into String pool
        a = a.intern();
        System.out.println(a == b);//true
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}

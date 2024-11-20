package com.vladproduction.overloading;

/**
 * This example describes three methods named doJob(), with one and two reference parameters of type String, and a variable parameter of type String.
 * Since variable methods are checked last for matching, this method will only be executed on the third call, when the method is given three arguments.
 * */
public class Main5 {
    static void doJob(String s) {
        System.out.println("String");
    }
    static void doJob(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob(String s1, String... str) {
        System.out.println("String, String...");
    }
    public static void main(String[] args) {
        doJob("hi");
        doJob("hi", "hi");
        doJob("hi", "hi", "hi");

        //output:
        /*String
          String, String
          String, String...*/
    }
}

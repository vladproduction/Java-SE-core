package com.vladproduction.initblocksexamples;

/**
 * example demonstrates the concept of static variables and blocks in Java.
 * The use of a static block for initialization allows the class variable i to be set when the class is loaded
 * */
public class TestStaticApp {
    static int i; //it has to be for all class not only instance (must declare it as static)
    static {
        i = 5;
    }
    public static void main(String[] args) {
        System.out.println(i); //can access because it is class variable;

    }
}

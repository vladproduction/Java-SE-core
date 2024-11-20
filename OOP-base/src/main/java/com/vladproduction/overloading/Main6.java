package com.vladproduction.overloading;

/**
 * This example describes three methods named doJob():
 *  - the first with one parameter of variable type String
 *  - the second with two parameters of type String
 *  - the third with one mandatory parameter of type String and the second parameter of variable type String.
 * If we call the method with one argument, we get ambiguity - two of the described methods (the first and the third) are suitable.
 * Or if we call it with three arguments, we also get ambiguity - two of the described methods (the first and the third) are suitable.
 * Therefore, the compiler will signal an error.
 * */
public class Main6 {
    static void doJob(String... ss) {
        System.out.println("String...");
    }
    static void doJob(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob(String s1, String... str) {
        System.out.println("String, String...");
    }
    public static void main(String[] args) {

        //Ambiguous method call for both cases.

//        doJob("hi");
//        doJob("hi", "hi", "hi");
    }
}

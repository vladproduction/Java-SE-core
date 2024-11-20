package com.vladproduction.overloading;

/**
 * This example describes two methods named doJob():
 *  - the first with a parameter of primitive type byte
 *  - the second with a Byte reference.
 * When methods are called, the arguments are also of type byte and Byte.
 * Therefore, in this case, the types of arguments and parameters match exactly.
 * */
public class Main1 {
    static void doJob(byte b) {
        System.out.println("byte");
    }

    static void doJob(Byte b) {
        System.out.println("Byte");
    }

    public static void main(String[] args) {
        byte b = 5;
        Byte bb = b;
        doJob(b);
        doJob(bb);
    }
}
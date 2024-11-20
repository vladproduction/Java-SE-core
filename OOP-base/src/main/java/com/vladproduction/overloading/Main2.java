package com.vladproduction.overloading;

/**
 * This example describes three methods named doJob(), with parameters of primitive types byte, int, double.
 * When the methods are called, the arguments are of type short, long, and double.
 * Therefore, in this case, the two argument types do not match the parameter types.
 * Since the arguments are of primitive data types, the compiler will first perform an extension cast and
 * check the result for a match with the parameters. The closest existing type for short → int, for long → double.
 * */
public class Main2 {
    static void doJob(byte b ) { System.out.println("byte"); }
    static void doJob(int i ) { System.out.println("int"); }
    static void doJob(double d ) { System.out.println("double"); }

    public static void main(String[] args) {
        short s = 10;
        long x = s;
        double dd = s;
        doJob(s);
        doJob(x);
        doJob(dd);

        //output:
        /*int
        double
        double*/
    }
}

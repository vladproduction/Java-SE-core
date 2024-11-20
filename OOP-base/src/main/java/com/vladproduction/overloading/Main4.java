package com.vladproduction.overloading;
/**
 * This example describes two methods named doJob():
 *  - the first with a parameter of primitive type int
 *  - the second reference Double.
 * When the methods are called, the arguments are of type byte and Byte. Therefore, in this case, for the first call,
 * the determination occurs in the second step, by casting byte → int. For the second call, when casting a reference to the supertype,
 * the required method was not found. Then the compiler unpacks the argument of type Byte into the primitive type byte,
 * and then finds a method with a parameter type of int by extension casting.
 * */
public class Main4 {
    static void doJob(int i ) { System.out.println("int"); }
    static void doJob(Double d) { System.out.println("Double"); }

    public static void main(String[] args) {
        byte b = 5;
        Byte bb = b;
        doJob(b);
        doJob(bb);

        //output:
        /*int
        int*/
    }
}

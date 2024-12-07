package com.vladproduction.tasks;

public class StaticIntegerField {
    static Integer x = 0; //points to an Integer object that represents the value 0.
    static Integer x1; //it is 'null'; meaning it defaults to null (as per Java's rules for uninitialized reference types)
    public static void main(String[] args) {
        //Due to Java's autoboxing, x, which is an Integer, is automatically converted to the primitive int type (which is 0 in this case).
        doStuff(x);

        // attempting to pass x1, which is currently null.
        // Since x1 is declared as an Integer, it gets autoboxed to an int type.
        // However, trying to convert null to int results in a NullPointerException, because a null cannot be converted to a primitive type.
        //doStuff(x1); //exception: NullPointerException; StaticIntegerField.x1" is null

        //could be a kind of solution:
        if (x1 != null) {
            doStuff(x1);
        } else {
            System.out.println("x1 is null; cannot call doStuff with it.");
        }
    }
    static void doStuff(int z ) {
        int z2 = 5;
        System.out.println(z2+z);
    }
}

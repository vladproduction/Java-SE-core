package com.vladproduction.datatypes.arithmetic;

public class ArithmeticMain {
    public static void main(String[] args) {
        typeConverterExample(); //java.lang.Integer value: -124
        typeConverterExample2(); //java.lang.Integer value: -999

        //define variables as final (compiler calculate as type were defined)
        final byte a = 1;
        final byte b = 2;
        byte x = a + b;
        System.out.println("x = " + x);

        //but without define variable as not final (not as constant):
        //we need to cast:
        byte a1 = 1;
        byte b1 = 2;
        byte x1 = (byte) (a1 + b1);
        System.out.println("x1 = " + x1);
    }

    public static void typeConverterExample() {
        int a = 129;
        byte b = 3;
        Object ab = (byte) a + b;
        System.out.println(ab.getClass().getName() + " value: " + ab);
    }

    public static void typeConverterExample2() {
        long a = 2147483647000L;
        int b = 1;
        b += a;
        Object ab = (Object) b;
        System.out.println(ab.getClass().getName() + " value: " + ab);
    }

}



package com.vladproduction.app20.swap_two_numbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swapTwoNumbersByArithmetic(a, b);   // expected a = 20, b = 10
        System.out.println("after method swapTwoNumbersByArithmetic(a, b): " + "a = " + a + ", b = " + b + "\n"); //remains the same 10, 20

        swapTwoNumbersByXOROperator(a, b);            //expected a=20, b=10
        System.out.println("after method swapTwoNumbersByXOROperator(a, b): " + "a = " + a + ", b = " + b + "\n"); //remains the same 10, 20

        Integer aObj1 = new Integer(50);
        Integer bObj2 = new Integer(70);
        swapTwoNumbersAsObjectsByArithmetic(aObj1, bObj2);// expected a = 7, b = 77
        System.out.println("after method swapTwoNumbersAsObjectsByArithmetic(aObj1, bObj2): aObj1 = " + aObj1 + ", bObj2 = " + bObj2 + "\n"); //remains the same 50, 70

        int[] result = swapTwoNumbersAsObjectsByArithmeticAndReturn(aObj1, bObj2);
        System.out.println(Arrays.toString(result));
        System.out.println("after method swapTwoNumbersAsObjectsByArithmeticAndReturn(aObj1, bObj2): aObj1 = " + aObj1 + ", bObj2 = " + bObj2 + "\n");


    }

    private static void swapTwoNumbersByArithmetic(int a, int b) {
        System.out.println("\nSwap two primitives by arithmetic operations: ");
        System.out.println("Before: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After revertTwoNumbersByArithmetic: a = " + a + ", b = " + b);
    }

    private static void swapTwoNumbersAsObjectsByArithmetic(Integer a, Integer b) {
        System.out.println("\nSwap two objects (Integer) by arithmetic operations: ");
        System.out.println("Before: a = " + a + ", b = " + b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
        a = 7;
        b = 77;
        System.out.println("After swapTwoNumbersAsObjectsByArithmetic: a = " + a + ", b = " + b);
    }

    private static int[] swapTwoNumbersAsObjectsByArithmeticAndReturn(Integer aObj1, Integer bObj2) {
        System.out.println("\nSwap two objects (Integer) by arithmetic operations and return in new array: ");
        System.out.println("Before: aObj1 = " + aObj1 + ", bObj2 = " + bObj2);
//        a = a + b;
//        b = a - b;
//        a = a - b;
        aObj1 = 33;
        bObj2 = 555;
        System.out.println("After swapTwoNumbersAsObjectsByArithmeticAndReturn: aObj1 = " + aObj1 + ", bObj2 = " + bObj2);
        return new int[]{aObj1, bObj2};
    }

    private static void swapTwoNumbersByXOROperator(int a, int b) {
        System.out.println("\nSwap two primitives by XOR operator: ");
        System.out.println("Before: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapTwoNumbersByXOROperator: a = " + a + ", b = " + b);
    }
}

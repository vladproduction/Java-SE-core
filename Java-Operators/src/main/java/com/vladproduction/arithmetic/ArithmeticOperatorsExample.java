package com.vladproduction.arithmetic;

public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
        System.out.println("a += b = " + (a += b));
        System.out.println("a = " + (a));
        System.out.println("a -= b = " + (a -= b));
        System.out.println("a = " + (a));

        /*a + b = 30
        a - b = -10
        a * b = 200
        b / a = 2
        b % a = 0
        c % a = 5
        a++ = 10
        a-- = 11
        d++ = 25
        ++d = 27
        a += b = 30
        a = 30
        a -= b = 10
        a = 10*/
    }
}

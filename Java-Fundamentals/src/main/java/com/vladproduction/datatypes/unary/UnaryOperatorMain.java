package com.vladproduction.datatypes.unary;

public class UnaryOperatorMain {
    public static void main(String[] args) {
        method1();
        System.out.println("==========");
        int x = 1;
        x++;
        x = x + 1;
        System.out.println("x = " + x);
        System.out.println("==========");
        byte b = 1;
        b++; //incr and decr automatically casting
        System.out.println("b = " + b);
        //but :
        b = (byte) (b + 1); //need to cast, because expression is operating with integer
        System.out.println("==========");
        int c = 1;
        c += 2;
        System.out.println("c = " + c);
        System.out.println("==========");
        int k = 1;
        k = ++k;
        System.out.println("++k = " + k); // 2
        System.out.println("==========");
        int r = 1;
        r = r++;
        System.out.println("r++ = " + r); //1

    }

    private static void method1() {
        long a = Long.remainderUnsigned(-2, 3);
        int b = Integer.remainderUnsigned(-2, 3);
        int c = -2 % 3;
        System.out.print(a + " " + b + " " + c);
    }
}

package com.vladproduction.story;

public class IntegerDemo {
    public static void main(String[] args) {

        Integer a = 50; // constructor
        Integer b = 50; // constructor

        System.out.println(a == b);         //false
        System.out.println(a.equals(b));    //true

        Integer a1 = Integer.valueOf(50);
        Integer b1 = Integer.valueOf(50);

        System.out.println(a1 == b1);         //true
        System.out.println(a1.equals(b1));    //true

        Integer a2 = Integer.valueOf(500);
        Integer b2 = Integer.valueOf(500);

        System.out.println(a2 == b2);         //false
        System.out.println(a2.equals(b2));    //true

        int primitiveA = a2.intValue();
        int primitiveB = b2.intValue();

        int primitiveA2 = a2;
        int primitiveB2 = b2;

        byte b50 = asByte(50);      //50
        System.out.println("b50 = " + b50);
        byte b500 = asByte(500L);   //-12
        System.out.println("b500 = " + b500);
    }

    public static byte asByte(Number num) {
        if (num != null) {
            return num.byteValue();
        }
        return 0;
    }
}

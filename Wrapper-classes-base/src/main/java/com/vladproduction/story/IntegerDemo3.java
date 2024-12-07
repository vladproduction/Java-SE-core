package com.vladproduction.story;

public class IntegerDemo3 {
    public static void main(String[] args) {

        Integer a = Integer.parseInt("255");
        String aString = a.toString();    //"255"
        System.out.println("aString = " + aString);

        int a1 = 255;
        String aString1 = Integer.toString(a1);    //"255"
        System.out.println("aString1 = " + aString1);

        String hexString = Integer.toString(a1, 16);   //"ff"
        System.out.println("hexString = " + hexString);
        String octString = Integer.toString(a1, 8);    //"377"
        System.out.println("octString = " + octString);
        String binString = Integer.toString(a1, 2);    //"11111111"
        System.out.println("binString = " + binString);

        //radix negative:
        int a2 = -255;
        String aString2 = Integer.toString(a2);    //"-255"
        System.out.println("aString2 = " + aString2);

        String hexString2 = Integer.toString(a2, 16);   //"-ff"
        System.out.println("hexString2 = " + hexString2);
        String octString2 = Integer.toString(a2, 8);    //"-377"
        System.out.println("octString2 = " + octString2);
        String binString2 = Integer.toString(a2, 2);    //"-11111111"
        System.out.println("binString2 = " + binString2);

        int b = -255;
        String bString = Integer.toUnsignedString(b);    //"4294967041"
        System.out.println("bString = " + bString);
        String hexStringB = Integer.toUnsignedString(b, 16);   //"ffffff01"
        System.out.println("hexStringB = " + hexStringB);
        String octStringB = Integer.toUnsignedString(b, 8);    //"37777777401"
        System.out.println("octStringB = " + octStringB);
        String binStringB = Integer.toUnsignedString(b, 2);    //"11111111111111111111111100000001"
        System.out.println("binStringB = " + binStringB);

        int c = -255;
        String cString = Integer.toUnsignedString(c);    //"4294967041"
        System.out.println("cString = " + cString);
        String hexStringC = Integer.toHexString(c);       //"ffffff01"
        System.out.println("hexStringC = " + hexStringC);
        String octStringC = Integer.toOctalString(c);     //"37777777401"
        System.out.println("octStringC = " + octStringC);
        String binStringC = Integer.toBinaryString(c);    //"11111111111111111111111100000001"
        System.out.println("binStringC = " + binStringC);

    }
}

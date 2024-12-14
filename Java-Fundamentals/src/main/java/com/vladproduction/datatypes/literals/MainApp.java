package com.vladproduction.datatypes.literals;

public class MainApp {
    public static void main(String[] args) {

        //correct define:
//        int var1 = 356f;
        double var2 = 356f;
        float var3 = 356f;
//        char var4 = 356f;
//        long var5 = 356f;
//        byte var6 = 356f;
//        Integer var7 = 356f;
//        Character var8 = 356f;
        Object var9 = 356f;

        //compile without problems:
//        float f = 7.0;
//        char c = "z";
//        byte b = 255;
//        boolean n = null;
        int i = 32565;
        int j = '`';

        //compile without problem:
        char c = 17;
//        char ch = '10';
//        byte b = 255;
        int i1 = 's';
//        boolean n = null;
//        float = 7.0f;

        //what will be output? :
        Integer number = 32;
        // Binary number format
        String convert = Integer.toBinaryString(number);
        System.out.print(convert + " ");
        // Octagonal number format
        convert = Integer.toOctalString(number);
        System.out.print(convert + " ");
        // Hexadecimal number format
        convert = Integer.toHexString(number).toUpperCase();
        System.out.print(convert + " ");
        //100000 40 20

    }
}

package com.vladproduction.story;

public class IntegerDemo2 {
    public static void main(String[] args) {

        Integer a = Integer.parseInt("500");
        System.out.println("a = " + a);

//        Integer hex = Integer.parseInt("0xff"); //raises NumberFormatException
//        System.out.println("hex = " + hex);

        Integer hex2 = Integer.decode("0xff");   //Decodes as 255 (hexadecimal)
        System.out.println("hex2 = " + hex2);

        Integer oct = Integer.decode("0377");   //Decodes as 255 (octal)
        System.out.println("oct = " + oct);
        Integer dec = Integer.decode("255");    //Decodes as 255 (decimal)
        System.out.println("dec = " + dec);

        Integer bin = Integer.parseInt("11111111", 2); //Decodes as 255 (binary)
        System.out.println("bin = " + bin);

        Integer bin2 = Integer.parseInt("3333", 4); //Decodes as 255 (quaternary)
        System.out.println("bin2 = " + bin2);
    }
}

package com.vladproduction.vp31_wrappers;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main31 {
    public static void main(String[] args) {
        //wrappers for primitives
        // primitives don`t have any methods
        //Byte, Short, Integer, Long, Double, Float, Boolean, Character --> wrappers (Classes for primitives)
        Integer a = 1;
        Integer x1 = 100;
        byte b = x1.byteValue();
        double doubleValue = x1.doubleValue();
        System.out.println("b = " + b);
        System.out.println("doubleValue = " + doubleValue);

        //possible to print Integer as String value; or other types as well
        System.out.println(Integer.parseInt("555"));


    }
}

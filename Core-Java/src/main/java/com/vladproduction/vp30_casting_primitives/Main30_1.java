package com.vladproduction.vp30_casting_primitives;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main30_1 {
    public static void main(String[] args) {

        byte x = (byte) 128; //-128 127  >>
        System.out.println(x); //-128

        byte x1 = (byte) 129;
        System.out.println(x1); //-127

        byte x2 = (byte) 130;
        System.out.println(x2); //-126

        byte x3 = (byte) 256;
        System.out.println(x3); //0

        byte x4 = (byte) 257;
        System.out.println(x4); //1

        /**
         * care about digits!
         * all from right side have to be boxed to the left side!
         * */

        //for example
        byte left = 125; //correct: byte capacity available for the right_side value as 'int' digit;
    }
}

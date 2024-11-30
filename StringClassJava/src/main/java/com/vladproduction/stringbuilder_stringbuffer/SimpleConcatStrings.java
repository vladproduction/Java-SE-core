package com.vladproduction.stringbuilder_stringbuffer;

public class SimpleConcatStrings {
    public static void main(String[] args) {
        String str="S0";
        for (int i = 1; i <= 6; i++) {
            str += "m" + i;
            System.out.println(str);
        }
        System.out.println();
    }
}

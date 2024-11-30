package com.vladproduction.parsingStrings;

import java.util.Arrays;

public class ParsingInteger {
    public static void main(String[] args) {

        int num = Integer.parseInt("1234");
        System.out.println("num = " + num);

        String aString = "test test2 test3";
        String[] strArray = aString.split("\\s+");
        System.out.println(Arrays.toString(strArray));
    }
}

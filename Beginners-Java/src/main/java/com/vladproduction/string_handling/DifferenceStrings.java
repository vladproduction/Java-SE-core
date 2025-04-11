package com.vladproduction.string_handling;

public class DifferenceStrings {
    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("Hello");

        sbf.append(" World"); // modifies the existing StringBuilder object
        sbf.append(" World"); // also modifies the existing StringBuffer object

    }
}

package com.vladproduction.equalityOfString;

public class StringsEqualsRule {
    public static void main(String[] args) {
        String hello = "Hello";
        String welcome="Hello World!";
        String ss = welcome.substring(0, welcome.indexOf(" "));
        boolean flag=(hello==ss);
        System.out.println(hello + " == " + ss + " -> " + flag);
        boolean flag1 = hello.equals(ss);
        System.out.println(hello + "equals" + ss + "->" + flag1);
    }
}

package com.vladproduction.multy_catch;

public class Test {
    public static void main(String[] args) {
        try {
            int b = 0;
            int a = 42 / b;
        } catch (ArithmeticException e) {
            System.out.println("Unreached point"); //need to replace
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
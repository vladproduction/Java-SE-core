package com.vladproduction.throw_;

public class Test {
    static void testG() {
        try {
            throw new ClassCastException("Demo");
        } catch (ClassCastException exp) {
            System.out.println("testG: Exception in method!");
            throw exp;
        }
    }
    public static void main(String[] args) {
        try {
            testG();
        } catch (ClassCastException e) {
            System.out.println("main: Exception of method!");
        }
        /*testG: Exception in method!
          main: Exception of method*/
    }
}
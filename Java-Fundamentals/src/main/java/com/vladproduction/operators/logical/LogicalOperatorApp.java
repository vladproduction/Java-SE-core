package com.vladproduction.operators.logical;

public class LogicalOperatorApp {
    public static void main(String[] args) {
        logical_double_and();
        logical_double_or();

    }

    private static void logical_double_and() {
        int x = 1;
        int y = 1;
        boolean a = x == y; //true
        boolean b = x != y; //false
        System.out.println(x++ == y++ && x++ != y++);
        System.out.println("x = " + x + ", y = " + y);
        /*false
        x = 3, y = 3*/
    }

    private static void logical_double_or() {
        int x = 1;
        int y = 1;
        boolean a = x == y; //true
        boolean b = x != y; //false
        System.out.println(x++ == y++ || x++ != y++);
        System.out.println("x = " + x + ", y = " + y);
        /*true
        x = 2, y = 2*/
    }
}

package com.vladproduction.conditional_statements.ternary_operator;

public class Main01 {
    public static void main(String[] args) {
        short x = 3, a = 12;
        int res = x < a ? (x + a) : (x - a);
        System.out.println("res = " + res);
    }
}

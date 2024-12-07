package com.vladproduction.BigInteger_BigDecimal;

public class MainApp02 {
    public static void main(String[] args) {
        boolean res1 = 1.00000001f == 1.00000002f;
        System.out.println("res1 = " + res1); //res1 = true
        boolean res2 = 1 == 1f / 3 * 3;
        System.out.println("res2 = " + res2); //res2 = true
    }
}

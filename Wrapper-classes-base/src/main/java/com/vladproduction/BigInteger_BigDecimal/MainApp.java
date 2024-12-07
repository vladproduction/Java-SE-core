package com.vladproduction.BigInteger_BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class MainApp {
    public static void main(String[] args) {
        float res = 0.4f - 0.3f;
        BigDecimal big1 = new BigDecimal("0.4");
        BigDecimal big2 = new BigDecimal("0.3");
        BigDecimal bigRes = big1.subtract(big2, MathContext.DECIMAL32);
        System.out.println(res); // 0.099999994
        System.out.println(bigRes); // 0.1
    }
}

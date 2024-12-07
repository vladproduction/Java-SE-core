package com.vladproduction.BigInteger_BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalMain {
    public static void main(String[] args) {
        double d1 = 0.3;
        double d2 = 0.1;
        double res = d1 - d2;
        System.out.println("res = " + res); //res = 0.19999999999999998

        BigDecimal bd1 = new BigDecimal(0.3);
        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal resultBD = bd1.subtract(bd2);
        System.out.println("resultBD = " + resultBD); //resultBD = 0.199999999999999988897769753748434595763683319091796875

        //MathContext
        BigDecimal bd12 = new BigDecimal(0.3, MathContext.DECIMAL32);
        BigDecimal bd22 = new BigDecimal(0.1, MathContext.DECIMAL32);
        BigDecimal resultBD2 = bd12.subtract(bd22);
        System.out.println("resultBD2 = " + resultBD2); //resultBD2 = 0.2000000

        //MathContext (rounding)
        BigDecimal bd13 = new BigDecimal(0.3);
        BigDecimal bd23 = new BigDecimal(0.1);
        BigDecimal resultBD3 = bd13.subtract(bd23);
        System.out.println("resultBD3 = " + resultBD3.setScale(3, RoundingMode.CEILING)); // resultBD3 = 0.200

    }
}

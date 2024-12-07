package com.vladproduction.BigInteger_BigDecimal;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerMain {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("123456789012345678901234567890");
        System.out.println("n = " + n);
        BigInteger m = new BigInteger("123456789012345678901234567891");
        BigInteger a = n.add(m);
        System.out.println("a = " + a);
        BigInteger multi = n.multiply(m);
        System.out.println("multi = " + multi);
        BigInteger rand = new BigInteger(100, new Random());
        System.out.println("rand = " + rand);
        BigInteger rand1 = new BigInteger(100, new Random());
        System.out.println("rand1 = " + rand1);
        //output:
        /*  n = 123456789012345678901234567890
            a = 246913578024691357802469135781
            multi = 15241578753238836750495351562659655576514250878776253619990
            rand = 697727400891809446913368849211
            rand1 = 728289042863803542706704478398   */
    }
}

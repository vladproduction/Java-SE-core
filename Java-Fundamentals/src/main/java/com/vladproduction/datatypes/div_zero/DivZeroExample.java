package com.vladproduction.datatypes.div_zero;

public class DivZeroExample {
    public static void main(String[] args) {
        double a, b, c, d, sum, sumBC, comAB;
        a = -3.0 / 0;
        b =  3.0 / 0;
        c = 0 / 4.0;
        d = 0 / 0.0;
        sum = a + b + c + d;
        sumBC = b + c;
        comAB = a * b;
        System.out.println(sum + " " + sumBC + " " + comAB);//NaN Infinity -Infinity

        System.out.println("==========");
        double x = 0, y = 2, z;
        z = y / x;
        System.out.println ("z = " + z); //z = Infinity

    }
}

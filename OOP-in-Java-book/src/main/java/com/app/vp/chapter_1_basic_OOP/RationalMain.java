package com.app.vp.chapter_1_basic_OOP;

/**
 * Testing Rational class and methods
 * */
public class RationalMain {
    public static void main(String[] args) {

        //create new instance
        Rational rational1 = new Rational(11, 5);
        Rational rational2 = new Rational(4, 5);

        //testing toString()
        System.out.println("rational1 = " + rational1);
        System.out.println("rational2 = " + rational2);

        //testing add method
        Rational addResult_r1_r2 = rational1.add(rational2);
        System.out.println("addResult_r1_r2 = " + addResult_r1_r2);

    }
}

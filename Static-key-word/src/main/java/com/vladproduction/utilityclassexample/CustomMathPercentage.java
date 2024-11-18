package com.vladproduction.utilityclassexample;

/**
 * Concept cases:
 * 1) percentage field is declared as static - it belongs to the class rather than any individual instance of the class.
 * This allows the percentage variable to be accessed directly in static methods without needing to create an instance
 * of CustomMathPercentage.
 * 2) add and multiply methods are also static, which means they can be called without creating an object of the class
 * */
public class CustomMathPercentage {

    public static double percentage = .25;

    public static double add(int a, int b){
        return (a + b) * percentage;
    }

    public static double multiply(int a, int b){
        return (a * b) * percentage;
    }

    public static void main(String[] args) {

        double resultAdd = add(10, 90);
        System.out.println("resultAdd = " + resultAdd);

        double resultMulti = multiply(10, 10);
        System.out.println("resultMulti = " + resultAdd);
    }

}

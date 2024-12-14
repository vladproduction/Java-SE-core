package com.vladproduction.flow_control.if_else;

public class MainApp01 {
    public static void main(String[] args) {
        //simple check if:
        double perimeterOfQuadrant = perimeterOfQuadrant(2.4, 2.6);
        System.out.println("perimeterOfQuadrant = " + perimeterOfQuadrant);

        //check and case with exception:
        double perimeterOfQuadrant2 = perimeterOfQuadrant2(2.4, 9.6, "Quadrant");
        System.out.println("perimeterOfQuadrant2 = " + perimeterOfQuadrant2);

        //exception expected for null or empty name:
//        double exceptionExpected = perimeterOfQuadrant2(1.5, 2.5, "");
//        System.out.println("exceptionExpected = " + exceptionExpected);

        //exception expected for illegal parameters:
//        double exceptionExpected2 = perimeterOfQuadrant2(0, -2.5, "Quadrant");
//        System.out.println("exceptionExpected2 = " + exceptionExpected2);

    }

    private static double perimeterOfQuadrant2(double v, double v1, String s) {
        double result;
        if(s == null || s.isEmpty()){
            throw new IllegalArgumentException("Name of calculation object is illegal.");
        } else if (v <=0 && v1 <= 0) {
            throw new IllegalArgumentException("Given parameters is not correct.");
        } else {
            System.out.println("Shape: " + s);
            result = 2 * (v + v1);
        }
        return result;
    }

    public static double perimeterOfQuadrant(double lengthA, double lengthB){
        double result = 0.0;
        if(lengthA > 0 && lengthB > 0){
            result = 2 * (lengthA + lengthB);
            return result;
        }
        System.out.println("Parameters is not correct.");
        return -1;
    }

}

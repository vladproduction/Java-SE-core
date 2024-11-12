package com.vladproduction.math_class_methods;

import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;

public class MathMethodsExamples {
    public static void main(String[] args) {

        //constants:
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //PI: 3.14159265358979323846
        //E: 2.7182818284590452354

        //basic:
        System.out.println(Math.abs(-4));// 4
        System.out.println("max = " + Math.max(1, 2));// 2
        System.out.println("max = " + Math.min(1, 2));// 1

        //trigonometric functions that accept as input the value of the angle in radians:
        System.out.println("sin - returns the sine of the angle: " + Math.sin(0)); // 0
        System.out.println("cos – returns the cosine of an angle: " + Math.cos(0)); // 1
        System.out.println("tan – returns the tangent of an angle: " + Math.tan(0)); // 0
        System.out.println("asin – returns the arcsine of an angle: " + Math.asin(0)); // 0
        System.out.println("acos – returns the arccosine of an angle: " + Math.acos(1)); // 0
        System.out.println("atan – returns the arctangent of an angle: " + Math.atan(0)); // 0

        //converting degrees to radians and vice versa:
        System.out.println("toRadians: " + toRadians(1)); // 0.017453292519943295
        System.out.println("toDegrees: " + toDegrees(1)); // 57.29577951308232

        //Methods for working with degrees:
        System.out.println("exp – returns e to the power of x: " + Math.exp(1)); // 2.7182818284590452354
        System.out.println("log – returns the value of the logarithm based on e: " + Math.log(Math.E)); // 1
        System.out.println("log10 – returns the value of the logarithm to the base 10: " + Math.log10(100)); // 2
        System.out.println("sqrt - returns the value of the square root: " + Math.sqrt(16)); // 4
        System.out.println("cbrt – returns the value of the cube root: " + Math.cbrt(-8)); // -2
        System.out.println("pow – returns the result of summing to the given level: " + Math.pow(2, 4)); // 16

        //rounding methods:
        System.out.println("ceil – rounding to a larger value: " + Math.ceil(3.3)); // 4
        System.out.println("floor – rounding down to a smaller value: " + Math.floor(5.7)); // 5
        System.out.println("round – rounding according to standard mathematical rules: " + Math.round(5.8)); // 6

        //Method to get a random value:
        System.out.println("random – returns a random value of type double in the range " + Math.random());
        double min = 5.0;     // Minimum value
        double max = 10.0;    // Maximum value
        double randomValue = min + (Math.random() * (max - min));
        System.out.println("random – returns a random value of type double in the range " + randomValue);

    }
}

package com.vladproduction.optional_impl;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
//        int[] arr = {};//res = NaN
        //and for optional in case empty exception is: NoSuchElementException: No value present
//        int[] arr = null;//NullPointerException: Cannot read the array length because "<local4>" is null
        //and for optional in case of null exception is: NoSuchElementException: No value present
        int[] arr = {1, 3, 5};//res = 3.0
        IntService service = new IntService();
        double res = service.average(arr);
        System.out.println("res = " + res);

        //now we use optional:
        Optional<Double> optionalDouble = service.avgOptional(arr);
        System.out.println("optionalDouble = " + optionalDouble.get());//optionalDouble = 3.0
    }
}

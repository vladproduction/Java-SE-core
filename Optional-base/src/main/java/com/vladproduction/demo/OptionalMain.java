package com.vladproduction.demo;

public class OptionalMain {
    public static void main(String[] args) {
//        int[] arr = {};//res = NaN
//        int[] arr = null;//NullPointerException: Cannot read the array length because "<local4>" is null
        int[] arr = {1, 3, 5};//res = 3.0
        IntService service = new IntService();
        double res = service.average(arr);
        System.out.println("res = " + res);
    }
}

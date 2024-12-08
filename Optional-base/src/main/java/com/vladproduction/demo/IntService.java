package com.vladproduction.demo;

public class IntService {
    public double average(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}

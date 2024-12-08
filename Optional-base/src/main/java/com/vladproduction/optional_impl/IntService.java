package com.vladproduction.optional_impl;

import java.util.Optional;

public class IntService {
    public double average(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public Optional<Double> avgOptional(int[] arr){
        Optional<Double> result;
        if(arr != null && arr.length > 0){
            double average = average(arr);
            result = Optional.of(average);
        } else {
            result = Optional.empty();
        }
        return result;
    }
}

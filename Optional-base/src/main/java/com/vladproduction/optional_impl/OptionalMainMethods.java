package com.vladproduction.optional_impl;

import java.util.Optional;

public class OptionalMainMethods {
    public static void main(String[] args) {

//        int[] arr = null;
        //output in case of null:
        //isEmpty
        //orElse: NaN
        //NoSuchElementException: No value present

        int[] arr = {1, 2, 3};
        //output in case of values presented:
        //get(): 2.0
        //orElse: 2.0
        //orElseThrow: 2.0
        //ifPresent: 2.0

        IntService service = new IntService();

        Optional<Double> optionalDouble = service.avgOptional(arr);

        if(optionalDouble.isPresent()){
            System.out.println("get(): " + optionalDouble.get());
        }

        if(optionalDouble.isEmpty()){
            System.out.println("isEmpty");
        }

        Double orElse = optionalDouble.orElse(Double.NaN);
        System.out.println("orElse: " + orElse);

        Double orElseThrow = optionalDouble.orElseThrow();
        System.out.println("orElseThrow: " + orElseThrow);

        System.out.print("ifPresent: ");
        optionalDouble.ifPresent(System.out::println);

    }
}

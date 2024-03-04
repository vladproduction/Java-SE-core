package com.vladproduction.vp06_if;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    public static void main(String[] args) {

        int bound = 95;

        System.out.println(new String(fizzbuzz(bound)));

        System.out.println(counting(bound));

    }

    public static byte[] fizzbuzz(int value) {
        StringBuilder sb = new StringBuilder();
        if (value % 3 == 0) {
            sb.append("FIZZ");
        }
        if (value % 5 == 0) {
            sb.append("BUZZ");
        }
        if (sb.length() > 0)
            return sb.toString().getBytes();
        throw new IllegalArgumentException("Please check!!!");
    }

    public static Map<String, Integer> counting(int number){
        Map<String, Integer> totalMap = new HashMap<>();
        int fizz = 0, buzz = 0, fizzBuzz = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz++;
            } else if (i % 3 == 0) {
                fizz++;
            } else if (i % 5 == 0) {
                buzz++;
            }
        }
        totalMap.put("FIZZBUZZ", fizzBuzz);
        totalMap.put("FIZZ", fizz);
        totalMap.put("BUZZ", buzz);
        return totalMap;
    }

}



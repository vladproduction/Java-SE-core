package com.vladproduction.app11.count_occurrences_char;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsage {
    public static void main(String[] args) {
        String str = "ABBCCC";
        countOccurrences(str);//{A=1, B=2, C=3}
    }

    private static void countOccurrences(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}

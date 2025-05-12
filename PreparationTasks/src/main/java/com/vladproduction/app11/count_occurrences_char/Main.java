package com.vladproduction.app11.count_occurrences_char;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Example 1
        int occurrences = countCharOccurrences("Hello World!", 'o');
        System.out.println(occurrences); // 2

        // example 2 (HashMap)
        String text = "Hello World!";
        countCharOccurrencesByHashMap(text);

    }

    private static void countCharOccurrencesByHashMap(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

    private static int countCharOccurrences(String text, char character) {
        if (text == null || text.isEmpty()){
            throw new IllegalArgumentException();
        }
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == character){
                count++;
            }
        }
        return count;
    }

}

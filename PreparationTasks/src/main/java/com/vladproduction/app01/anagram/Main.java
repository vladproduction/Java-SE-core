package com.vladproduction.app01.anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String a = "eat";
        String b = "tea";

        //could create word with such letters? yes- it is anagram.

        //v#1: sorting complexity = n * lg(n), but we have two sorts
        boolean isAnagram1 = isAnagram1(a, b);
        System.out.println("isAnagram1 = " + isAnagram1);

        //v#2: sorting complexity = n + lg(n)
        boolean isAnagram2 = isAnagram2(a, b);
        System.out.println("isAnagram2 = " + isAnagram2);


    }

    //version #1
    static boolean isAnagram1(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        return Arrays.equals(a1, b1);
    }

    //version #2
    static boolean isAnagram2(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> mapA = mapLetters(a);
        Map<Character, Integer> mapB = mapLetters(b);
        return mapA.equals(mapB);
    }

    private static Map<Character, Integer> mapLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if(!map.containsKey(aChar)) {
                map.put(aChar, 1);
            } else {
                int currentCount = map.get(aChar);
                map.put(aChar, currentCount + 1);
            }
        }
        return map;
    }


}

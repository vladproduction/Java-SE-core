package com.vladproduction.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {
    public static final String REGEX = "\\b[\\w]{2}\\b";
    public static final String REGEX_2 = "\\w*";
    private static  String TEXT = "This is my second java 45 project.\n" +
            "It is wonderful to learn polysemantics and arrays.\n" +
            "The weather is cold like it should be in winter, but we are all looking forward to spring.";
    public static void main(String[] args) {
        find_method();
        matches_method();
        lookingAt_method();
        replaceFirst_method();
        replaceAll_method();
        replaceAll_method2();
    }

    private static void replaceAll_method() {
        System.out.println("Before:\n" + TEXT);
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(TEXT);
        TEXT = m.replaceAll("lab2");
        System.out.println("\nAfter replaceAll_method():\n" + TEXT);
        System.out.println();
        /*After:
        This lab2 lab2 second java lab2 project.
        lab2 lab2 wonderful lab2 learn polysemantics and arrays.
        The weather lab2 cold like lab2 should lab2 lab2 winter, but lab2 are all looking forward lab2 spring.*/
    }
    private static void replaceAll_method2() {
        System.out.println("Before:\n" + TEXT);
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(TEXT);
        TEXT = m.replaceAll("$1_lab2");
        System.out.println("\nAfter replaceAll_method2():\n" + TEXT);
        /*  After:
            This is_lab2 my_lab2 second java 45_lab2 project.
            It_lab2 is_lab2 wonderful to_lab2 learn polysemantics and arrays.
            The weather is_lab2 cold like it_lab2 should be_lab2 in_lab2 winter, but we_lab2 are all looking forward to_lab2 spring.*/
    }
    private static void replaceFirst_method() {
        System.out.println("Before:\n" + TEXT);
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(TEXT);
        TEXT = m.replaceFirst("lab2");
        System.out.println("\nAfter replaceFirst_method():\n" + TEXT);
        /*After:
            This lab2 my second java 45 project.
            It is wonderful to learn polysemantics and arrays.
            The weather is cold like it should be in winter, but we are all looking forward to spring.*/
    }
    private static void find_method() {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(TEXT);
        System.out.println("m = " + m); // Prints the matcher object: m = java.util.regex.Matcher[pattern=\b[\w]{2}\b region=0,175 lastmatch=]
        // Find and print all matches
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            System.out.println("Found match: '" + TEXT.substring(start, end) + "' from " + start + " to " + (end - 1) + " positions");
        }
        /*Found match: 'is' from 5 to 6 positions
        Found match: 'my' from 8 to 9 positions
        Found match: 'It' from 34 to 35 positions
        Found match: 'is' from 37 to 38 positions
        Found match: 'to' from 50 to 51 positions
        Found match: 'is' from 97 to 98 positions
        Found match: 'it' from 110 to 111 positions
        Found match: 'be' from 120 to 121 positions
        Found match: 'in' from 123 to 124 positions
        Found match: 'we' from 138 to 139 positions
        Found match: 'to' from 165 to 166 positions*/
    }
    private static void lookingAt_method() {
        Pattern p3 = Pattern.compile(REGEX_2);
        Matcher m3 = p3.matcher("Thanks!");
        System.out.println(m3.lookingAt());
    }
    private static void matches_method() {
        Pattern p1 = Pattern.compile(REGEX_2);
        Matcher m1 = p1.matcher("wonderful");
        System.out.println(m1.matches()); //true
        Pattern p2 = Pattern.compile(REGEX_2);
        Matcher m2 = p2.matcher("wonderful!"); //add '!' symbol, so expected false
        System.out.println(m2.matches()); //false --> '!' does not match the pattern
    }
}

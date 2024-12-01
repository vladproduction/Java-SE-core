package com.vladproduction.pattern;

import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        System.out.println("pattern = " + pattern);//pattern = java

        Pattern pattern2 = Pattern.compile("java");
        System.out.println(pattern2);//java

        System.out.println(Pattern.matches("J.+a" ,"Java"));//true
        System.out.println(Pattern.matches("J.+a","Java JavaScript"));//false

        Pattern pattern3 = Pattern.compile("abc");
        System.out.println(pattern3.flags()); //0
        Pattern otherPattern = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        System.out.println(otherPattern.flags());//2

        String str1 = "One two,three!four;five six.seven";
        Pattern p1 = Pattern.compile("[,!;.]");
        String s[] = p1.split(str1);
        System.out.println("Output string ->" + str1);
        for (String i: s) {
            System.out.println("Lexeme: " + i);
        }
        /*Output string ->One two,three!four;five six.seven
        Lexeme:One two
        Lexeme:three
        Lexeme:four
        Lexeme:five six
        Lexeme:seven*/

        String str2 = "One two,three!four;five six.seven";
        Pattern p2 = Pattern.compile("[,!;.]");
        String s2[] = p2.split(str2, 2);
        System.out.println("Output string ->" + str2);
        for (String i: s2)
            System.out.println("Lexeme: " + i);
        /*Output string ->One two,three!four;five six.seven
        Lexeme: One two
        Lexeme: three!four;five six.seven*/
    }
}

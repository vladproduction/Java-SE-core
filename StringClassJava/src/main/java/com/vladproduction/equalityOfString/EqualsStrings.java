package com.vladproduction.equalityOfString;

public class EqualsStrings {
    public static void main(String[] args) {
        String str1 = "Pizza";
        String str2 = "Pizza";
        if (str1.equals(str2)) {
            System.out.println("str1 and str2: equal values");
        }
        if (str1 == str2) {
            System.out.println("str1 and str2: equal references");
        }
        System.out.println();

        String str3 = "Pasta";
        String str4 = new String("Pasta");
        if (str3.equals(str4)) {
            System.out.println("str3 and str4: equal values");
        } else {
            System.out.println("str3 and str4: unequal values");
        }
        if (str3 == str4) {
            System.out.println("str3 and str4: equal references");
        } else {
            System.out.println("str3 and str4: unequal references");
        }
    }
}

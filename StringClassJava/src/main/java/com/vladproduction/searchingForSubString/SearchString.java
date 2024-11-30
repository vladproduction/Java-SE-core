package com.vladproduction.searchingForSubString;

public class SearchString {
    public SearchString() {
    }

    public static void main(String[] args) {
        int index;
        String str1 = "zz", str2 = "Pizza";
        index = str2.indexOf(str1);

        if (index < 0) {
            System.out.println(str1 + " is not a substring of " + str2);
        } else {
            System.out.println(str1 + " is a substring of " + str2);
        }

    }
}

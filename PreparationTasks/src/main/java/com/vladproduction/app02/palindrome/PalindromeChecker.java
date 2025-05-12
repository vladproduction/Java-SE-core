package com.vladproduction.app02.palindrome;

public class PalindromeChecker {
    public static void main(String[] args) {

//        String str = "madama";
        String str = "madam";

        boolean isPalindrome = true;

        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);
            if(start != end){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(str + " is palindrome: " + isPalindrome);

    }
}

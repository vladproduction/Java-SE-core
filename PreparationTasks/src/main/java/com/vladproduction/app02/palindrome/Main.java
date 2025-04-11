package com.vladproduction.app02.palindrome;

/**
 * methods to check if a string is a palindrome
 * */

public class Main {
    public static void main(String[] args) {
        //complexity: O(n)
        String text = "Able was I ere I saw Elba";
        boolean palindrome1 = isPalindrome1(text);
        System.out.println("palindrome1 = " + palindrome1);

        boolean palindrome2 = isPalindrome2(text);
        System.out.println("palindrome2 = " + palindrome2);

        // Example usage with StringBuilder
        boolean palindrome3 = isPalindrome3(text);
        System.out.println("palindrome3 = " + palindrome3); // true
    }

    // version #1:
    private static boolean isPalindrome1(String s) {

        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char start = chars[i];
            char end = chars[chars.length - 1 - i];
            if (start != end) {
                return false;
            }
        }
        return true;
    }

    // version #2:
    private static boolean isPalindrome2(String str) {
        if (str == null) return false;
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // version #3:
    private static boolean isPalindrome3(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }


}

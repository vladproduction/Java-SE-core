package com.app.vp.chapter_6_generics;

public final class Tester1_extends_Comparable {
    public static void main(String[] args) {
        // Example 1: Finding the maximum of two integers
        int num1 = 10;
        int num2 = 5;
        int maxInt = Tester1_extends_Comparable.<Integer>max(num1, num2); // Explicitly specify type argument
        System.out.println("Maximum integer: " + maxInt); // Output: Maximum integer: 10

        // Example 2: Finding the maximum of two strings (lexicographical comparison)
        String str1 = "Hello";
        String str2 = "World";
        String maxString = Tester1_extends_Comparable.max(str1, str2); // Compiler can infer the type argument (String)
        System.out.println("Maximum string: " + maxString); // Output: Maximum string: World
    }

    /**
     * a)
     * x > y: This comparison using the greater than (>) operator only works for primitive data types (like int or double)
     * or objects that implement the Comparable interface.*/
    public static <T extends Comparable<T>> T max(T x, T y){
        return x.compareTo(y) > 0 ? x : y;
    }

    /**
     * b-1)
     *  Use a Specific Type for Comparison
     *  primitive type present here
     * */
    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    /**
     * b-2)
     *  Use a Specific Type for Comparison
     *  Object  type present here as String
     * */
    public static String max(String str1, String str2) {
        return str1.compareTo(str2) > 0 ? str1 : str2;
    }


}

package com.vladproduction.app24.length_of_string_without_length;

public class StringLengthWithoutLength {
    public static void main(String[] args) {

        String str = "Hello World!";
        stringLength(str);

        stringLength2(str);
        int stringLength3Recursion = stringLength3_recursion(str, 0);
        System.out.println("String length (recursion): " + stringLength3Recursion);
    }

    private static void stringLength(String str) {
        int length = 0;
        try{
            while (true){
             str.charAt(length);
             length++;
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("End of the string reached:");
        }
        System.out.println("String length: " + length);
    }

    private static void stringLength2(String str) {
        int length = 0;
        for(char c : str.toCharArray()){
            length++;
        }
        System.out.println("String length: " + length);
    }

    private static int stringLength3_recursion(String str, int index) {
        try {
            str.charAt(index);
            return stringLength3_recursion(str, index + 1);
        } catch (StringIndexOutOfBoundsException e) {
            return index;
        }
    }

}











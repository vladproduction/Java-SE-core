package com.vladproduction.multy_handling;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"10", "2"};
        try {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int res = a / b;
            System.out.println("res = " + res); // 5
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println( e.getMessage() );
        }
    }
}

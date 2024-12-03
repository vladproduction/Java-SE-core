package com.vladproduction.try_catch_demo;

public class Main {
    public static void main(String[] arg) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            int sum = 0;
            for (int i = 0; i <= 6; i += 2) {
                sum += arr[i];
            }
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Program Error!");
        }
        System.out.println("Program Finish!");
    }
}

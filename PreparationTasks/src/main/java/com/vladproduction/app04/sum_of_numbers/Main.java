package com.vladproduction.app04.sum_of_numbers;

public class Main {
    public static void main(String[] args) {
        int a = 1234;
        int summedNumbers1 = sumNumbers1(a);
        System.out.println("summedNumbers1 = " + summedNumbers1); //10

        int summedNumbers2 = sumNumbers2(a);
        System.out.println("summedNumbers2 = " + summedNumbers2);
    }

    private static int sumNumbers1(int a) {
        String s = String.valueOf(a);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            String value = String.valueOf(aChar);
            int x = Integer.parseInt(value);
            sum += x;
        }
        return sum;
    }

    private static int sumNumbers2(int a) {
        int sum = 0;
        while (a /10 != 0 || Math.abs(a) < 10){
            int x = a % 10;
            sum += x;
            a = a / 10;
            if(a == 0){
                break;
            }
        }

        return sum;

    }
}

package com.vladproduction.app03.revert_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-----StringBuilder reverting and remain same hashcode-------");
        StringBuilder sb = new StringBuilder("1234");
        System.out.println(sb.hashCode());
        StringBuilder sb2 = sb.reverse();
        System.out.println(sb2.hashCode());
        System.out.println("------------");

        int number = 1234;

        revert1(number);

        revert2(number);

        revert3(1234);
        revert4(1234);
        revert4(1234);
        revertNumberByArithmeticOperationSimplified(number);

    }

    private static void revert1(int a) {
        System.out.println("\nStringBuilder reverting:");
        System.out.println("Before: " + a);
        String s = String.valueOf(a);
        StringBuilder sb = new StringBuilder(s).reverse();
        int result = Integer.parseInt(sb.toString());
        System.out.println("After revert1: " + result);
    }

    private static void revert2(int a) {
        System.out.println("\nArithmetic reverting:");
        System.out.println("Before: " + a);
        //1234 --> 1*1000 + 2*100 + 3*10 + 4*1
        //1234 --> =4
        //123 --> 4 --> 40 + 3 =43
        //12 --> 43 --> 430 + 2 =432
        //1 --> 432 --> 4320 + 1 =4321
        int result = 0;
        while (a / 10 != 0 || Math.abs(a) < 10) {
            result = result * 10;
            int value = a % 10;
            result = result + value;
            a = a / 10;
            if (a == 0) {
                break; //for stopping the loop
            }
        }
        //=4321
        System.out.println("After revert2: " + result);
    }

    private static void revert3(int number) {
        System.out.println("\nArithmetic reverting revert3:");
        System.out.println("Before revert: " + number);

        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            int digit = number % 10;
            digits.add(digit);
            number = number / 10;
        }
        System.out.println("List of digits: " + digits);
        int result = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
             int value = digits.get(i);
             int power = digits.size() - 1 - i;
            System.out.println(value + " * " + powerAdjust(power) + " = " + value * powerAdjust(power));
             value = value * powerAdjust(power);
             result += value;
        }
        System.out.println("After revert: " + result);
    }

    private static void revert4(int number) {
        System.out.println("\nArithmetic reverting revert4:");
        System.out.println("Before revert: " + number);

        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            int digit = number % 10;
            digits.add(digit);
            number = number / 10;
        }
        System.out.println("List of digits: " + digits);
        int result = 0;
        for (int i = 0; i < digits.size(); i++) {
            int value = digits.get(i);
            int power = digits.size() - 1 - i;
            System.out.println(value + " * " + powerAdjust(power) + " = " + value * powerAdjust(power));
            value = value * powerAdjust(power);
            result += value;
            System.out.println("result = " + result + "; value: " + value);
        }
        System.out.println("After revert: " + result);
    }

    private static int powerAdjust(int i){
        if(i == 0){
            return 1;
        }
        int p = 1;
        for(int j = 0; j < i; j++){
            p *= 10;
        }
        return p;
    }

    //here is a simplified version:
    private static void revertNumberByArithmeticOperationSimplified(int number) {
        System.out.println("\nBefore revert: " + number);
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("After revert: " + result);
    }

}

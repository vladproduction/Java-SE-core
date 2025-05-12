package com.vladproduction.app03.revert_number;

public class RevertNumbers {
    public static void main(String[] args) {

        int number = 12345;

        revertNumberByArithmeticOperation(number);
        revertNumberByStringBuilder(number);
        revertNumberByArithmeticOperationSimplified(number);

    }

    private static void revertNumberByStringBuilder(int number) {
        System.out.println("Before revert: " + number);
        String stringAsNumber = String.valueOf(number);
        StringBuilder sb = new StringBuilder(stringAsNumber);
        sb = sb.reverse();
        int reversedNumber = Integer.parseInt(sb.toString());
        System.out.println("After revert: " + reversedNumber);
    }

    private static void revertNumberByArithmeticOperation(int number) {
        System.out.println("Before revert: " + number);                             //number is printed to show its original value
        int result = 0;                                                             //Initial setup: result will store the reversed number
        while (number != 0){                                                        //intention is to keep looping while number is not fully processed
            result *= 10;                                                           //Multiply result by 10 to shift digits left
            int value = number % 10;
            result += value;                                                        //Extract the last digit of number (number % 10) and add it to result
            number = number / 10;                                                   //Remove the last digit from number (integer division)
            if(number == 0){
                break;
            }
        }
        System.out.println("After revert: " + (result));
    }

    /**
     * inside while loop:
     * For example:
     * If number = 1234 → result = 0
     * value = 4 → result = 0 * 10 + 4 = 4
     * Next loop: value = 3 → result = 4 * 10 + 3 = 43, and so on.
     *
     * Example Run:
     * Input: 1234
     * Steps:
     * result = 0
     * Take 4: result = 0 * 10 + 4 = 4
     * Take 3: result = 4 * 10 + 3 = 43
     * Take 2: result = 43 * 10 + 2 = 432
     * Take 1: result = 432 * 10 + 1 = 4321
     * */

    //here is a simplified version:
    private static void revertNumberByArithmeticOperationSimplified(int number) {
        System.out.println("Before revert: " + number);
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("After revert: " + result);
    }
}

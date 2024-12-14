package com.vladproduction.task_1;

import java.util.Random;

/**
 * 3. Output a specified number of random numbers with and without a new line
 * */
public class TaskApp03 {
    public static void main(String[] args) {

        generateOneNumber();
        System.out.println("==========");
        generateNumbers();
    }

    private static void generateOneNumber() {
        Random random = new Random();
        int randNumber = random.nextInt(1, 99999);

        String value = String.valueOf(randNumber);
        char[] numbers = value.toCharArray();
        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        for (char number : numbers) {
            System.out.println(number); //with a new line each digit of number
        }

        System.out.println(randNumber); //in-line all digits of number
    }

    private static void generateNumbers() {

        int count = 5; //how many numbers to generate
        Random random = new Random();

        // generating random numbers and printing them individually (with a new line)
        for (int i = 0; i < count; i++) {
            int randNumber = random.nextInt(1, 99999);
            System.out.println(randNumber); // each number on a new line
        }

        System.out.println();

        // generating random numbers and printing them in-line
        for (int i = 0; i < count; i++) {
            int randNumber = random.nextInt(1, 99999);
            System.out.print(randNumber + " ");
        }
        System.out.println();
    }
}

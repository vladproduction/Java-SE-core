package com.vladproduction.app22.exception_handling.simple_examples;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "123";



        //arithmeticException(scanner);
        numberFormatException(number);
        arrayIndexOutOfBoundException(scanner);
        nullPointerException(number);

    }

    private static void nullPointerException(String value) {
        value = null;
        System.out.println(value.length());
        //NullPointerException
    }

    private static void arrayIndexOutOfBoundException(Scanner scanner) {
        System.out.println("Enter position (0-4): ");
        int position = scanner.nextInt();
        System.out.println("Enter value (integer): ");
        int value = scanner.nextInt();
        int[] array = {1, 2, 3, 4, 5};
        array[position] = value; //ArrayIndexOutOfBoundsException will be thrown here: in case of invalid position (not in range 0-4)
        System.out.println(array[position]);
        System.out.println(Arrays.toString(array));

    }

    private static void numberFormatException(String number) {
        //number = "Welcome to Java"; //NumberFormatException will be thrown here
        System.out.println("NumberFormatException:");
        Integer potentialNumber = Integer.parseInt(number);
        System.out.println(potentialNumber);
    }

    private static void arithmeticException(Scanner scanner) {
        System.out.println("Print a number");
        int number = scanner.nextInt();
        System.out.println("Arithmetic Exception: ");
        System.out.println(number / 0);
    }
}

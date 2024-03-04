package com.vladproduction.vp08_do_while;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double num1, num2, result;

        do {
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator){
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    throw new IllegalArgumentException("press correct operator or numbers");

            }

            System.out.print("Do you want to perform another calculation (y/n)? ");
        } while (scanner.next().charAt(0) == 'y');
    }
}

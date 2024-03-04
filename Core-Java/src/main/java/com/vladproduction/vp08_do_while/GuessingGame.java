package com.vladproduction.vp08_do_while;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 15;
        int guess;

        do {
            System.out.print("Guess a number between 1 and 20: ");
            guess = scanner.nextInt();
        } while (guess != secretNumber);

        System.out.println("You guessed it!");
    }
}

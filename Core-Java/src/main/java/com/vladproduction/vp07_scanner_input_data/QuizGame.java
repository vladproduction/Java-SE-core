package com.vladproduction.vp07_scanner_input_data;

import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int questions = 1;  // Modify the number of questions

        for (int i = 1; i <= questions; i++) {
            System.out.printf("Question %d: What is the capital of France? (a) Paris (b) Berlin (c) London\n", i);
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("a")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The answer is Paris.");
            }
        }

        System.out.printf("Your final score: %d out of %d\n", score, questions);
        scanner.close();  // Close the scanner
    }
}

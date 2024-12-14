package com.vladproduction.flow_control.loops;

import java.util.Scanner;

public class AnimalSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter a number (1-4) to select an animal:");
            System.out.println("1 - Cat");
            System.out.println("2 - Dog");
            System.out.println("3 - Fish");
            System.out.println("4 - Bird");
            System.out.println("Enter 0 to stop.");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Cat");
                    break;
                case 2:
                    System.out.println("Dog");
                    break;
                case 3:
                    System.out.println("Fish");
                    break;
                case 4:
                    System.out.println("Bird");
                    break;
                case 0:
                    System.out.println("Exiting the program press 0.");
                    break;
                default:
                    System.out.println("Invalid choice, please enter a number between 1 and 4.");
                    break;
            }
        } while (choice != 0); // Continue looping until the user enters 0

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

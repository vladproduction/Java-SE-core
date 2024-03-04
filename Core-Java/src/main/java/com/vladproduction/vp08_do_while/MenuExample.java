package com.vladproduction.vp08_do_while;

import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Breakfast A");
            System.out.println("2. Breakfast B");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("1. Breakfast A");
                    System.out.println("Egg/Toasts/Coffee/Fruit");
                    break;
                case 2:
                    System.out.println("1. Breakfast B");
                    System.out.println("Sausages/Musli/Coffee/Fruit");
                    break;
                case 3:
                    System.out.println("No choice for the moment");
                    System.out.println("Exit");
                    break;
                default:
                    throw new RuntimeException("paste the number to make choice");
            }

            System.out.print("Do you want to continue (1 = Yes, 0 = No)? ");
        } while (scanner.nextInt() == 1);
    }
}

package com.vladproduction.vp07_scanner_input_data;

import java.util.Scanner;

public class TextAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are standing in a forest. You see a path to the north and a cave to the east. Which way do you go? (north/east)");
        String direction = scanner.nextLine().trim().toLowerCase();

        if (direction.equals("north")) {
            System.out.println("You walk north and find a friendly dragon. He offers you a riddle. What has a neck without a head, a body without legs, and can be found in the sea? (A bottle)");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("a bottle")) {
                System.out.println("The dragon is impressed! He rewards you with a treasure chest.");
            } else {
                System.out.println("The dragon shakes his head and disappears.");
            }
        } else if (direction.equals("east")) {
            System.out.println("You enter the cave and find a hidden treasure chest!");
        } else {
            System.out.println("Invalid choice. You stay in the forest.");
        }
        scanner.close();
    }
}

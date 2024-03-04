package com.vladproduction.vp10_switch;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
//        intEntering();
        stringEntering();
    }

    private static void intEntering() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = scanner.nextInt();
        switch (age){
            case 18:
                System.out.println("You finished school");
                break;
            case 23:
                System.out.println("You finished university");
                break;
            case 24:
                System.out.println("You start carrier");
                break;
            default:
                System.out.println("no description for your age");
        }
    }

    private static void stringEntering() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print number in letters: ");
        String number = scanner.nextLine();
        switch (number){
            case "one":
                System.out.println("You number is ONE");
                break;
            case "two":
                System.out.println("You number is TWO");
                break;
            case "three":
                System.out.println("You number is THREE");
                break;
            default:
                System.out.println("no description");
        }
    }
}

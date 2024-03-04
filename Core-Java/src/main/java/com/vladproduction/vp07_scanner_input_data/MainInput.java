package com.vladproduction.vp07_scanner_input_data;

import java.util.Scanner;

public class MainInput {
    public static void main(String[] args) {

        String str = new String("Type here: ");
        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = scanner.nextInt();
        System.out.println("Your text is: " + s);
        System.out.println("and number = " + num); //InputMismatchException --> in case no numbers trying to input

    }
}

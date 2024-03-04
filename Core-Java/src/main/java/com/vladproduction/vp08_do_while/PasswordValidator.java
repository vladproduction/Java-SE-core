package com.vladproduction.vp08_do_while;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter a password <min 5 elements> (must contain a: " +
                    "digit, " +
                    "lowercase letter, " +
                    "uppercase letter, " +
                    "and a special character): ");
            password = scanner.nextLine();
        } while (!isValidPassword(password));

        System.out.println("Password accepted!");
    }

    public static boolean isValidPassword(String password) {
        int minLength = 5;

        if(password.length() >= minLength &&
                password.matches(".*[0-9].*") &&  // digit
                password.matches(".*[a-z].*") &&  // lowercase letter
                password.matches(".*[A-Z].*") &&  // uppercase letter
                password.matches(".*[^a-zA-Z0-9].*") // special character
        ){
            return true;
        }
        else {
            return false;
        }
    }
}

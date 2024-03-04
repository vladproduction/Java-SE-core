package com.vladproduction.vp06_if;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "T)123kl@TTO@";
        int minLength = 5;

        if(password.length() >= minLength &&
                password.matches(".*[0-9].*") &&  // digit
                password.matches(".*[a-z].*") &&  // lowercase letter
                password.matches(".*[A-Z].*") &&  // uppercase letter
                password.matches(".*[^a-zA-Z0-9].*") // special character
        ){
            System.out.println("Password is valid!".toUpperCase());
        }
        else {
            System.out.println("Password is invalid, check criteria please.");
        }
    }
}

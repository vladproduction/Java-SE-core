package com.vladproduction.app12.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String email_correct = "production@gmail.com";
        String email_incorrect = "production.com";
        System.out.println(isValidEmail(email_correct));
        System.out.println(isValidEmail(email_incorrect));

    }

    private static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()){
            throw new IllegalArgumentException();
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}

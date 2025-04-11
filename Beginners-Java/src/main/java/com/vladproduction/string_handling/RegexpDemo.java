package com.vladproduction.string_handling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpDemo {
    public static void main(String[] args) {

        //Compiling a Regex Pattern:
        Pattern pattern = Pattern.compile("\\d+"); // Matches one or more digits

        //Creating a Matcher:
        Matcher matcher = pattern.matcher("There 123 apples");

        //Using the Matcher:
        //methods from the Matcher class to find matches:
        //find(): Searches for the next subsequence that matches the pattern.
        //matches(): Checks if the entire string matches the pattern.
        //group(): Returns the matched subsequence.
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group()); // Outputs: Found: 123
        }

        //Example: Validating an Email Address:
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher("example@example.com");

        if (emailMatcher.matches()) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }


    }
}

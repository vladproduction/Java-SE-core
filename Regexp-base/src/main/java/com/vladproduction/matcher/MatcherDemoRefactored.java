package com.vladproduction.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemoRefactored {
    public static final String REGEX = "\\b[\\w]{2}\\b";
    public static final String REGEX_2 = "\\w*";
    private static String TEXT = "This is my second java 45 project.\n" +
            "It is wonderful to learn polysemantics and arrays.\n" +
            "The weather is cold like it should be in winter, but we are all looking forward to spring.";

    public static void main(String[] args) {
        System.out.println("Before:\n" + TEXT);
        System.out.println();

        System.out.println("findAndPrintMatches(REGEX, TEXT);");
        findAndPrintMatches(REGEX, TEXT);
        System.out.println();

        System.out.println("checkMatches(REGEX_2, wonderful, true);");
        checkMatches(REGEX_2, "wonderful", true);
        System.out.println();

        System.out.println("checkMatches(REGEX_2, wonderful!, true);");
        checkMatches(REGEX_2, "wonderful!", false);
        System.out.println();

        System.out.println("checkLookingAt(REGEX_2, Thanks!);");
        checkLookingAt(REGEX_2, "Thanks!");
        System.out.println();

        System.out.println("replaceText(REGEX, lab2, false);");
        replaceText(REGEX, "lab2", false);
        System.out.println();

    }

    private static void findAndPrintMatches(String regex, String text) {
        Matcher m = Pattern.compile(regex).matcher(text);
        System.out.println("Matches found:");
        while (m.find()) {
            System.out.printf("Found match: '%s' from %d to %d.\n", text.substring(m.start(), m.end()), m.start(), m.end() - 1);
        }
    }

    private static void checkMatches(String regex, String input, boolean expected) {
        Matcher m = Pattern.compile(regex).matcher(input);
        System.out.println(m.matches() == expected ? "Matches as expected." : "Does not match as expected.");
    }

    private static void checkLookingAt(String regex, String input) {
        boolean result = Pattern.compile(regex).matcher(input).lookingAt();
        System.out.println("Looking at: " + result);
    }

    private static void replaceText(String regex, String replacement, boolean all) {
        Matcher m = Pattern.compile(regex).matcher(TEXT);
        TEXT = all ? m.replaceAll(replacement) : m.replaceFirst(replacement);
        System.out.println("\nAfter:\n" + TEXT + "\n");
    }

}

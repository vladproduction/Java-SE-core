package com.vladproduction.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherReplace {
    public static final String REGEX = "(\\b[\\w]{2}\\b)"; // Updated to include capturing group
    private static String TEXT = "This is my second java 45 project.\n" +
            "It is wonderful to learn polysemantics and arrays.\n" +
            "The weather is cold like it should be in winter, but we are all looking forward to spring.";

    public static void main(String[] args) {
        System.out.println("replaceText2(REGEX, $1_lab2, true);");
        replaceText2(REGEX, "$1_lab2", true);  // This will now work correctly
        System.out.println();
    }

    private static void replaceText2(String regex, String replacement, boolean all) {
        Matcher m = Pattern.compile(regex).matcher(TEXT);
        TEXT = all ? m.replaceAll(replacement) : m.replaceFirst(replacement);
        System.out.println("\nAfter:\n" + TEXT + "\n");
    }
}

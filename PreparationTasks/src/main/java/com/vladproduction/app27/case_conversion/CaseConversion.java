package com.vladproduction.app27.case_conversion;

public class CaseConversion {
    public static void main(String[] args) {

        String input = "Java Programming";
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Case converted: " + result);

    }
}

package com.vladproduction.app08.count_vowels_consonants;

public class CountVowelsConsonants {
    public static void main(String[] args) {

//        countVowelsAndConsonants("Hello World!");
//        countVowelsAndConsonants("aaa");
//        countVowelsAndConsonants("bbb");
//        countVowelsAndConsonants("ab");
//        countVowelsAndConsonants(" -");
//        countVowelsAndConsonants(" -g");
//        countVowelsAndConsonants("10");

        countVowelsAndConsonants2("Hello World!");
        countVowelsAndConsonants2("aaa");
        countVowelsAndConsonants2("bbb");
        countVowelsAndConsonants2("ab");
        countVowelsAndConsonants2(" -");
        countVowelsAndConsonants2(" -g");
        countVowelsAndConsonants2("10");


    }

    private static void countVowelsAndConsonants(String inputString) {
        if(inputString == null || inputString.isEmpty() || inputString.trim().isEmpty()){
            throw new IllegalArgumentException("Input string is empty, please enter a valid string (at least one letter)");
        }
        int countVowels = 0, countConsonants = 0;
        String vowelsList = "aeiouAEIOU";

        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                if(vowelsList.indexOf(ch) >= 0){
                    countVowels++;
                }
                else {
                    countConsonants++;
                }
            } else {
                throw new IllegalArgumentException("Input string contains invalid character");
            }

        }

        System.out.println("countVowels = " + countVowels);
        System.out.println("countConsonants = " + countConsonants);
    }

    private static void countVowelsAndConsonants2(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("Input string is null, please enter a valid string");
        }
        if (inputString.trim().isEmpty()) {
            throw new IllegalArgumentException("Input string is empty, please enter a valid string (at least one letter)");
        }

        int countVowels = 0, countConsonants = 0;
        String vowelsList = "aeiouAEIOU";

        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelsList.indexOf(ch) >= 0) {
                    countVowels++;
                } else {
                    countConsonants++;
                }
            }
        }

        System.out.println("Input String: " + inputString);
        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);
        System.out.println();
    }


}

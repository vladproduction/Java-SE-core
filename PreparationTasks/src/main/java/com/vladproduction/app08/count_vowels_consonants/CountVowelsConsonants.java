package com.vladproduction.app08.count_vowels_consonants;

public class CountVowelsConsonants {
    public static void main(String[] args) {

        countVowelsAndConsonants("Hello World!");
        countVowelsAndConsonants("aaa");
        countVowelsAndConsonants("bbb");
        countVowelsAndConsonants("ab");
        countVowelsAndConsonants(" -");
        countVowelsAndConsonants(" -g");
        countVowelsAndConsonants("10");

        System.out.println();
        countVowelsAndConsonants2("Hello World!");
        countVowelsAndConsonants2("aaa");
        countVowelsAndConsonants2("bbb");
        countVowelsAndConsonants2("ab");
        countVowelsAndConsonants2(" -");
        countVowelsAndConsonants2(" -g");
        countVowelsAndConsonants2("10");

        System.out.println();
        countVowelsAndConsonants3("Hello World!");
        countVowelsAndConsonants3("aaa");
        countVowelsAndConsonants3("bbb");
        countVowelsAndConsonants3("ab");
        countVowelsAndConsonants3(" -");
        countVowelsAndConsonants3(" -g");
        countVowelsAndConsonants3("10");


    }

    private static void countVowelsAndConsonants(String inputString) {
        if(inputString == null || inputString.isEmpty() || inputString.trim().isEmpty()){
            throw new IllegalArgumentException("Input string is empty, please enter a valid string (at least one letter)");
        }
        int countVowels = 0, countConsonants = 0, specialChars = 0;
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
                specialChars++;
            }
        }
        System.out.println("String: " + inputString + ", Vowels: " + countVowels + " Consonants: " + countConsonants + " Special chars: " + specialChars);
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

        System.out.println("String: " + inputString + ", Vowels: " + countVowels + " Consonants: " + countConsonants);

    }

    private static void countVowelsAndConsonants3(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("Input string is null, please enter a valid string");
        }
        if (inputString.trim().isEmpty()) {
            throw new IllegalArgumentException("Input string is empty, please enter a valid string (at least one letter)");
        }
        String str = inputString.toLowerCase();
        int countVowels = 0, countConsonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (Character.isLetter(letter)) {
                if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                    countVowels++;
                }else{
                    countConsonants++;
                }
            }
        }
        System.out.println("String: " + inputString + ", Vowels: " + countVowels + " Consonants: " + countConsonants);
    }


}

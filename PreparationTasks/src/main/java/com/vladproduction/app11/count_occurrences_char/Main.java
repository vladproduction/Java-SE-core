package com.vladproduction.app11.count_occurrences_char;

public class Main {
    public static void main(String[] args) {

        // Example usage
        int occurrences = countCharOccurrences("Hello World!", 'o');
        System.out.println(occurrences); // 2

    }

    private static int countCharOccurrences(String text, char character) {
        if (text == null || text.isEmpty()){
            throw new IllegalArgumentException();
        }
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == character){
                count++;
            }
        }
        return count;
    }

}

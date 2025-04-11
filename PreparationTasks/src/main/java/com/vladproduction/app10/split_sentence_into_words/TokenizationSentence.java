package com.vladproduction.app10.split_sentence_into_words;

public class TokenizationSentence {
    public static void main(String[] args) {

        String sentenceForTest = "This is a test sentence";
        String[] tokens = tokenizer(sentenceForTest);
        for (String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();

    }

    private static String [] tokenizer(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return sentence.split("\\s+");
    }

}

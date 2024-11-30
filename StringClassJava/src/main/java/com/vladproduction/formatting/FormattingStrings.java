package com.vladproduction.formatting;

public class FormattingStrings {
    public static void main(String[] args) {
        String formatString= "We are printing double variable (%f), string (\"%s\") and integer variable (%d).";
        System.out.println(String.format(formatString, 0.7, "Java", 10));

        /* %d – (int, long, …)
           %f – (float, double) */

        /* %s – string
           %c – char
           %% – symbol of '%'  */

        /* %t – date/time
           %b – boolean */
    }
}

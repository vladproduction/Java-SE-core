package com.vladproduction.app25.conversion_string_integer;

public class ConversionStringInteger {
    public static void main(String[] args) {

        //String into Integer
        String str = "12345";
        int convertedValueIntoInteger = stringToInt(str);
        System.out.println("Converted value into integer: " + convertedValueIntoInteger);


        //Integer into String
        int number = 12345;
        String convertedValueIntoString = intToString(number);
        System.out.println("Converted value into string: " + convertedValueIntoString);
    }

    private static int stringToInt(String str) {
        return Integer.parseInt(str);
        //or
        //return Integer.valueOf(str);
    }

    private static String intToString(int number) {
        //return Integer.toString(number);
        //or
        //return String.valueOf(number);
        //or
        //return String.format("%d", number);
        //or
        return "" + number;

    }

}

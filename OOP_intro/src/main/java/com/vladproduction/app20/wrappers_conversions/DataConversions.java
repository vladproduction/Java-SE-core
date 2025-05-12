package com.vladproduction.app20.wrappers_conversions;

public class DataConversions {
    public static void main(String[] args) {

        System.out.println("\nimplicit (widening) conversion");
        //implicit (widening) conversion
        //int --> double
        int num = 100;
        double d = num; // int to double automatic conversion
        System.out.println("Integer value: " + num + " double value: " + d);

        System.out.println("\nexplicit (narrowing) conversion");

        //explicit (narrowing) conversion
        //double --> int
        double doubleVal = 500.0;
        int intVal = (int) doubleVal;
        System.out.println("Double value: " + doubleVal + " int value: " + intVal);

        System.out.println("\nType Conversion using Wrapper Classes");
        //Type Conversion using Wrapper Classes
        int integerValue = 50;
        //boxing primitive to object
        Integer boxedInteger = Integer.valueOf(integerValue);
        //unboxing object to primitive
        int unboxedInteger = boxedInteger.intValue();
        System.out.println("Integer value: " + integerValue);
        System.out.println("boxed (int -> Integer) value: " + boxedInteger);
        System.out.println("unboxed (Integer -> int) value: " + unboxedInteger);

        //String conversion

        System.out.println("\nPrimitive to String: int, double, boolean, char --> String");
        //Primitive to String: int, double, boolean, char --> String
        //Use String.valueOf() or toString()
        int num2 = 100;
        String str = String.valueOf(num2);
        //or
        String str2 = Integer.toString(num2);
        System.out.println("Converted int -> String (valueOf): " + str);
        System.out.println("Converted Integer -> String (toString): " + str2);
        boolean bool = true;
        String str3 = String.valueOf(bool);
        System.out.println("Converted boolean -> String (valueOf): " + str3);

        System.out.println("\nString to Primitive: String --> int, double, bool, char (not possible)");
        //String to Primitive: String --> int, double, bool, char (not possible)
        //Use wrapper class methods like parseInt(), parseDouble()

        String strVal = "100";
        int intVal2 = Integer.parseInt(strVal);
        System.out.println("Converted String -> int (parseInt): " + intVal2);
        double doubleVal2 = Double.parseDouble(strVal);
        System.out.println("Converted String -> double (parseDouble): " + doubleVal2);
        boolean boolVal = Boolean.parseBoolean(strVal);
        System.out.println("Converted String -> boolean (parseBoolean): " + boolVal);
        char charVal_1 = strVal.charAt(0);
        char charVal_2 = strVal.charAt(1);
        char charVal_3 = strVal.charAt(2);
        System.out.println("Converted String -> char (charAt): " + charVal_1);
        System.out.println("Converted String -> char (charAt): " + charVal_2);
        System.out.println("Converted String -> char (charAt): " + charVal_3);


    }
}















package com.vladproduction.stringMethods;

public class StringMethods {
    public static void main(String[] args) {
        method_length();
        index_charAt();
        method_getChars();
        get_substring();
        method_indexOf();
        find_substring();
        method_replace();
        how_to_modify();
        method_equals();
        regionMatches();
        method_compareTo();
    }

    private static void method_compareTo() {
        String str1 = "JavaDoc";
        String str2 = "World";
        String str3 = "Java";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
    }

    private static void regionMatches() {
        String str1 = "Learn Java";
        String str2 = "Cool avatar!";
        boolean result = str1.regionMatches(7, str2, 5, 3);
        System.out.println(result);
    }

    private static void method_equals() {
        String str1 = "Java";
        String str2 = "java";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    private static void how_to_modify() {
        String str1 = "\tWelcome \n";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.trim());
    }

    private static void method_replace() {
        String str="Welcome";
        System.out.println(str.replace('e', 'A'));
        System.out.println(str.replaceAll("el", "AB"));
    }

    private static void find_substring() {
        String str = "String в java is a sequence of characters java";
        int i1 = str.indexOf("java");
        int i2 = str.lastIndexOf("java");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(str.indexOf("java", 20));
    }

    private static void method_indexOf() {
        String str="Software And Hardware!";
        int i1 = str.indexOf('a');
        int i2 = str.lastIndexOf('a');
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(str.indexOf('x'));
    }

    private static void method_getChars() {
        String str="Software And Hardware!";
        int start = 9;
        int end = 12;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);
    }

    private static void get_substring() {
        String str="Software And Hardware!";
        String substr1 = str.substring(13);
        System.out.println(substr1);
        System.out.println(str.substring(0, 8));
        System.out.println(str.substring(13, 17));
    }

    private static void index_charAt() {
        String str="Software And Hardware!";
        char aChar0 = str.charAt(0);
        System.out.println(aChar0);
        System.out.println(str.charAt(9));
        System.out.println(str.charAt( str.length() - 1));
    }

    private static void method_length() {
        String str0 = "";
        String str1 = "Learning";
        String str2 = "java!";
        String str3 = str1 + str2;

        System.out.println("str0 - " + str0.length() + " symbols");
        System.out.println("str1 - " + str1.length() + " symbols");
        System.out.println("str2 - " + str2.length() + " symbols");
        System.out.println("str3 - " + str3.length() + " symbols");
    }
}

package com.vladproduction.vp23_string_builder;

public class StringsFormats {
    public static void main(String[] args) {
        System.out.printf("String, %s", "Object.class" + "\n");
        System.out.printf("Number, %d\n", 100);
        System.out.println("----------------------------------");
        System.out.printf("Number: %-10d\n", 123456);
        System.out.printf("Number: %-10d\n", 12);
        System.out.printf("Number: %-10d\n", 156);
        System.out.printf("Number: %-10d\n", 1000023456);
        System.out.printf("Number: %-10d\n", 12346);
        System.out.println("-----------------------------------");
        System.out.printf("Number: %10d\n", 123456);
        System.out.printf("Number: %10d\n", 12);
        System.out.printf("Number: %10d\n", 156);
        System.out.printf("Number: %10d\n", 1000023456);
        System.out.printf("Number: %10d\n", 12346);
        System.out.println("---------------------------------");
        System.out.printf("Number: %.3f\n", 12.3456);
        System.out.printf("Number: %.2f\n", 12.3333);
        System.out.printf("Number: %.1f\n", 1.56);
        System.out.printf("Number: %.5f\n", 10.00023456);
        System.out.printf("Number: %.4f\n", 1.332346);
    }
}

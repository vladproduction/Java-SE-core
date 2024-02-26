package com.vladproduction.datatypes_scanner;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print name:");
        String name = scanner.next();
        System.out.println(name);

        System.out.println("Print age:");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("-------------------");
        System.out.println("Math operations:");
        System.out.println("Enter numb 1:");
        byte aByte = scanner.nextByte();
        System.out.println("Enter numb 2:");
        byte bByte = scanner.nextByte();

        float aFloat = scanner.nextFloat();
        float bShort = scanner.nextShort();

        float resFloatShort = aFloat / bShort;
        System.out.println("resFloatShort = " + resFloatShort);

        String num_100 = "100";

        System.out.println("Result:");

        double result = aByte + bByte + Double.parseDouble(num_100);
        System.out.println("result = " + result);
        System.out.println("Sum: " + (aByte + bByte));
        System.out.println("Sub: " + (aByte - bByte));
        System.out.println("Mul: " + (aByte * bByte));

        float res = aByte/bByte;
        System.out.println("Div: " + res);
        System.out.println("Rem: " + (aByte % bByte));

        int a = 0;
        a--;
        a++;
        a = 3 + a;
        a += 10;
        System.out.println(a);




    }
}

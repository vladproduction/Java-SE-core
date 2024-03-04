package com.vladproduction.vp06_if;

import java.util.Scanner;

public class LeapYearScannerInput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = in.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is leap year.");
        }else {
            System.out.println(year + " is not leap year.");
        }

    }
}

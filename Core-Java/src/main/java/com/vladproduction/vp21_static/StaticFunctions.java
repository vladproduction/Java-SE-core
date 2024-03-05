package com.vladproduction.vp21_static;

import java.util.Scanner;

public class StaticFunctions {
    public static void main(String[] args) {

        functionPower(2, 4);
        functionSquareOfCircle(); //Scanner action

    }

    private static void functionPower(double a, double b){
        System.out.println(a + " ^ " + b + " = " + Math.pow(a, b));
    }
    private static void functionSquareOfCircle(){
        //π r2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit of radius: ");
        int radius = scanner.nextInt();
        System.out.println("Square circle: " + Math.PI * (Math.pow(radius, 2))); //12.56637061 if radius = 2
    }
}

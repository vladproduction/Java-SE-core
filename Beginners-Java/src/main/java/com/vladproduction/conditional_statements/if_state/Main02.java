package com.vladproduction.conditional_statements.if_state;


import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age < 18){
            System.out.println("Kid");
        }else if (age < 60){
            System.out.println("Adult");
        }else if (age >= 60){
            System.out.println("Over 60");
        }

    }
}

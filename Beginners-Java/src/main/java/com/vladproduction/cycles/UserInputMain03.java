package com.vladproduction.cycles;

import java.util.Scanner;

public class UserInputMain03 {
    public static void main(String[] args) {

        int user_input;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter num '5': ");
            user_input = in.nextInt();
        }while (user_input != 5);
        System.out.println("Num is correct!");
    }
}

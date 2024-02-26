package com.vladproduction.conditional_statements.if_state;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        boolean withParents = in.nextBoolean();

        if(age < 18){
            if(age >= 10 && age <=15 && withParents){
                System.out.println("You are between 10 and 15 and you are with your parents");
            }else if((age == 7 || age == 9) && !withParents){
                System.out.println("Entrance is free");
            }
        } else if (age == 18) {
            System.out.println("You are 18!");
        }else if (age == 19) {
            System.out.println("You are 19!");
        } else {
            if (age > 50 ){
                System.out.println("You are 50 +");
            }
            else {
                System.out.println("You are not yet 50");
            }
        }
    }
}

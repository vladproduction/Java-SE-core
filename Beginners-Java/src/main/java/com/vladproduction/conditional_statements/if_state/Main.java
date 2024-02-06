package com.vladproduction.conditional_statements.if_state;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        boolean isTrue = true;
        if(isTrue){
            System.out.println("Done");
        }
        if(num != 10){
            System.out.println("num = 10 ? :" + num);
        }
    }
}

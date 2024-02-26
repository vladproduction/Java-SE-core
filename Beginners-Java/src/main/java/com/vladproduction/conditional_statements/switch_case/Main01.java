package com.vladproduction.conditional_statements.switch_case;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        byte num = 12;
        switch (num){
            case 1:
                System.out.println("Variable = 1");
                break;
            case 23:
                System.out.println("Variable = 23");
                break;
            case 100:
                System.out.println("Variable = 100");
                break;
            case 101:
                System.out.println("Variable = 101");
                break;
            case 10:
                System.out.println("Variable = 10");
                break;
            default:
                System.out.println("Variable non identifier!");
        }
    }
}

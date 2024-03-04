package com.vladproduction.vp04_while;

public class WhileMain {
    public static void main(String[] args) {

        boolean t = true;
        System.out.println("t = " + t);

        boolean true_exp = 5 > 2;
        System.out.println("true_exp = " + true_exp);

        boolean false_exp = 5 < 2;
        System.out.println("false_exp = " + false_exp);

        boolean true_exp2 = 5 >= 5;
        System.out.println("true_exp2 = " + true_exp2);

        boolean true_exp3 = 5 == 5; //operation as equal of two numbers (true||false)
        System.out.println("true_exp3 = " + true_exp3);

        //for while loop we need some logic operator which help us to continue till it break this logic and stop loop;
        //WHILE:
        System.out.println("-------------------------");
        int value = 0;
        while (value < 5){
            System.out.println("Hello " + value);
            value = value+1;
        }



    }
}

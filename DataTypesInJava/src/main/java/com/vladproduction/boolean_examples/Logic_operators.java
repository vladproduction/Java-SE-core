package com.vladproduction.boolean_examples;

import java.util.Random;

public class Logic_operators {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt() % 100;
        int j = rand.nextInt() % 100;
        prt("i = " + i);
        prt("j = " + j);
        prt("i > j is " + (i > j));
        prt("i < j is " + (i < j));
        prt("i >= j is " + (i >= j));
        prt("i <= j is " + (i <= j));
        prt("i == j is " + (i == j));
        prt("i != j is " + (i != j));
        prt("(i < 10) && (j < 10) is "+ ((i < 10) && (j < 10)) );
        prt("(i < 10) || (j < 10) is "+ ((i < 10) || (j < 10)) );


    }

    static void prt(String s){
        System.out.println(s);
    }
}

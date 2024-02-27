package com.vladproduction.cycles;

public class Main02_while {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        System.out.println("-------do_while------");
        int j = 100;
        do {
            System.out.println("work done!");
            j /= 2;
        } while (j > 10);
    }
}

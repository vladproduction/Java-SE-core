package com.vladproduction.vp05_for;

public class ForMain {
    public static void main(String[] args) {

        increment(4);
        decrement(10, 2);

    }

    protected static void increment(int iter) {
        for (int i = 1; i <= iter; i++) {
            System.out.println(i);
        }
    }

    protected static void decrement(int size, int step) {
        for (int i = size; i > 0; i = i - step) {
            System.out.println(i);
        }
    }

}



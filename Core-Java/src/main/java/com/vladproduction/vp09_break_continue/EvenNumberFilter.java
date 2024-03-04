package com.vladproduction.vp09_break_continue;

public class EvenNumberFilter {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
    }
}

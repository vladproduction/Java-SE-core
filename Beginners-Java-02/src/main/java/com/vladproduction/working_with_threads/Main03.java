package com.vladproduction.working_with_threads;

public class Main03 {
    public static void main(String[] args) {



        Thread obj6 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("elem: " + i);
                }
            }
        });
        obj6.start();

        Thread obj7 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("elem: " + i);
                }
            }
        });
        obj7.start();

    }
}

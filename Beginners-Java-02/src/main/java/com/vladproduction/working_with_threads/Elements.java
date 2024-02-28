package com.vladproduction.working_with_threads;

public class Elements extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Element: " + i);
        }
    }
}

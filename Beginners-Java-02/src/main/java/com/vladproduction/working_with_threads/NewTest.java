package com.vladproduction.working_with_threads;

public class NewTest implements Runnable{
    @Override
    public void run() {
        System.out.println("NewTest...");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Element: " + i);
        }
    }
}

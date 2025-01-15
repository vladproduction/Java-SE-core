package com.vladproduction._04_multithreading.cases_to_use;

/**
 * Using interface Runnable to implement run();
 * */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("MyRunnable class started!");
            Thread.sleep(1000);
            System.out.println("MyRunnable class finished!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Thread threadRunnable = new Thread(new MyRunnable());
        threadRunnable.setName("threadRunnable");
        threadRunnable.start();
        System.out.println(threadRunnable.getName());
    }
}

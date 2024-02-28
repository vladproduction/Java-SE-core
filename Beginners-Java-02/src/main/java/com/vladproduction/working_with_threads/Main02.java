package com.vladproduction.working_with_threads;

public class Main02 {
    public static void main(String[] args) {

       //Runnable

        Thread obj3 = new Thread(new NewTest());
        obj3.start();

        Thread obj4 = new Thread(new NewTest());
        obj4.start();



    }
}

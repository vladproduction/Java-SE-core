package com.vladproduction.working_with_threads;

public class Main {
    public static void main(String[] args) {

        //no guarantee which one started first, and how to be done printing
//        Elements obj1 = new Elements();
//        obj1.start();
//
//        Elements obj2 = new Elements();
//        obj2.start();

        //threads starts work one by one
        Elements obj1 = new Elements();
        String obj1Name = obj1.getName();
        System.out.println("obj1Name = " + obj1Name);
//        obj1.start();
        obj1.run();

        Elements obj2 = new Elements();
        String obj2Name = obj1.getName();
        System.out.println("obj2Name = " + obj2Name);
//        obj2.start();
        obj2.run();


    }
}

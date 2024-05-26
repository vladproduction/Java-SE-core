package com.app.vp.chapter_1_basic_OOP;

/**
 * testing logic for TimeClass
 * */
public class TimeClassMain {
    public static void main(String[] args) {

        //constructor with params
        TimeClass time1 = new TimeClass(1,2,3);
        System.out.println("time1 = " + time1);

        //constructor default
        TimeClass time2 = new TimeClass();
        System.out.println("time2 = " + time2);

        //testing getters && setters
        time1.setSecond(6);
        time1.setMinute(5);
        time1.setHour(4);
        System.out.println(time1); //check modified object

        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());

        //testing setTimeClass() method
        time1.setTimeClass(58, 59,23);
        System.out.println(time1); //23:59:58

        //check nextSecond() method and cascade operations
        System.out.println(time1.nextSecond()); //object of TimeClass 23:59:59
        System.out.println(time1.nextSecond().nextSecond().nextSecond());

        //testing validation for setSecond
        TimeClass time3 = new TimeClass(00, 50, 20);
        System.out.println("time3 = " + time3);
        time3.setSecond(86);
        System.out.println("time3 = " + time3);



    }
}

package com.vladproduction.date;

import java.time.LocalDateTime;

public class ComparingDates {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2024, 12, 31, 10, 10);

        //compareTo
        System.out.println(ldt1.compareTo(ldt2)); // 1 --> first is greater than second date
        System.out.println(ldt2.compareTo(ldt1)); // -1 --> second is greater than first date

        //isAfter
        System.out.println(ldt1.isAfter(ldt2)); //true

        //isBefore
        System.out.println(ldt1.isBefore(ldt2)); //false

        //isAfter
        System.out.println(ldt1.isEqual(ldt2)); //false


    }
}

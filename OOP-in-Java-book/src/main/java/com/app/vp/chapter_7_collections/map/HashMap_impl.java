package com.app.vp.chapter_7_collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_impl {
    public static void main(String[] args) {

        HashMap<Integer, Month> monthMap = new HashMap<>();
        monthMap.put(1, Month.JANUARY);
        monthMap.put(2, Month.FEBRUARY);
        monthMap.put(3, Month.MARCH);

        Month january = monthMap.get(1); //no needed downcasting
        System.out.println("january = " + january);
        Month february = monthMap.get(2);
        System.out.println("february = " + february);
        Month march = monthMap.get(3);
        System.out.println("march = " + march);

        System.out.println("using keySet() method:");
        //using keySet() method:
        Set<Integer> keySet = monthMap.keySet();
        for (Integer key: keySet){
            System.out.print(key);
            System.out.print(" : ");
            System.out.print(monthMap.get(key));
            System.out.print("; ");
        }
        System.out.println();

        System.out.println("using using keySet() method:");
        //using c method
        for (Map.Entry<Integer, Month> integerMonthEntry : monthMap.entrySet()) {
            Integer key = integerMonthEntry.getKey();
            Month value = integerMonthEntry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(key).append(" : ").append(value).append("; ");
            System.out.print(sb);
        }
        System.out.println();


    }
}
enum Month{
    JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
}

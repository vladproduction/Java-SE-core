package com.vladproduction.vp48_enum;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class MainSeason {
    public static void main(String[] args) {

        Season season = Season.SUMMER;

        /**Object --> Enum --> Season*/


        switch (season){
            case SUMMER -> System.out.println("Worm");
            case WINTER -> System.out.println("Cold");
            case SPRING -> System.out.println("Moderately warm");
            case AUTUMN -> System.out.println("Moderately cold");
            default -> System.out.println("No data");
        }

        System.out.println("------------------");
        System.out.println(season instanceof Object);
        System.out.println(season instanceof Enum<?>);
        System.out.println(season instanceof Season);
        System.out.println("-------------------");
        System.out.println(season.getClass().getSimpleName());

        System.out.println("---------------------");

        Season seasonW = Season.WINTER;
        int avgTemp = seasonW.getAvgTemp();
        System.out.println("avgTemp = " + avgTemp);

        System.out.println("--------some methods for Enum---------");
        System.out.println("name(): " + seasonW.name());  // WINTER --> return declared name of enum

        Season valueOfSpring = Season.valueOf("SPRING");
        System.out.println("valueOf(): " + valueOfSpring.getAvgTemp());  // SPRING --> return data of value by concrete enum

        Season autumn = Season.AUTUMN;
        int ordinal = autumn.ordinal();
        System.out.println("ordinal(): " + ordinal); // 1 --> return index of enum among all of them in class


    }
}

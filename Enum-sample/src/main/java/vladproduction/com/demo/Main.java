package vladproduction.com.demo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //name and ordinal:
        System.out.println(SeasonsEnum.WINTER.name());//WINTER
        System.out.println(SeasonsEnum.WINTER.ordinal());//0
        //values, valueOf:
        SeasonsEnum[] seasonsEnums = SeasonsEnum.values();
        System.out.println(Arrays.toString(seasonsEnums));//[WINTER, SPRING, SUMMER, AUTUMN]
        System.out.println(SeasonsEnum.valueOf("SPRING"));//SPRING
        //compareTo:
        System.out.println(SeasonsEnum.SPRING.compareTo(SeasonsEnum.WINTER));//1
        System.out.println(SeasonsEnum.SPRING.compareTo(SeasonsEnum.SPRING));//0
        System.out.println(SeasonsEnum.SPRING.compareTo(SeasonsEnum.SUMMER));//-1
        System.out.println(SeasonsEnum.WINTER.compareTo(SeasonsEnum.SUMMER));//-2
        //equals:
        boolean isEqualToItself = SeasonsEnum.WINTER.equals(SeasonsEnum.WINTER);
        boolean isEqualToDifferentSeason = SeasonsEnum.WINTER.equals(SeasonsEnum.SUMMER);
        System.out.println(isEqualToItself); //true
        System.out.println(isEqualToDifferentSeason); //false
        SeasonsEnum season = SeasonsEnum.WINTER;
        System.out.println(season == SeasonsEnum.WINTER); //true
        System.out.println(season == SeasonsEnum.SUMMER); //false
        //toString:
        System.out.println(SeasonsEnum.SPRING);//Season: SPRING
        System.out.println(SeasonsEnum.SUMMER);// Season: SUMMER
        System.out.println(SeasonsEnum.WINTER);//Season: WINTER
        System.out.println(SeasonsEnum.AUTUMN);//Season: AUTUMN

    }
}

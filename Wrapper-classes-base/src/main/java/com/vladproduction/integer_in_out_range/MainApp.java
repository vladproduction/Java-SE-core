package com.vladproduction.integer_in_out_range;

public class MainApp {
    public static void main(String[] args) {
        //in range of -128 127
        Integer ten = 10;
        Integer copyOfTen = 10;
        System.out.println( ten == copyOfTen ); //true
        System.out.println( ten.equals(copyOfTen) ); //true

        //out of range -128 127
        Integer thousand = 1000;
        Integer copyOfThousand = 1000;
        System.out.println(thousand == copyOfThousand); // false
        System.out.println(thousand.equals(copyOfThousand)); //true
    }
}

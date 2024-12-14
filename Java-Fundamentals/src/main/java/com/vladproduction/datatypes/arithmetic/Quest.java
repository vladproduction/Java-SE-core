package com.vladproduction.datatypes.arithmetic;

public class Quest {
    static int j = 2;
    public static void result(int i){
        i *= 10;
        j += 2;
    }
    public static void main(String[] args){
        char i = '1';
        result(i);
        System.out.println(i + " " + j); //1 4
    }
}

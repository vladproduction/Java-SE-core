package com.vladproduction.app17.static_keyword;

public class Static {

    static int y = 100;
    int x;

    public void m(){
        y++;
        x++;
    }

    public static void m2(){
        y++;
        //x++;//we cannot use it because x is NOT static, or this method should be not static
    }

}
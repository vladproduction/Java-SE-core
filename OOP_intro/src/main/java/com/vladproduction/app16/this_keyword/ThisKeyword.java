package com.vladproduction.app16.this_keyword;

public class ThisKeyword {

    //class variables/instance variables
    int x, y;

    public ThisKeyword(){
        this(0, 0);
    }

    public ThisKeyword(int x, int y){
        this.x = x;
        this.y = y;
    }

    void setData(int x, int y){
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println("x = " + x + " y = " + y);
    }


}

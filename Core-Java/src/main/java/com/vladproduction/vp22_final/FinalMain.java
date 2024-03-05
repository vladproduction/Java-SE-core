package com.vladproduction.vp22_final;

public class FinalMain {
    public static void main(String[] args) {
        /**
         * if variable marked as final, it can`t be changed same as method or class
         * so it`s like constant*/

        final int X = 10;
        System.out.println(X);
        //X = 5; //can`t modify
    }

}

class TestClass{
    public static final int CONSTANT = 0;

}

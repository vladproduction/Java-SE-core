package com.vladproduction.app18.final_keyword;

public class FinalKeyword {
    public static void main(String[] args) {

        Test t = new Test();
        //t.x = 11; //not allowed to modify ('x' is defined as final)
        System.out.println(t.x);

    }

    static class Test{
        final int x = 10;
    }

}

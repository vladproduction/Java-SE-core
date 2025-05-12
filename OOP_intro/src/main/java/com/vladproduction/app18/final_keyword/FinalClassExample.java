package com.vladproduction.app18.final_keyword;

public class FinalClassExample {
    public static void main(String[] args) {

    }

    static final class Test{
        final void m1(){
            System.out.println("m1() is final method");
        }
    }

    //this class is not allowed to be extends
    /*static class Test2 extends Test {

        //also it does not allowed to override final method
        @Override
        final void m1(){
            System.out.println("m1() is final method: not allowed to be overridden");
        }

    }*/


}

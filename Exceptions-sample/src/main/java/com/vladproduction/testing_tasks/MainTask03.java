package com.vladproduction.testing_tasks;

public class MainTask03 {
    public static void main(String[] args)  {
        try  {
            method();
        }  catch (StackOverflowError e)  {
            for (int i = 0; i < 2; ++i)
                System.out.println(i);
        }
    }
    public static void method() {
        method();
        //0
        //1
    }
}

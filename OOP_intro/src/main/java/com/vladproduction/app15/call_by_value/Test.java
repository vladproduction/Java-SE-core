package com.vladproduction.app15.call_by_value;

public class Test {

    int number;

    void m1(int number){
        number = number + 10;
    }

    void m2(Test test){
        System.out.println("Trying to change value in method: (+10)");
        test.number = test.number + 10;
        System.out.println("Value in method: " + test.number);
    }

}

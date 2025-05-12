package com.vladproduction.app15.call_by_value;

public class CallByReference {
    public static void main(String[] args) {

        Test test = new Test();
        test.number = 100; //initializing
        System.out.println("Before method: " + test.number); //100
        test.m2(test);
        System.out.println("After method: " + test.number); //110 --> //Original number modified


    }
}

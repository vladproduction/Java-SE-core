package com.vladproduction.app35.java_parameter_passing;

public class ParamPassingPrimitive {
    public static void main(String[] args) {

        int data = 10;
        System.out.println("Data before calling method: " + data);
        int processData = processData(data);//we have to return the result of method

        System.out.println("Data after calling method: " + processData);//100

        processDataVoid(data);
        System.out.println("Data after calling method: " + data);//10
    }

    private static int processData(int data) {
        return data * 10;
    }

    private static void processDataVoid(int data) {
        data = data * 10;
    }
}

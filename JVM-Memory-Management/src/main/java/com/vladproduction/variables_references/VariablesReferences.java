package com.vladproduction.variables_references;

public class VariablesReferences {

    public static void main(String[] args) {

        int localVariable = 5;

        int res = calculate(localVariable);

        System.out.println(localVariable); // 5

        //but

        System.out.println(res); // 10
    }

    public static int calculate(int calcVariable) {
         return calcVariable * 2;
    }
}

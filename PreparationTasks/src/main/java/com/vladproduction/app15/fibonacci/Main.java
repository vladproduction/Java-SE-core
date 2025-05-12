package com.vladproduction.app15.fibonacci;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] generated = generate(15);
        System.out.println(Arrays.toString(generated));

        fibonacciGenerator(15);


    }

    private static int [] generate(int n){
        int[] res =  new int[n];

        if(n == 0){
            return res;
        }
        if(n == 1){
            return res;
        }
        res[0] = 0;
        res[1] = 1;

        for(int i = 2; i < n; i++){
            res[i] = res[i - 1] + res[i - 2];
        }
        return res;
    }

    private static void fibonacciGenerator(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " "); //print first numbers
        for (int i = 2; i < n; i++) {
            int c = a + b; //calculating the next number and print
            System.out.print(c + " ");
            //reassign values while the loop is running:
            a = b;
            b = c;
        }
    }

}

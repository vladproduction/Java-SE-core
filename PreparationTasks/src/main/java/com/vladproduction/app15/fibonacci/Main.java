package com.vladproduction.app15.fibonacci;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] generated = generate(15);
        System.out.println(Arrays.toString(generated));
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

}

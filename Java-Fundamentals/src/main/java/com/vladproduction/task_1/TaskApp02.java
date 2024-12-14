package com.vladproduction.task_1;

import java.util.Arrays;

/**
 * 2. Display the command line arguments in the console window in reverse order.
 * */
public class TaskApp02 {
    public static void main(String[] args) {
        String[] arr = new String[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = args[args.length - 1 - i];

        }
        System.out.println(Arrays.toString(arr));
        //command line:
        //java .\TaskApp02.java arg3 arg2 arg1 arg0
        //output: [arg0, arg1, arg2, arg3]

    }
}

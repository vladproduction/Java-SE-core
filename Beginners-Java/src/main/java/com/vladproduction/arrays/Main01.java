package com.vladproduction.arrays;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
//        byte [] nums_array;
//        nums_array = new byte[5];
        byte [] nums_array = new byte[7];
        nums_array[0] = 4;
        nums_array[1] = 100;
        nums_array[1] += 10;

        byte [] newarray = Arrays.copyOf(nums_array, nums_array.length);

        String [] names = new String[] {"petr", "frank", "kay"};
        names[0] = "name0";
        System.out.println(names[0]); //name0
        System.out.println(nums_array[1]); //100
        System.out.println(nums_array.length);
        System.out.println("------------------");
        System.out.println(Arrays.toString(nums_array));
        Arrays.sort(newarray);
        System.out.println(Arrays.toString(newarray));


    }
}

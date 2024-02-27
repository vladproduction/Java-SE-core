package com.vladproduction.cycles;

import java.util.ArrayList;

public class Main04_for_arrays {
    public static void main(String[] args) {

        System.out.println("start cycle");
        short [] arr = new short[] {1,2,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("item " + (i + 1) + " = " + arr[i]);
        }
        System.out.println("finish cycle");

        System.out.println("---two dim arr-------");
        int [][] big_num = new int[][]{
                {1,5,6,7},
                {11,22,56,78},
                {123,456,789,879}
        };
        for (int i = 0; i < big_num.length; i++) {
            for (int j = 0; j < big_num[i].length; j++) {
                System.out.print(big_num[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("---------rows in reverse order-----------");
        // Iterate through rows in reverse order
        for (int i = big_num.length - 1; i >= 0; i--) {
            // Iterate through elements in each row in reverse order
            for (int j = big_num[i].length - 1; j >= 0; j--) {
                System.out.print(big_num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------arrays_for--------");
        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");
        for (String item: names){
            System.out.print(item + ", ");
        }

    }
}

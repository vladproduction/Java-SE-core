package com.vladproduction.vp13_multi_arrays;

import java.util.Arrays;

public class Multidimensional_arrays {
    public static void main(String[] args) {

        //simple array
        int[] numbs = {1,2,3};
        System.out.println(numbs[0]);
        System.out.println(numbs[1]);
        System.out.println(numbs[2]);

        System.out.println("------------------------------");
        //multi_dimensional array
        /**
         * 12345
         * 456789 --> '5' [1][1]
         * 789012 --> '9' [2][2]
         * */
        int[][] matrix = {{1,2,3,4,5},{4,5,6,7,8,9},{7,8,9,0,1,2}};
        System.out.println("5? = " + matrix[1][1]);
        System.out.println("9? = " + matrix[2][2]);

        System.out.println("------strings[][]----------------");
        String[][] strings = new String[2][3]; //[columns][rows]
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);
        System.out.println(strings[0][2]); //not init --> 'null'

        //how to iterate multi arrays
        System.out.println("------------iterate multi arrays------------------");
        int[][] matrix2 = {{100,200,300},{400,500,600},{700,800,900}};
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        //how to iterate by revers multi arrays
        System.out.println("-----------iterate by revers multi arrays-------------");

        System.out.println("Scenario 1: Reverse Printing Order");
        for (int i = matrix.length - 1; i >=0; i--) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Scenario 2: Reverse Elements Within Each Row");
        for (int i = 0; i < matrix2.length; i++) {
            //swap elements
            for (int j = 0; j < matrix2[i].length / 2; j++) {
                int temp = matrix2[i][j];
                matrix2[i][j] = matrix2[i][matrix2[i].length - j -1];
                matrix2[i][matrix2[i].length - j -1] = temp;
            }
        }
        //printing the matrix
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------snake pattern---------------");
        /**
         * 300, 200, 100
         * 400, 500, 600
         * 900, 800, 700
         * */
        reverseSnake(matrix2); //modifying matrix2
        //and printing it now to check:
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        //example as line:
        System.out.println("example as line:" + Arrays.deepToString(matrix2));

    }

    public static void reverseSnake(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            // Reverse order for even rows (snake-like pattern)
            if (i % 2 == 1) {
                int left = 0;
                int right = matrix[i].length - 1;
                while (left < right) {
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            }
        }
    }


}

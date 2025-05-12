package com.vladproduction.app31.print_pascals_triangle;

public class PrintPascalsTriangle {
    public static void main(String[] args) {

        int rows = 5;
        printPascalsTriangle(rows);

        /**
         *              1
         *            1   1
         *          1   2   1
         *        1   3   3   1
         *      1   4   6   4   1
         * */

    }

    private static void printPascalsTriangle(int rows) {

        for (int i = 0; i < rows; i++) {
            int num = 1;
            System.out.format("%" + (rows - i) * 2 + "s", "");

            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", num);
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }

    }
}

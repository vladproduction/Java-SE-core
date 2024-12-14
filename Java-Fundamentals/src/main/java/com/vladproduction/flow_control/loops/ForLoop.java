package com.vladproduction.flow_control.loops;

public class ForLoop {
    public static void main(String[] args) {
        int i = 10;
        incrementing(i);

        System.out.println();
        decrementing(i);

        System.out.println();
        incr_decr(i);

        System.out.println();
        incr_continue(i); // 5, 9, 10 will not print

        System.out.println("\n");
        sumOfGivenEachNumber(3); // 1 + 2 + 3 = 6

        int i_99 = 99;
        sumOfGivenEachNumber(i_99);

        int i_100 = 100;
        sumOfGivenEachNumber(i_100);


        int i_101 = 101;
        sumOfGivenEachNumber(i_101);
    }

    protected static int sumOfGivenEachNumber(int givenNumber) {
        int result = 0;
        for(int step = 1; step <= givenNumber; ){
            System.out.print("\tstep = " + step);
            result += step++;
        }
        System.out.println("\n\tresult = (steps taken: " + givenNumber + ") " + result);
        return result;
    }

    private static void incr_continue(int value) {
        for (int i = 0; i < value; i++) {
            if(i == 5){
                continue;
            } else if (i == 9 || i == 10) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    private static void incr_decr(int value) {
        for (int i = 0, j = 0; i < value && j > -value; j--, i++) {
            System.out.println(i + " " + j);
        }
    }

    private static void decrementing(int i) {
        for (int j = 0; j > -i; j--) {
            System.out.print(j + " ");
        }
    }

    private static void incrementing(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(j + " ");
        }
    }
}

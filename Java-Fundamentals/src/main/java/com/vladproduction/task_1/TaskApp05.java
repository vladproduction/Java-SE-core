package com.vladproduction.task_1;

/**
 * 5. Enter a number from 1 to 12.
 * Output the name of the month corresponding to this number to the console.
 * Check the correctness of the number input.
 * */
public class TaskApp05 {
    public static void main(String[] args) {

        String[] months = {"Jan - 1", "Fab - 2", "Mar - 3", "Apr - 4", "May - 5", "Jun - 6", "Jul - 7", "Aug - 8", "Sep - 9", "Oct - 10", "Nov - 11", "Dec - 12"};
        for (String month : months) {
            System.out.print(month + " ");
        }
        System.out.println("\n=========");
        int month = Integer.parseInt(args[0]);
        switch (month){
            case 1 -> System.out.println(months[0]);
            case 2 -> System.out.println(months[1]);
            case 3 -> System.out.println(months[2]);
            case 4 -> System.out.println(months[3]);
            case 5 -> System.out.println(months[4]);
            case 6 -> System.out.println(months[5]);
            case 7 -> System.out.println(months[6]);
            case 8 -> System.out.println(months[7]);
            case 9 -> System.out.println(months[8]);
            case 10 -> System.out.println(months[9]);
            case 11 -> System.out.println(months[10]);
            case 12 -> System.out.println(months[11]);
            default -> throw new IllegalArgumentException("Please provide number in range of 1-12.");
        }



    }
}

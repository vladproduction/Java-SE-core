package com.vladproduction.tasks;

public class TaskIsIntegersSame {
    public static void main(String[] args) {
        Integer y = 125;
        Integer x = y;
        System.out.print((x == y) + "");
        x++;
        y++;
        System.out.print(x == y);
        //truetrue if assign 125 for y (in range)

        System.out.println("\n------");

        Integer y2 = 567;
        Integer x2 = y2;
        System.out.print((x2 == y2) + "");
        x2++;
        y2++;
        System.out.print(x2 == y2);
        //truefalse if assign 567 for y2 (out of range)
    }
}

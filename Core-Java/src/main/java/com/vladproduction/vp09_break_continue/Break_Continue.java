package com.vladproduction.vp09_break_continue;

public class Break_Continue {
    public static void main(String[] args) {

//        infinityLoop();       //non stop
//        whileNumberEqual(15);   //while break
        forNumberEven(15);     //for continue

    }

    protected static void infinityLoop() {
        int i = 0;
        while (true){
            System.out.println(i);
            i++;
        }
    }

    protected static void whileNumberEqual(int number) {
        int i = 1;
        while (true){
            if(i == number){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Loop is finished on position: " + number);
    }

    protected static void forNumberEven(int number) {
        for (int i = 0; i <= number; i++) {
             if(i % 2 == 0){
                 continue;
             }
            System.out.println("Number is not even: " + i);

        }
    }
}

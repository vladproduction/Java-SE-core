package com.vladproduction.flow_control.loops;

public class WhileLoopContinue {
    public static void main(String[] args) {

        whileAndContinue();

        System.out.println();
        whileAndBreak();

    }

    private static void whileAndContinue() {
        int value = 42;
        while(value < 50){
            value++;
            if(value > 44 && value < 48){
                continue;
            }
            System.out.print(value + " ");//43 44 48 49 50
        }
    }

    private static void whileAndBreak() {
        int value = 42;
        while(value < 50){
            value++;
            if(value > 44 && value < 48){
                break;
            }
            System.out.print(value + " ");//43 44
        }
    }
}

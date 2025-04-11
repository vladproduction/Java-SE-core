package com.vladproduction.app03.revert_number;

public class Main {
    public static void main(String[] args) {

        int a = 12034;
        System.out.println("before = " + a);
        int revert = revert(a);
        System.out.println("revert = " + revert);

        int revert2 = revert2(a);
        System.out.println("revert2 = " + revert2);


    }

    private static int revert(int a){
        String s = String.valueOf(a);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    private static int revert2(int a){
        //1234 --> 1*1000 + 2*100 + 3*10 + 4*1
        //1234 --> =4
        //123 --> 4 --> 40 + 3 =43
        //12 --> 43 --> 430 + 2 =432
        //1 --> 432 --> 4320 + 1 =4321
        int result = 0;
        while(a / 10 != 0 || Math.abs(a) < 10){
            result = result * 10;
            int value = a % 10;
            result = result + value;
            a = a / 10;
            if(a == 0){
                break;
            }
        }

        //=4321
        return result;
    }

}

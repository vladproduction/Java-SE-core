package com.vladproduction.exceptions;

public class Main01 {
    public static void main(String[] args) {

        float [] arr = new float[] {5.7f, 6.7f, 7.7f};
//        System.out.println(arr[3]); //ArrayIndexOutOfBoundsException

        try{
            System.out.println(arr[2]);
            int res = 100/1;
            System.out.println(res);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }
        catch (ArithmeticException e){
            System.out.println("Exception: " + e);
        }finally {
            System.out.println("finally is done!");
        }

    }
}

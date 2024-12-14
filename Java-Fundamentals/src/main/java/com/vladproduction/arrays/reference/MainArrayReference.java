package com.vladproduction.arrays.reference;

public class MainArrayReference {
    public static void main(String[] args) {
        int [] arr = {2, 10};
        Object object = arr;
        int x = ((int[]) object)[0];
        System.out.println("x = " + x); // 2

        //same for multi-dim-array
        int [][] multi = {{10, 20}, {1, 2, 3}};
        object = multi; //all array refer
        object = multi[0]; //part of multi assign

        //we can not convert array of one type into another type array;
    }
}

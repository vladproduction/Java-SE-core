package com.vladproduction.narrowing_drive_casting_primitives;

public class DataLossMayHappen {
    public static void main(String[] args) {
        int valueInt = 34567;
        short valueShort = (short) valueInt;
        System.out.println(valueInt + " -> " + valueShort);
    }
}

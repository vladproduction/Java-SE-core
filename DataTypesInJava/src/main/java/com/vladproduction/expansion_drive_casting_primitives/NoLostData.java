package com.vladproduction.expansion_drive_casting_primitives;

public class NoLostData {
    public static void main(String[] args) {
        byte b = 7;
        int y = b;
        System.out.println(y);//the value of a byte type variable (with a memory size of 1 byte) is expanded to an int type (with a size of 4 bytes).
    }
}

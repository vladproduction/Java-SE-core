package com.vladproduction.arrays.resizing_copying;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {

        //two arrays (one is srcArr for copying and second is defined as destArr - holder data)
        int[] srcArr = {1, 2, 3, 4, 5};
        int[] destArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.arraycopy(srcArr, 0, destArr, 0, srcArr.length);
        System.out.println(Arrays.toString(destArr));//[1, 2, 3, 4, 5, 60, 70, 80, 90, 100]



    }
}

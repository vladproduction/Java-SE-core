package com.vladproduction.app18.merge;

public class MergeArraysExample {
    public static void main(String[] args) {

        int[]  arr1 = {1,5,10,15,17,20,21};
        int[]  arr2 = {2,4,7,8,11,12};
        //1 2 4 5 7 8 10 11 12 15 17 20 21
        int[]  result = mergeArrays2(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

    }

    private static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;

        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] < arr2[index2]){
                result[index] = arr1[index1];
                index1++;
            } else {
                result[index] = arr2[index2];
                index2++;
            }
            index++;
        }
        System.arraycopy(arr1, index1, result, index, arr1.length - index1);
        System.arraycopy(arr2, index2, result, index, arr2.length - index2);

        return result;
    }

    private static int[] mergeArrays2(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;

        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] < arr2[index2]){
                result[index] = arr1[index1];
                index1++;
            } else {
                result[index] = arr2[index2];
                index2++;
            }
            index++;
        }
        if(index1 < arr1.length){
            for (int i = index1; i < arr1.length; i++) {
                result[index] = arr1[i];
                index++;
            }
        }
        if(index2 < arr2.length){
            for (int i = index2; i < arr2.length; i++) {
                result[index] = arr2[i];
                index++;
            }
        }

        return result;
    }


}











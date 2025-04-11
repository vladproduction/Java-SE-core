package com.vladproduction.app16.search_in_array;

public class BinarySearch {
    public static void main(String[] args) {

        //assume we have sorted arr:
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        //must be searched before searching
        int searched5 = search(arr, 5);
        System.out.println("searched5 = " + searched5);

        //[1 index]
        int searched1 = search(arr, 1);
        System.out.println("searched1 = " + searched1);

        //[9 index]
        int searched9 = search(arr, 9);
        System.out.println("searched9 = " + searched9);
    }

    private static int search(int[] arr, int target) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            if(target == arr[midIndex]){
                return midIndex; //were done
            }
            if(arr[midIndex] > target){
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }
        }

        return -1;
    }

}

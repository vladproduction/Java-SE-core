package com.vladproduction.app07.find_max_min_in_array;

public class Main {
    public static void main(String[] args) {
        int [] array = {100,2,3,4,5,6,70,8,9,10};

        int maxElement1 = findMaxElement1(array);
        System.out.println("maxElement1 = " + maxElement1);

        int maxElement2 = findMaxElement2(array);
        System.out.println("maxElement2 = " + maxElement2);

        int maxElement3 = findMaxElement3(array);
        System.out.println("maxElement3 = " + maxElement3);

    }

    // version #1
    private static int findMaxElement1(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }

        return result;
    }

    // version #2
    private static int findMaxElement2(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    private static int findMaxElement3(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

}














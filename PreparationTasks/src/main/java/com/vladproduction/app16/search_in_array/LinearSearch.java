package com.vladproduction.app16.search_in_array;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10,2,9,5,111,5,-6,0,7};

        //[3]
        int searched3 = search(arr, 5); //find first
        System.out.println("searched3 = " + searched3);

        //[0]
        int searched0 = search(arr, 10);
        System.out.println("searched0 = " + searched0);

        //[last]
        int searchedLast = search(arr, 7);
        System.out.println("searchedLast = " + searchedLast);

        //[non]
        int searchedNotExist = search(arr, 5000);
        System.out.println("searchedNotExist = " + searchedNotExist);

    }

    //what index target is stand on?
    //O(n)
    //best: O(1) if first element match
    private static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i; //we are done here
            }
        }
        return -1; //not found current target
    }

}

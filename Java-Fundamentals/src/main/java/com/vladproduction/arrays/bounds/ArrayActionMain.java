package com.vladproduction.arrays.bounds;

public class ArrayActionMain {

    static class ArrayAction {
        public void changeArray(int [] arr, int val){
            for (int i = 0; i < arr.length; i++) {
                arr[i] += val;
            }
        }
    }
    public static void main(String[] args) {
        ArrayAction arrayAction = new ArrayAction();
        int [] a = {10, 20, 30, 40, 50};
        arrayAction.changeArray(a, 7);

        //try to modify arr by for-each loop (+1 to each element)
        for (int i : a) {
            i += 1; // this does not modify the original array
        }
        //nothing change in final result (still: 17 27 37 47 57);
        // The for-each loop cannot modify the original array.
        // 'i' is a copy of each array element, so changing 'i' does not change 'a'.

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); //17 27 37 47 57
        }
        System.out.println();
    }
}

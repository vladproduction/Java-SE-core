package com.vladproduction.vp11_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCases {
    public static void main(String[] args) {

        summingArray();
        maxValueArray();
        reversingArray();
        table_Pythagoras();
        input_and_valid();

    }

    //find sum
    private static void summingArray() {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {1000000000,1,1,1,1,1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("summingArray() RESULT = " + sum);
    }

    //find max
    private static void maxValueArray(){
        int[] values = {1,22,54,-9,10,45,89,200};
        int max = values[0]; //assuming first element is the max init
        int i = 1;
        while (i < values.length) {
            if(values[i] > max){
                max = values[i];
            }
            i++;
        }
        System.out.println("Max value from values " + Arrays.toString(values) + " = " + max);
    }

    //reversing array
    private static void reversingArray(){
        int[] elements = {4,8,45,500,2};
        for (int i = 0; i < elements.length / 2; i++) {
            int temporary = elements[i];
            elements[i] = elements[elements.length - i - 1];
            elements[elements.length - i - 1] = temporary;
        }
        System.out.println("Reversed array: " + Arrays.toString(elements));
    }

    //nested multiplication table:
    protected static void table_Pythagoras(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    //do-while Loop for Array Input and Validation:
    private static void input_and_valid() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        int input;
        do {
            System.out.print("Enter a number (or 0 to stop): ");
            input = scanner.nextInt();
            if (input != 0) {
                numbers[count++] = input;
            }
        } while (count < 5 && input != 0);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();
    }
}

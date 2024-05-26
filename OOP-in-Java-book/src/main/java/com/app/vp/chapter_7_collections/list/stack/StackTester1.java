package com.app.vp.chapter_7_collections.list.stack;

import java.util.Stack;

public class StackTester1 {
    public static void main(String[] args) {

        int n = 50;
        Stack stack = new Stack();
        while (n > 0){                      //while loop iterates as long as n is greater than 0
            //The remainder (n % 2) is calculated and pushed onto the stack using stack.push(n % 2).
            // This operation extracts the least significant bit (LSB) of n, which is either 0 or 1,
            // representing the binary equivalent's rightmost digit.
            stack.push(n % 2);
            //The value of n is then divided by 2 using integer division (n /= 2).
            // This effectively removes the LSB from n, essentially performing a right shift operation
            // to prepare for the next iteration.
            n /= 2;
        }
        while (!stack.isEmpty()){  //while loop continues as long as the stack is not empty
            //The element at the top of the stack is popped using stack.pop().
            // This retrieves the binary digit that was pushed earlier.
            System.out.print(stack.pop());
            //The popped element (binary digit) is printed to the console using System.out.print().
            // Since elements are popped in the order they were pushed (LIFO - Last-In-First-Out),
            // the digits are printed in the correct order from least to most significant bit.
        }
        System.out.println();

    }
}

/**
 * Why the Output is 110010:
 *
 * The code essentially performs a binary conversion of the decimal number 50 using a stack.
 * Here's a step-by-step explanation:
 *
 * Initial value: n = 50 (binary equivalent unknown yet).
 * Iteration 1:
 * n % 2 = 0 (LSB is 0, pushed onto the stack).
 * n /= 2 (n becomes 25).
 * Iteration 2:
 * n % 2 = 1 (LSB is 1, pushed onto the stack).
 * n /= 2 (n becomes 12).
 * Iteration 3:
 * n % 2 = 0 (LSB is 0, pushed onto the stack).
 * n /= 2 (n becomes 6).
 * Iteration 4:
 * n % 2 = 1 (LSB is 1, pushed onto the stack).
 * n /= 2 (n becomes 3).
 * Iteration 5:
 * n % 2 = 1 (LSB is 1, pushed onto the stack).
 * n /= 2 (n becomes 1).
 * Iteration 6:
 * n % 2 = 1 (LSB is 1, pushed onto the stack).
 * n /= 2 (n becomes 0, loop terminates).
 * The stack now contains the binary digits in LIFO order: 1 -> 1 -> 0 -> 1 -> 0 -> 0.
 *
 * During the output loop, elements are popped from the stack, printing the binary digits in the correct order
 * from least to most significant bit: 110010.
 * */

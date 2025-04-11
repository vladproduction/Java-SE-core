package com.vladproduction.datatypes_variables_operators;

public class OperationsDemo {
    public static void main(String[] args) {

        //Math:
        /*+(Addition)
        - (Subtraction)
        * (Multiplication)
        / (Division)
         % (Modulus)*/
        int sum = 5 + 3; // sum is 8
        int remainder = 10 % 3; // remainder is 1
        System.out.println("Sum is: " + sum);
        System.out.println("Remainder is: " + remainder);

        /*Relational Operators:
        == (Equal to)
        != (Not equal to)
        > (Greater than)
        < (Less than)
        >= (Greater than or equal to)
        <= (Less than or equal to)*/
        boolean isEqual = (5 == 3); // isEqual is false
        boolean isGreater = (10 > 5); // isGreater is true

        /*Logical Operators:
        && (Logical AND)
        || (Logical OR)
        ! (Logical NOT)*/
        boolean result = (5 > 3) && (10 < 20); // result is true
        boolean result2 = (5 > 3) || (10 > 20); // result2 is true
        boolean result3 = !(5 > 3); // result3 is false
        boolean result4 = !(5 < 3); // result3 is true

        /*Assignment Operators:
        = (Assignment)
        += (Add and assign)
        -= (Subtract and assign)
        *= (Multiply and assign)
        /= (Divide and assign)
        %= (Modulus and assign)*/
        int x = 10;
        x += 5; // x is now 15
        x -= 3; // x is now 12

        /*Increment and Decrement Operators:
        ++ (Increment)
        -- (Decrement)*/
        int a = 5;
        a++; // a is now 6
        int b = 10;
        b--; // b is now 9



    }
}

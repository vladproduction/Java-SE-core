package com.vladproduction;

/*
 * Author:          Ima Java Programmer
 * Course:          COP3503
 * Project #:       1
 * Title:           Project4
 * Due Date:        1/1/2012
 *
 * Description: Programming Java Application using Scanner Class*/                      //Project Comment

import java.util.Scanner;

/**
 * Description of the class purpose.
 * For projects with only one class, the description from the
 * project comment can be copied for the class comment.
 * Calculates the area of a rectangle.                                                  //Class Comment
 * */
public class HowToCommentProject {
    public static void main(String[] args) {
        //  Variable declaration
        Scanner scanner = new Scanner(System.in);
        int length, width, area;

        // Should only be used when the purpose of a line of code
        // may not be obvious to another programmer.
        // As a general rule, less than 10% of a program’s
        // code should require statement comments
        //Get user input
        System.out.println("Enter the length of rectangle:");
        length = scanner.nextInt(); //Get inputs from the keyboard                       //Statements Comment
        //Get user input
        System.out.println("Enter the width of rectangle:");
        width = scanner.nextInt();

        //Perform the calculation
        area = calculateArea(length, width);

        //Each logical section of  code, and should be in the Line style.
        // The comments should describe the purpose of their
        // respective section of code.
        //Display result to the user                                                      //Section Comment
        System.out.println("\nThe perimeter is: " + area);

    }

    /** description of the method’s purpose, a description of
     * each input parameter, as well as a description of
     * what the method returns, if appropriate*/
    /**
     * Calculates the area of a rectangle.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     * @return The area of the rectangle.
     * */                                                                                  //Method Comments
    private static int calculateArea(int length, int width){
        int area = length * width;

        return area;
    }
}

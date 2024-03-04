package com.vladproduction.vp06_if;

public class GradeCalculator {
    public static void main(String[] args) {

        int marks = 85;
        grades(marks);

    }

    public static void grades(int marks){
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D or F");
        }
    }

}

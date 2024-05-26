package com.app.vp.chapter_7_collections.algorithms.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_max_min {
    public static void main(String[] args) {

        // Example 1: Using Integer array
        Integer[] numbers = {5, 10, 2, 8, 1};

        int maxNumber = Collections.max(Arrays.asList(numbers)); // Convert to List for sorting
        int minNumber = Collections.min(Arrays.asList(numbers));

        System.out.println("Original numbers: " + Arrays.toString(numbers));
        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Minimum number: " + minNumber);

        // Example 2: Using Student objects (assuming natural ordering by score)
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Alice", 90);
        Student student2 = new Student("Bob", 85);
        Student student3 = new Student("Charlie", 95);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Student topStudent = Collections.max(students);// Assuming natural ordering by score
        Student lowestStudent = Collections.min(students);

        System.out.println("\nStudent list:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getScore());
        }

        System.out.println("\nTop student (assuming natural ordering by score): " +
                topStudent.getName() + " (" + topStudent.getScore() + ")");

        System.out.println("Lowest student (assuming natural ordering by score): " +
                lowestStudent.getName() + " (" + lowestStudent.getScore() + ")");

    }
}

package com.vladproduction.aggregation;

public class AggregationDemo {
    public static void main(String[] args) {

        // Create independent objects
        Student student1 = new Student(1001, "Alice Brown", 20);
        Student student2 = new Student(1002, "Bob Johnson", 22);
        Student student3 = new Student(1003, "Charlie Davis", 21);
        Student student4 = new Student(1004, "Diana Smith", 19);

        Professor prof1 = new Professor(101, "Dr. Smith", "Algorithms");
        Professor prof2 = new Professor(102, "Dr. Jones", "Machine Learning");
        Professor prof3 = new Professor(103, "Dr. Wilson", "Database Systems");
        Professor prof4 = new Professor(104, "Dr. Taylor", "Software Engineering");

        // Create aggregating objects
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Set up Computer Science department
        csDepartment.setChairperson(prof1);
        csDepartment.addProfessor(prof1);
        csDepartment.addProfessor(prof2);
        csDepartment.addStudent(student1);
        csDepartment.addStudent(student2);

        // Set up Mathematics department
        mathDepartment.setChairperson(prof3);
        mathDepartment.addProfessor(prof3);
        mathDepartment.addProfessor(prof4);
        mathDepartment.addStudent(student3);
        mathDepartment.addStudent(student4);

        // Create University
        University myUniversity = new University("Tech");
        myUniversity.addDepartment(csDepartment);
        myUniversity.addDepartment(mathDepartment);

        // Display information
        csDepartment.listAllMembers();
        mathDepartment.listAllMembers();
        myUniversity.universityInfo();

        System.out.println("\n--- Demonstrating Independence ---");

        // Student can exist independently of Department
        mathDepartment.removeStudent(student3);
        System.out.println("Student " + student3.getName() + " has been removed from " +
                mathDepartment.getName() + " department");
        student3.study(); // Student can still perform actions

        // Professor can exist independently of Department
        csDepartment.removeProfessor(prof2);
        System.out.println("Professor " + prof2.getName() + " has been removed from " +
                csDepartment.getName() + " department");
        prof2.teach(); // Professor can still perform actions

        // Show updated department
        csDepartment.departmentInfo();

        // Key point of aggregation: Objects can exist independently

    }
}

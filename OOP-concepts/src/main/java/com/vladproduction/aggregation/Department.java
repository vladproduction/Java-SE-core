package com.vladproduction.aggregation;

import java.util.ArrayList;
import java.util.List;

//Aggregating class
public class Department {

    private String name;
    private Professor chairperson; // One chairperson
    private List<Professor> professors; // Many professors
    private List<Student> students; // Many students

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Aggregation: Department has Professors and Students
    // but Professors and Students can exist independently

    public void setChairperson(Professor professor) {
        this.chairperson = professor;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void removeProfessor(Professor professor) {
        professors.remove(professor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void departmentInfo() {
        System.out.println("Department: " + name);
        System.out.println("Chairperson: " + (chairperson != null ? chairperson.getName() : "None"));
        System.out.println("Number of professors: " + professors.size());
        System.out.println("Number of students: " + students.size());
    }

    public void listAllMembers() {
        System.out.println("\n--- Department of " + name + " ---");

        if (chairperson != null) {
            System.out.println("Chairperson: " + chairperson);
        }

        System.out.println("\nProfessors:");
        for (Professor prof : professors) {
            System.out.println("- " + prof);
        }

        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println("- " + student);
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public Professor getChairperson() {
        return chairperson;
    }

    public List<Professor> getProfessors() {
        return new ArrayList<>(professors);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

}

package com.vladproduction.aggregation;

import java.util.ArrayList;
import java.util.List;

//Another aggregating class
public class University {

    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Aggregation: University has Departments
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void universityInfo() {
        System.out.println("\n=== " + name + " University ===");
        System.out.println("Number of departments: " + departments.size());

        for (Department dept : departments) {
            System.out.println("\nDepartment: " + dept.getName());
            System.out.println("Chairperson: " +
                    (dept.getChairperson() != null ? dept.getChairperson().getName() : "None"));
            System.out.println("Professors: " + dept.getProfessors().size());
            System.out.println("Students: " + dept.getStudents().size());
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments);
    }

}

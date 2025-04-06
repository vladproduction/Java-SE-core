package com.vladproduction.association;

import java.util.ArrayList;
import java.util.List;

// One-to-Many Association
public class Teacher {

    private String name;
    private List<Course> courses; // One-to-Many: A Teacher teaches many Courses

    public Teacher(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher: " + name;
    }

}

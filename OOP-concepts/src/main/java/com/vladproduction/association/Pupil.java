package com.vladproduction.association;

import java.util.ArrayList;
import java.util.List;

// Many-to-Many Association
public class Pupil {

    private String name;
    private List<Course> enrolledCourses; // Many-to-Many: A Pupil takes many Courses

    public Pupil(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollPupil(this);
    }

    public List<Course> getEnrolledCourses() {
        return new ArrayList<>(enrolledCourses);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pupil: " + name;
    }

}

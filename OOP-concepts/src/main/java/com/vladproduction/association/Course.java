package com.vladproduction.association;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private Teacher instructor; // Many-to-One: Many Courses have one Teacher
    private List<Pupil> pupils; // Many-to-Many: Course has many Pupils

    public Course(String courseName) {
        this.courseName = courseName;
        this.pupils = new ArrayList<>();
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void enrollPupil(Pupil pupil) {
        pupils.add(pupil);
    }

    public List<Pupil> getEnrolledPupils() {
        return new ArrayList<>(pupils);
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course: " + courseName;
    }

}

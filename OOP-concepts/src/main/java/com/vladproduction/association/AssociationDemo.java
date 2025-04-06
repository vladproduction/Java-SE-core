package com.vladproduction.association;

public class AssociationDemo {
    public static void main(String[] args) {

        System.out.println("===== One-to-One Association Example =====");
        // Create Person and Passport
        Person john = new Person("John Smith");
        Passport johnPassport = new Passport("US123456");

        // Establish bidirectional one-to-one association
        john.setPassport(johnPassport);
        johnPassport.setOwner(john);

        // Access associated objects
        System.out.println(john + " has " + john.getPassport());
        System.out.println(johnPassport + " belongs to " + johnPassport.getOwner());

        System.out.println("\n===== One-to-Many Association Example =====");
        // Create Teacher and Courses
        Teacher mrJones = new Teacher("Mr. Jones");
        Course java = new Course("Java Programming");
        Course python = new Course("Python Programming");
        Course algorithms = new Course("Algorithms");

        // Establish one-to-many association
        java.setInstructor(mrJones);
        python.setInstructor(mrJones);
        algorithms.setInstructor(mrJones);

        mrJones.addCourse(java);
        mrJones.addCourse(python);
        mrJones.addCourse(algorithms);

        // Access associated objects
        System.out.println(mrJones + " teaches:");
        for (Course course : mrJones.getCourses()) {
            System.out.println("- " + course);
        }

        System.out.println("\nInstructor for " + java + " is " + java.getInstructor());
        System.out.println("Instructor for " + python + " is " + python.getInstructor());
        System.out.println("Instructor for " + algorithms + " is " + algorithms.getInstructor());

        System.out.println("\n===== Many-to-Many Association Example =====");
        // Create Pupils
        Pupil alice = new Pupil("Alice");
        Pupil bob = new Pupil("Bob");
        Pupil charlie = new Pupil("Charlie");

        // Establish many-to-many association
        alice.enrollInCourse(java);
        alice.enrollInCourse(algorithms);

        bob.enrollInCourse(java);
        bob.enrollInCourse(python);

        charlie.enrollInCourse(python);
        charlie.enrollInCourse(algorithms);

        // Access associated objects - Pupils to Courses
        System.out.println("\nCourses by Pupil:");
        displayPupilCourses(alice);
        displayPupilCourses(bob);
        displayPupilCourses(charlie);

        // Access associated objects - Courses to Pupils
        System.out.println("\nPupils by Course:");
        displayCourseEnrollment(java);
        displayCourseEnrollment(python);
        displayCourseEnrollment(algorithms);
    }

    private static void displayPupilCourses(Pupil pupil) {
        System.out.println(pupil + " is enrolled in:");
        for (Course course : pupil.getEnrolledCourses()) {
            System.out.println("- " + course);
        }
    }

    private static void displayCourseEnrollment(Course course) {
        System.out.println(course + " has these pupils:");
        for (Pupil pupil : course.getEnrolledPupils()) {
            System.out.println("- " + pupil);
        }
    }


}

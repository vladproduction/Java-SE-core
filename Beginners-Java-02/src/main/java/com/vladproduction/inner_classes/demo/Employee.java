package com.vladproduction.inner_classes.demo;

public class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // This method uses an inner class
    public String getJobDescription() {
        JobDescription jobDescription = new JobDescription(); // Create instance of inner class
        return jobDescription.getDescription();
    }

    // Inner class: JobDescription
    private class JobDescription {
        private String description;

        public JobDescription() {
            // Access outer class members directly
            this.description = "The " + department + " department is responsible for " + getResponsibilities(); 
        }

        private String getResponsibilities() { // Private method within the inner class
            return "specific tasks related to " + department;
        }

        public String getDescription() {
            return description;
        }
    }
}

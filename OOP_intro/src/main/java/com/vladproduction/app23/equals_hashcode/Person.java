package com.vladproduction.app23.equals_hashcode;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;

    public Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        // 1. Check if same object reference
        if (this == o) return true;

        // 2. Check if null or different class
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Cast to the same class
        Person person = (Person) o;

        // 4. Compare significant fields
        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        return email != null ? email.equals(person.email) : person.email == null;
    }

    @Override
    public int hashCode() {
        // Use a prime number (31 is common) to combine hash codes
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

}

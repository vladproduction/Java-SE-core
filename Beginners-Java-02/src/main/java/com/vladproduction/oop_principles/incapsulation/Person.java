package com.vladproduction.oop_principles.incapsulation;

public class Person {
  private String name;
  private int age;

  // Public setter method for name
  public void setName(String name) {
    this.name = name;
  }

  // Public getter method for name
  public String getName() {
    return name;
  }

  // Public setter method for age (optional for age validation)
  public void setAge(int age) {
    // Check for valid age range (optional)
    if (age >= 0) {
      this.age = age;
    } else {
      System.out.println("Age cannot be negative. Setting age to 0.");
      this.age = 0;
    }
  }

  // Public getter method for age
  public int getAge() {
    return age;
  }

//  the setAge() method is also public but includes a check to ensure the age is non-negative before setting it.
//  This demonstrates how setter methods can be used to control data validation and manipulation,
//  even if the field itself is private

//  By using encapsulation, we control how the internal state of the object is accessed and modified,
//  making the code more secure and maintainabl
}

package com.vladproduction.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {

        // Create instances of different employee types
        Employee generalEmployee = new Employee("Alice", 1001, 50000);
        Manager manager = new Manager("Bob", 2001, 70000, 10000, 5);
        Developer developer = new Developer("Charlie", 3001, 60000, "Java", 50);

        // Call methods on base class
        generalEmployee.work();
        System.out.println(generalEmployee.getName() + "'s salary: $" + generalEmployee.calculateSalary());

        // Call methods on derived classes
        manager.work();
        manager.conductMeeting();
        System.out.println(manager.getName() + "'s salary: $" + manager.calculateSalary());

        developer.work();
        developer.code();
        developer.logOvertime(10);
        System.out.println(developer.getName() + "'s salary: $" + developer.calculateSalary());

        // Polymorphism through inheritance
        System.out.println("\nDemonstrating polymorphism:");
        Employee[] employees = {generalEmployee, manager, developer};
        for (Employee emp : employees) {
            emp.work(); // Different implementation based on actual object type
        }

    }
}

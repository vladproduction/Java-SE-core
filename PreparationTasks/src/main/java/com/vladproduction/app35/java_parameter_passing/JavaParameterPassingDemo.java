package com.vladproduction.app35.java_parameter_passing;

public class JavaParameterPassingDemo {

    public static void main(String[] args) {
        System.out.println("====== PRIMITIVE TYPES EXAMPLES ======");
        primitiveExamples();

        System.out.println("\n====== OBJECT REFERENCES EXAMPLES ======");
        objectReferenceExamples();

        System.out.println("\n====== STRING EXAMPLES ======");
        stringExamples();

        System.out.println("\n====== ARRAY EXAMPLES ======");
        arrayExamples();

        System.out.println("\n====== COLLECTION EXAMPLES ======");
        collectionExamples();
    }

    private static void primitiveExamples() {
        // Example 1: Basic primitive passing
        int number = 10;
        System.out.println("Before modifyValue: number = " + number);
        modifyValue(number);
        System.out.println("After modifyValue: number = " + number);  // Still 10

        // Example 2: Getting a new value by return
        int result = multiplyValue(number);
        System.out.println("Result from multiplyValue: " + result);  // 100
    }

    private static void modifyValue(int value) {
        // This modification only affects the local copy
        value = value * 5;
        System.out.println("Inside modifyValue: value = " + value);  // 50
    }

    private static int multiplyValue(int value) {
        return value * 10;
    }

    private static void objectReferenceExamples() {
        // Example 1: Modifying object state
        Person person = new Person("Alice", 30);
        System.out.println("Before modifyPersonAge: " + person);
        modifyPersonAge(person);
        System.out.println("After modifyPersonAge: " + person);  // Age changed to 31

        // Example 2: Reassigning the reference
        System.out.println("Before replaceWithNewPerson: " + person);
        replaceWithNewPerson(person);
        System.out.println("After replaceWithNewPerson: " + person);  // Still Alice, 31

        // Example 3: Demonstrating reference copy
        Car car = new Car("Toyota", "Camry");
        System.out.println("\nBefore modifyCar: " + car);
        System.out.println("car hashCode: " + System.identityHashCode(car));
        modifyCar(car);
        System.out.println("After modifyCar: " + car);  // Model changed to "Corolla"
    }

    private static void modifyPersonAge(Person p) {
        // This modifies the object that p references
        p.setAge(p.getAge() + 1);
        System.out.println("Inside modifyPersonAge: " + p);  // Age is 31
    }

    private static void replaceWithNewPerson(Person p) {
        // This replaces only the local reference
        p = new Person("Bob", 25);
        System.out.println("Inside replaceWithNewPerson: " + p);  // Bob, 25
    }

    private static void modifyCar(Car c) {
        System.out.println("Inside modifyCar - received car hashCode: " + System.identityHashCode(c));
        c.setModel("Corolla");  // Modifies the original object
    }

    private static void stringExamples() {
        // Example with String (immutable)
        String name = "John";
        System.out.println("Before modifyString: name = " + name);
        modifyString(name);
        System.out.println("After modifyString: name = " + name);  // Still "John"
    }

    private static void modifyString(String s) {
        // Strings are immutable, so this creates a new String object
        s = s + " Doe";
        System.out.println("Inside modifyString: s = " + s);  // "John Doe"
    }

    private static void arrayExamples() {
        // Example 1: Modifying array contents
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before modifyArray - numbers[0]: " + numbers[0]);
        modifyArray(numbers);
        System.out.println("After modifyArray - numbers[0]: " + numbers[0]);  // Changed to 99

        // Example 2: Replacing the array reference
        System.out.println("\nBefore replaceArray: " + java.util.Arrays.toString(numbers));
        replaceArray(numbers);
        System.out.println("After replaceArray: " + java.util.Arrays.toString(numbers));  // Still [99, 2, 3, 4, 5]
    }

    private static void modifyArray(int[] arr) {
        // This modifies the contents of the original array
        arr[0] = 99;
        System.out.println("Inside modifyArray - arr[0]: " + arr[0]);  // 99
    }

    private static void replaceArray(int[] arr) {
        // This replaces only the local reference
        arr = new int[]{10, 20, 30};
        System.out.println("Inside replaceArray: " + java.util.Arrays.toString(arr));  // [10, 20, 30]
    }

    private static void collectionExamples() {
        // Example with ArrayList
        java.util.List<String> fruits = new java.util.ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("Before modifyList: " + fruits);
        modifyList(fruits);
        System.out.println("After modifyList: " + fruits);  // Contains "Orange"

        System.out.println("\nBefore replaceList: " + fruits);
        replaceList(fruits);
        System.out.println("After replaceList: " + fruits);  // Still contains original items + "Orange"
    }

    private static void modifyList(java.util.List<String> list) {
        // This modifies the contents of the original list
        list.add("Orange");
        System.out.println("Inside modifyList: " + list);
    }

    private static void replaceList(java.util.List<String> list) {
        // This replaces only the local reference
        list = new java.util.ArrayList<>();
        list.add("Grape");
        list.add("Melon");
        System.out.println("Inside replaceList: " + list);  // [Grape, Melon]
    }

    // Model classes
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    static class Car {
        private String make;
        private String model;

        public Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public String getMake() { return make; }
        public void setMake(String make) { this.make = make; }
        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }

        @Override
        public String toString() {
            return "Car{make='" + make + "', model='" + model + "'}";
        }
    }

}

package com.vladproduction.referal_data_types;

public class JavaDataTypesReference {
    public static void main(String[] args) {

        System.out.println("Java data types");
        System.out.println();
        System.out.println("\tJava data types reference:");

        Dog thisDog = new Dog("Sparky", 2);
        Dog thatDog = thisDog;
        System.out.println("thisDog = " + thisDog.getName() +": " + thisDog.getAge());
        System.out.println("thatDog = " + thatDog.getName() +": " + thatDog.getAge());
        System.out.println("after setting new name, age for thatDog");
        thatDog.setName("Wolfy");
        thatDog.setAge(1);
        System.out.println();
        System.out.println("thisDog = " + thisDog.getName() +": " + thisDog.getAge());
        System.out.println("thatDog = " + thatDog.getName() +": " + thatDog.getAge());

        /*  thisDog = Wolfy: 1
            thatDog = Wolfy: 1
            both has the same, - same reference to the memory*/
        System.out.println("thisDog = " + thisDog.hashCode());
        System.out.println("thatDog = " + thatDog.hashCode());
        /*thisDog = 81628611
        thatDog = 81628611  same hashCode*/


    }
    static class Dog{
        String name;
        int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

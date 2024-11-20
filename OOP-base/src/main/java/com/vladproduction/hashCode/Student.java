package com.vladproduction.hashCode;

public class Student {

    private String name;
    private long phone;
    private int age;

    public Student(String name, long phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) (phone ^(phone >>> 32));
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] arg) {
        Student stud1 = new Student("Peter", 5558956L, 20);
        Student stud2 = new Student("Ivan", 9876543L, 18);//objects are same - hashes is equivalent
        Student stud3 = new Student("Dasha", 5558956L, 20);
        Student stud4 = new Student("Ivan", 9876543L, 18);//objects are same - hashes is equivalent
        System.out.println(stud1.hashCode());
        System.out.println(stud2.hashCode());
        System.out.println(stud3.hashCode());
        System.out.println(stud4.hashCode());

        //output:
        /*      1160475683
                -1786389060    //--> objects are same - hashes is equivalent
                -1015000986
                -1786389060*/  //--> objects are same - hashes is equivalent
    }

}

package com.vladproduction.vp21_static;

public class People {
    public static void main(String[] args) {
        Model model1 = new Model("John", 26);
        Model model2 = new Model("Jack", 28);
        Model.printNumberOfPeoples();
        Model model3 = new Model("Jim", 27);
        Model model4 = new Model("Jue", 24);
        Model model5 = new Model("Judd", 38);
        Model.printNumberOfPeoples();

    }

}

class Model{
    private String name;
    private int age;
    private static int countPeople;

    public Model(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
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

    public static void printNumberOfPeoples(){
        System.out.println("Number of peoples: " + countPeople);
    }
}

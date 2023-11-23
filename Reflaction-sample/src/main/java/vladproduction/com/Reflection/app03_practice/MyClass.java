package Reflection.app03_practice;

public class MyClass {
    private int number;
    private String name = "default_name";

    public MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public MyClass() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //getName does not create

    public void setName(String name) {
        this.name = name;
    }

    private void printData(){
        System.out.println(number+name);
    }
}

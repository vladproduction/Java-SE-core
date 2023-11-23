package Finalize.ch01;

public class Main02 {

    public static void main(String[] args) {
        Person p = new Person();
        p = new Person();
        System.gc();
    }

}

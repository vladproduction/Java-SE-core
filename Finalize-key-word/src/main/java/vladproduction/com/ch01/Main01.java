package Finalize.ch01;

public class Main01 {

    public static void main(String[] args) {
        Person p = new Person();
        p = null;
        System.gc();

        System.out.println("---------------");
        p = new Person();
        System.gc();
    }

}

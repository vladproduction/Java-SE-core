package vladproduction.com.ch03;

import java.util.ArrayList;
import java.util.List;

public class Engine_Process {
    public static void main(String[] args) {
        Book book1 = new Book("Java for Kids", "Yakov F.");
        Book book2 = new Book("Java. The Complete Reference, 12th edition", "Schildt H.");
        Book book3 = new Book("Introduction to Programming in Java, 2nd edition - 2017", "Sedgewick R., Wayne K.");
        book1.Print();
        book2.Print();
        book3.Print();
        System.out.println("-----------------");


    /*Класс Book и класс Journal связаны тем, что они реализуют интерфейс Printable. Поэтому мы динамически в
    программе можем создавать объекты Printable как экземпляры обоих классов*/
        Printable book_1 = new Book("CS. Java, OOP, algorithms and data structure","Sedgewick R., Wayne K.");
        book_1.Print();
        Printable journal = new Journal("Computer Science");
        journal.Print();
        System.out.println("-----------------");
        Printable.read(); //static method
        System.out.println("-----------------");



    }


    public interface Printable {
        void Print();
        static void read(){
            System.out.println("static method read()");
        }
    }

    static class Book implements Printable{
        String name;
        String author;

        Book(String name, String author){
            this.name = name;
            this.author = author;
        }

        @Override
        public void Print() {
            System.out.printf("%s (%s) \n",name, author);
        }
    }

    static class Journal implements Printable{
        private String name;
        String getName(){
            return name;
        }

        public Journal(String name) {
            this.name = name;
        }

        @Override
        public void Print() {
            System.out.println(name);
        }
    }
}

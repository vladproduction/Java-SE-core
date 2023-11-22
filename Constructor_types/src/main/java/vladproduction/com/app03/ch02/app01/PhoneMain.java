package Constructor_examples.ch02.app01;

import Constructor_examples.ch02.app02.Phone;

//demonstration connection packages (app01 and app02)
//kinds of constructors: how we can create an instance and print inform()
//1)Phone()-default constructor
//2)Phone(String phoneModel)
//3)Phone(int phonePrice)
//4)Phone(String phoneModel, String phoneColor, int phonePrice)
public class PhoneMain {
    public static void main(String[] args) {

        Phone nokia1 = new Phone();
        nokia1.model = "nokia 3200";
        nokia1.price = 125;
        nokia1.color = "black";
        nokia1.inform();
        System.out.println("---------------------------------------");
        System.out.println();

        Phone nokia2 = new Phone("Nokia 6400");
        nokia2.price = 210;
        nokia2.color = "green";
        nokia2.inform();
        System.out.println("---------------------------------------");
        System.out.println();

        Phone nokia3 = new Phone(210);
        nokia3.model = "Nokia 6400";
        nokia3.color = "green";
        nokia3.inform();
        System.out.println("---------------------------------------");
        System.out.println();

        Phone nokia4 = new Phone("Nokia D900", "grey", 800);
        nokia4.inform();
        System.out.println("---------------------------------------");
        System.out.println();

    }
}

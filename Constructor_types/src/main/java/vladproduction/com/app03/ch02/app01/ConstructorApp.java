package Constructor_examples.ch02.app01;

import Constructor_examples.ch02.app02.Cars;
//demonstration connection between packages classes (version #2)

public class ConstructorApp {

    public static void main(String[] args) {
        Cars bmw = new Cars();
        bmw.color = "black";
        bmw.price = 1;
        bmw.model = "7";
        bmw.printCarInfo();

        Cars vw = new Cars();
        vw.price = 2;
        vw.color = "white";
        vw.model = "Phaeton";
        vw.printCarInfo();

        System.out.println("constructor(string, string, int)");
        Cars mercedes = new Cars("DD", "green", 3);
        mercedes.model = "GLS 200";
        mercedes.printCarInfo();
    }
}

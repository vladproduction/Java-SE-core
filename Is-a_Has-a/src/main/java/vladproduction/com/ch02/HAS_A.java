package vladproduction.com.ch02;

public class HAS_A {
    public static void main(String[] args) {
        Laptop asus12A = new Laptop();
        Battery battery = new Battery();
        asus12A.setBattery(battery);
        System.out.println(asus12A); //has-a connective classes

    }
}

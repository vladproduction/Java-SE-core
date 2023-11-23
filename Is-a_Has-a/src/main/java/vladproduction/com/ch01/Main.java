package vladproduction.com.ch01;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        //Cat is-a Animal-->
        Animal cat2 = new Cat();
        //Dog is-a Animal-->
        Animal dog2 = new Dog();

        Car car = new Car();
        Engine engine = new Engine();
        car.setEngine(engine); //has-a
    }
}

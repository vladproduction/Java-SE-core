package vladproduction.com.ch01.People;

public class Main_people {
    public static void main(String[] args) {
        Man man = new Man();
        man.speak();
        man.run();
        man.swim("s");

        Human human = new Human();
        human.speak();
        human.run();
        human.swim("d");
        human.swim();


    }
}
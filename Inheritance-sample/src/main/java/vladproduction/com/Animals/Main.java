package vladproduction.com.Animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal methods: ");
        Animal animal = new Animal();
        animal.eat();
        animal.eat(10);
        animal.sound();
        System.out.println();

        System.out.println("Dog methods: ");
        Dog dog = new Dog();
        dog.eat(); //own eat-->overrides in Animal
        dog.superEat(); //creating new method with {super.eat()}
        dog.eat(2); //extends from parent
        dog.sound(); //extends from parent
        System.out.println();

        System.out.println("Cat methods: ");
        Cat cat = new Cat();
        cat.eat();//own eat-->overrides in Animal
        cat.jump();//own method-->only for Cat
        //can also evoke all parent methods
        System.out.println();

        System.out.println("Bird methods: ");
        Bird bird = new Bird();
        bird.fly();//own method-->only for Bird
        bird.eat();
        //can also evoke all parent methods
        System.out.println();

        System.out.println("Elephant methods: ");
        Elephant elephant = new Elephant();
        elephant.eat("tree leaves");//own method-->only for Elephant
        //even with the same name of parent method
        elephant.sound();//can also evoke all parent methods as well
        elephant.eat(25);
        System.out.println();

        System.out.println("British_Cat methods: ");
        British_Cat british_cat = new British_Cat();
        british_cat.runFast();// own method-->only for British_Cat
        british_cat.eat(); //eat from Cat
        //if evoke Animal.eat() for british_cat, should be commented eat() in Cat
        //can also evoke all parent and grandParent methods-->jump() from Cat
        british_cat.jump();
        british_cat.sound();




    }
}

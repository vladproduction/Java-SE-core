package Anonim_class.ch03.animal_example.classAnimal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Animal otherAnimal = new OtherAnimal();
        otherAnimal.eat();
        Animal animal1 = new Animal(){
            public void eat() {
                System.out.println("Other.animal eat");
            }
        };
        animal1.eat();
    }
}

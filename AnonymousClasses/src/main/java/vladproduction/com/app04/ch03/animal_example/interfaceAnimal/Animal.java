package Anonim_class.ch03.animal_example.interfaceAnimal;

public class Animal implements Eatable{
    @Override
    public void eat() {
        System.out.println("Animal implements Eatable-->eat()");
    }
}

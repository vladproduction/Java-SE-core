package Anonim_class.ch03.animal_example.interfaceAnimal;

public class Main {
    public static void main(String[] args) {
        Eatable eatable = new Animal();
        eatable.eat();

        System.out.println("other way:");
        Eatable eatable1 = new Eatable() {
            @Override
            public void eat() {
                System.out.println("Eatable eatable1 = new Eatable()");
            }
        };
        eatable1.eat();
    }

}

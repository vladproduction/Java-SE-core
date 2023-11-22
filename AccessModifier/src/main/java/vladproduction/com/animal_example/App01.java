package vladproduction.com.animal_example;

public class App01 {

    public static void main(String[] args) {
//        System.out.println("-------------static---------------");
//        Animal.eat();
//        Animal.age=1;
//        System.out.println("age="+Animal.age);
//        Animal.age=2;
//        System.out.println("age="+Animal.age);
//
//
//        System.out.println("-------------non static--------------");
        Animal dog = new Animal();
        dog.name= "Jack";
        Animal cat = new Animal();
        cat.name="Bars";
//
        dog.sleep();
        cat.sleep();
//
//        System.out.println("----------dog age------="+dog.age);
//        System.out.println("----------cat age------="+cat.age);
//
//        System.out.println("-------------update age for dog-------------");
//        dog.age=10;
//        System.out.println("----------dog age------="+dog.age);
//        System.out.println("----------cat age------="+cat.age);
//
//        System.out.println("-----------------------");
        Animal.test();
//        Eatable.age=1;

    }


}

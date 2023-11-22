package vladproduction.com.animal_example;

public class Animal {
    public String name;
    public static int age;


    public static void eat(){
        //System.out.println("Animal.eat() - static; name="+name);
        System.out.println("Animal.eat() - static");
    }

    public void sleep(){
        System.out.println("Animal with name= "+name+".sleep()");
    }

    public static void test(){
        //System.out.println("name="+name);
        System.out.println("age="+age);
    }
}

package vladproduction.com.app03;

public class ClassA {
    {
        System.out.println("Common part of constructors invoked");
    }
    public ClassA() {
        System.out.println("Default constructor");
    }
    public ClassA(int x){
        System.out.println("Parameterized constructor");
    }

}

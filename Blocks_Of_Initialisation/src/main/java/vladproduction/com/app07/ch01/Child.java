package Block_Initialization.ch01;

public class Child extends Father{
    static {
        System.out.println("Child-static block");
    }
    {
        System.out.println("\tChild-non static");
    }

    public Child() {
        System.out.println("\t\tChild-constructor");
    }
}

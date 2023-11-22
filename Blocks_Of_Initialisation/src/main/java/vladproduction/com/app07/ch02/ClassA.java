package Block_Initialization.ch02;

public class ClassA {
    public ClassA() {
        System.out.println("\t\tClassA()-constructor");
    }

    static {
        System.out.println("ClassA-static-1");
    }
    static {
        System.out.println("ClassA-static-2");
    }
    {
        System.out.println("\tClassA-1");
    }
    {
        System.out.println("\tClassA-2");
    }
    {
        System.out.println("\tClassA-3");
    }
}

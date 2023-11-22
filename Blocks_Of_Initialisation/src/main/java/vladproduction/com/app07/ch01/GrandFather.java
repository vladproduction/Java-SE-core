package Block_Initialization.ch01;

public class GrandFather {
    static {
        System.out.println("GrandFather-static block");
    }
    {
        System.out.println("\tGrandFather-non static");
    }

    public GrandFather() {
        System.out.println("\t\tGrandFather-constructor");
    }
}

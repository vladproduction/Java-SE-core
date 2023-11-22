package Block_Initialization.ch01;

public class Father extends GrandFather{
    static {
        System.out.println("Father-static block");
    }
    {
        System.out.println("\tFather-non static");
    }

    public Father() {
        System.out.println("\t\tFather-constructor");
    }
}

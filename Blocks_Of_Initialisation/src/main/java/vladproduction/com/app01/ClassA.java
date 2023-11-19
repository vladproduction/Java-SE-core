package vladproduction.com.app01;

public class ClassA {
    @Override
    public String toString() {
        return "ClassA{}";
    }

    static {
        System.out.println("Static block #1 ClassA");
    }
    static {
        System.out.println("Static block #2 ClassA");
    }
    {
        System.out.println("Non-static block #1 ClassA");
    }

}

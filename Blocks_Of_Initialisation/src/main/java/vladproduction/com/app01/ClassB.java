package vladproduction.com.app01;

public class ClassB extends ClassA{
    @Override
    public String toString() {
        return "ClassB{}";
    }

    {
        System.out.println("Non-static block #1 ClassB");
    }
}

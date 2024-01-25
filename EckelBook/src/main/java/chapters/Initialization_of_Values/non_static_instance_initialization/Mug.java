package chapters.Initialization_of_Values.non_static_instance_initialization;

public class Mug {
    public Mug(int marker) {
        System.out.println("Mug("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}

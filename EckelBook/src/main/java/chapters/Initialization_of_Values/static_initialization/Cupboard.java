package chapters.Initialization_of_Values.static_initialization;

public class Cupboard {
    Bowl b3 = new Bowl(3);
    static Bowl b4 = new Bowl(4);

    public Cupboard() {
        System.out.println("Cupboard()");
        b4.function(2);
    }
    void function3(int marker){
        System.out.println("function3("+marker+")");
    }
    static Bowl b5 = new Bowl(5);
}

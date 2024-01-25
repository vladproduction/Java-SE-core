package chapters.Initialization_of_Values.static_initialization;

public class Table {
    Bowl b1 = new Bowl(1);
    public Table() {
        System.out.println("Table()");
        b2.function(1);
    }
    public void function2(int marker) {
        System.out.println("function2("+marker+")");
    }
    static Bowl b2 = new Bowl(2);
}

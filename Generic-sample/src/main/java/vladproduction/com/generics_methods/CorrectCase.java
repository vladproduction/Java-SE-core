package vladproduction.com.generics_methods;

public class CorrectCase {
    public static void main(String[] args) {
        Div<Integer> d_1 = new Div<>(10, 20);
        Div<Double> d_2 = new Div<>(5.5, 1.1);
        boolean res = d_1.equalsDiv(d_2); // no error - could be called with variables parameterized by diff types
    }
}

class Div<T extends Number>{

    private T x;
    private T y;

    public Div(T x, T y) {
        this.x = x;
        this.y = y;
    }
    public int perform(){
        return (int) ( x.doubleValue() / y.doubleValue() );
    }
    public boolean equalsDiv(Division<T> data){
        return (this.perform() == data.perform());
    }

    public boolean equalsDiv(Div<?> data) {
        return (this.perform() == data.perform());
    }
}

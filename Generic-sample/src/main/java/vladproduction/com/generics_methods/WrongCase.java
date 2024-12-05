package vladproduction.com.generics_methods;

public class WrongCase {
    public static void main(String[] args) {
        Division<Integer> divInteger = new Division<>(10, 20);
        Division<Double> divDouble = new Division<>(11.5, 22.50);
//        boolean res = divInteger.equalsDivision(divDouble); //error, because required Integer type
    }
}
class Division<T extends Number>{

    private T x;
    private T y;

    public Division(T x, T y) {
        this.x = x;
        this.y = y;
    }
    public int perform(){
        return (int) ( x.doubleValue() / y.doubleValue() );
    }
    public boolean equalsDivision(Division<T> data){
        return (this.perform() == data.perform());
    }

}

package vladproduction.com.extends_type;

/**
 * This example describes a generic class Div with two fields of type T and a perform( ) method that performs integer division.
 * The parameter T is capped with the Number class, which means that only classes that are descendants of Number can be used as type arguments.
 * Therefore, in the perform() method, there is no need to check the references x and y for Number type
 * and cast them before calling the doubleValue() method. The compiler does this itself.
 * */
public class Div <T extends Number>{
    private T x;
    private T y;
    public Div(T x, T y) {
        this.x = x;
        this.y = y;
    }
    public int perform(){
        return (int) ( x.doubleValue() / y.doubleValue() );
    }
    public static void main(String[] args) {
        double aD = Math.random() * 100;
        double bD = Math.random() * 100;
        short aS = (short)(Math.random() * 100);
        short bS = (short) (Math.random () * 100);
        Div<Double> divD = new Div <>(aD, bD);
        System.out.println(aD + " : " + bD + " = " + divD.perform());
        Div<Short> divS = new Div <>(aS, bS);
        System.out.println(aS + " : " + bS + " = " + divS.perform());
//        Div<Character> obj3 = new Div<>('9', '2'); // compile error - Character is not a subclass of Number
        /*49.70132117265778 : 14.655876893531572 = 3
        86 : 28 = 3*/
    }
}

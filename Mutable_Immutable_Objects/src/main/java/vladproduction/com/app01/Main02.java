package vladproduction.com.app01;

public class Main02 {
    public static void main(String[] args) {

        final IntegerPair integerPair = new IntegerPair(10,20);
        System.out.println(integerPair);

        integerPair.x = 50;
        System.out.println(integerPair);

    }
}

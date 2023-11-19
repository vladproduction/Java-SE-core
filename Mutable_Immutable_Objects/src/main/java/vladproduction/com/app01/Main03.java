package vladproduction.com.app01;

public class Main03 {
    public static void main(String[] args) {

        IntegerPair_private_final integerPair = new IntegerPair_private_final(10,20);
        System.out.println(integerPair);

        //integerPair.x = 50; //java: x has private access in vladproduction.com.app01.IntegerPair_private_final
        System.out.println(integerPair);

    }
}

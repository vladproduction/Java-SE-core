package vladproduction.com.app01;

public class Casting_mechanism {
    public static void main(String[] args) {
        short i = -1; //'-1' as int but i is short
//        i = i - 1; //that one we have to cast to short
        //i = (short) (i - 1);
        i = (short) (i - i);
        System.out.println("i = "+i);

        //java resolve all calculations in type 'int' that`s why we have to cast
        short x = 1;
//        x = 2;
//        System.out.println("x = 2; "+x);
        x += 2;
        System.out.println("x += 2; "+x);

        System.out.println("---------------------");
        short s = -1;
        s = (short) (s >>> 1); //s as int (32 '111...1') but after move '>>>' 31 and first we have 0
        //(short) cut all left standing, so we have short (16 '111...1')
        //s  >>>= 1; //same expression as before , still does nothing
        System.out.println("s = (short) (s >>> 1); "+s); //-1

        byte b=100, c=50;
        byte d = (byte) (b+c); //explicit cast
    }
}

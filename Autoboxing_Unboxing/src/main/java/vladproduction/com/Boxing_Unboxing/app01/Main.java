package Boxing_Unboxing.app01;

public class Main {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println("b="+b);
        b--;
        System.out.println("b="+b);

        byte a = 0;
        while (a>=0){
            System.out.println("a="+a);
            a++;
        }
        System.out.println("a="+a);

        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;

        byte h = 15;
        byte y = 10;
        //byte res = x+y; no useful  operators.
        //сложение двух байтов не является байтом.

        byte res = (byte) (h+y); //response it will border of byte
        System.out.println(res);
        // if we do like this?
         h = 105;
         y = 120;
         res = (byte) (h+y);
        System.out.println(res); // go by circle
        int t = 1000;
        byte t2 = (byte)t;
        System.out.println("t2="+t2);
        //1000=(256*3)+232=232-256=-24
        System.out.println("------------------");
        Integer f = 5; // boxes int to an Integer object
        f =  f + 10;   // unboxes the Integer to f int
        System.out.println(f); //15



    }

}

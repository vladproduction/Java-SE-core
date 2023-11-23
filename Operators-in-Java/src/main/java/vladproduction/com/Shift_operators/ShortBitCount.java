package vladproduction.com.app01;

public class ShortBitCount {
    public static void main(String[] args) {

        short result = bitCount((short)3);
        System.out.println("result = "+result);

//        result = bitCount((short)-1);
//        System.out.println("result = "+result);  //зациклится

    }

    static short bitCount(short s){ //сколько единиц (бит) в заданной цифре
        short bits = 0; //счетчик
        while (s!=0){ //пока  's' не равен '0'
            bits += s & 1; //побитовый сдвиг через амперсант & на один бит (парный или непарный разряд)
                           //+= кастит выражение в заданный тип
            s >>>= 1; //сдвиг на 1 бит (деление на 2)
        }
        return bits;
    }
}

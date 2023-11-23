package Shift_operators;

import java.util.Random;

//Здесь мы видим пример, который демонстрирует использование всех операторов, использующих биты:
public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random();

        // int:
        int i = rand.nextInt();
        int j = rand.nextInt();

        pBinInt("-1", -1);
        pBinInt("+1", +1);

        int maxPositive = 2147483647;
        pBinInt("maxPositive", maxPositive);
        int maxNegative = -2147483648;
        pBinInt("maxNegative", maxNegative);

        pBinInt("i", i);
        pBinInt("~i", ~i);
        pBinInt("-i", -i);
        pBinInt("j", j);
        pBinInt("i & j", i & j);

        pBinInt("i | j", i | j);
        pBinInt("i ^ j", i ^ j);
        pBinInt("i << 5", i << 5);
        pBinInt("i >> 5", i >> 5);
        pBinInt("(~i) >> 5", (~i) >> 5);
        pBinInt("i >>> 5", i >>> 5);
        pBinInt("(~i) >>> 5", (~i) >>> 5);

        // long:
        long l = rand.nextLong();
        long m = rand.nextLong();
        pBinLong("-1L", -1L);
        pBinLong("+1L", +1L);
        long ll = 9223372036854775807L;
        pBinLong("maxPositive", ll);
        long lln = -9223372036854775808L;
        pBinLong("maxNegative", lln);
        pBinLong("l", l);
        pBinLong("~l", ~l);
        pBinLong("-l", -l);
        pBinLong("m", m);
        pBinLong("l & m", l & m);
        pBinLong("l | m", l | m);
        pBinLong("l ^ m", l ^ m);
        pBinLong("l << 5", l << 5);
        pBinLong("l >> 5", l >> 5);
        pBinLong("(~l) >> 5", (~l) >> 5);
        pBinLong("l >>> 5", l >>> 5);
        pBinLong("(~l) >>> 5", (~l) >>> 5);
    }

    static void pBinInt(String s, int i){
        System.out.println(s + ", int: " + i + ", binary: ");
        System.out.print("  ");
        for (int j = 31; j >= 0; j--){
            if(((1 << j) &  i) != 0){
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }
        System.out.println();
    }

    static void pBinLong(String s, long l) {
        System.out.println(
                s + ", long: " + l + ", binary: ");
        System.out.print("   ");
        for(int i = 63; i >=0; i--)
            if(((1L << i) & l) != 0)
                System.out.print("1");
            else
                System.out.print("0");
        System.out.println();
    }

    /*Вы обратите внимание на использование System.out.print( ) вместо System.out.println( ).
    Метод print( ) не вызывает появление новой строки, так что это позволяет вам выводить строку
    по кусочкам.
    Заодно здесь демонстрируется эффект для всех битовых операций для int и long, этот пример
    также показывает минимальное, максимальное, +1 и -1 значения для int и long, так что вы можете
    увидить как они выглядят. Обратите внимание на битовое представление знака: 0 означает положительное
    число, 1 означает отрицательное.
    Битовое представление чисел называется двоичным представлением.*/
}

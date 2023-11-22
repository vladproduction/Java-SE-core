package Boxing_Unboxing.app03_Overflow;

public class Overflow {

    public static void main(String[] args) {
        int big = 0x7fffffff; // максимальное значение типа int
        prt("big = " + big);
        int bigger = big * 4;
        prt("bigger = " + bigger);
    }
    static void prt(String s) {
        System.out.println(s);
    }
}

//big = 2147483647
//bigger = -4

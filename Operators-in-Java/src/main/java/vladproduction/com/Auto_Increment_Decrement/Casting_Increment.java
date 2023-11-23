package vladproduction.com.app01;

public class Casting_Increment {
    public static void main(String[] args) {
        int a = 3;
        a += 2.5;//calculate right part as double and in java automatically casting to int for left part
                 // '+=' that inside has such operation
        //a=a+2.5 --> '+=' not only calculation, also convert type
        System.out.println(a); //5

        int k = 5;
        k = ++k + ++k; //like 'k = 6 + 7'
        System.out.println(k); //13 cause override 'k' every step to the new value

        int t = 100, v;
        v = 2* ++t;
        System.out.println("v= "+v); //202 first change value and calculate

        int u = 100, i;
        i = 2* u++;
        System.out.println("i= "+i + ";u = "+u); //200 first calculate and change value for next calculation
    }
}

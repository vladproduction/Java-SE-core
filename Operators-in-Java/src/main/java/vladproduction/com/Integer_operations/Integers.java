package vladproduction.com.Integer_operations;

public class Integers {
    public static void main(String[] args) {
        int a = 10;
        int b = -2;
        int summa = a+b;
        System.out.println("summa="+summa);
        int subtraction = a-b;
        System.out.println("subtraction="+subtraction);
        int multiplication = a*b;
        System.out.println("multiplication="+multiplication);
        int devidion = a/b;
        System.out.println("devidion="+devidion);
        System.out.println("------------------------increment +1----------------------------");
        int x = 1;
        System.out.println("x="+x);
        x = 5;
        System.out.println("x="+x);
        x++;
        System.out.println("x="+x);
        x++;
        System.out.println("x="+x);
        x++;
        x++;
        x++;//10
        System.out.println("x="+x);
        System.out.println("------------------------decrement -1 ------------------------------");
        int z = 7;
        System.out.println("z="+z);
        z--;
        System.out.println("z="+z);
        z--;
        z--;
        z--;
        z--;// "z=2"
        System.out.println("z="+z);
        System.out.println("--------------------------add 500 -------------------------------------");
        int d = 500;
        System.out.println("d="+d);
        d=d+90;
        System.out.println("d="+d);
        d++;
        d++;
        d++;
        d++;//594
        System.out.println("d="+d);
        d--;
        d--;//592
        int r = 2;
        int sum2 = r+d;//594
        System.out.println("sum2="+sum2);
        int g = r*3;
        int summa3 = g+sum2;
        int k = -599;
        int one = summa3+k;
        System.out.println("one="+one);
        one--;
        one--;//-1
        System.out.println("one="+one);
        System.out.println("---------------  minus90  -----------------------------------");
        int e = 90;
        e=e-89;
        e++;
        e--;
        e--;// e=0
        System.out.println("e="+e);
        System.out.println("-------------  *10   --------------------");
        int h=3;
        h=h*10;
        h=h*2;
        h=h/6;
        h--;
        h=h/3;
        h++;
        h=h*10;//h=40
        System.out.println("h="+h);
        System.out.println("----------------- /2  ---------------------");
        h=h/2;
        h=h/2;
        h=h/2;
        h++;
        h=h/2;
        h--;
        h=h/2;//h=1
        System.out.println("h="+h);


    }
}

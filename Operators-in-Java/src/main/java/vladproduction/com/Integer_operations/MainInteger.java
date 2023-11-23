package vladproduction.com.Integer_operations;

public class MainInteger {

    public static void main(String[] args) {
        int a = 10;
        int b = -2;

        int sum = a+b;
        System.out.println("sum="+sum);

        int subtraction = a-b;
        System.out.println("subtraction="+subtraction);

        int multiplication = a*b;
        System.out.println("multiplication="+multiplication);

        int devidion = a/b;
        System.out.println("devidion="+devidion);

        System.out.println("---------increment (+1)-----------");
        int x = 1;
        System.out.println("x="+x);
        x = 3;
        System.out.println("x="+x);
        x++;
        System.out.println("x="+x);
        x++;
        System.out.println("x="+x);

        System.out.println("---------decrement (-1)-----------");
        int y = 1;
        System.out.println("y="+y);
        y--;
        System.out.println("y="+y);
        y--;
        System.out.println("y="+y);

        System.out.println("-------------add 100-------------------------");
        int t = 3;
        System.out.println("t="+t);
        //новое значение t єто старое значение t +100 --> 3+100 = 103
        t = t+100;
        System.out.println("t="+t);
        //t++; просто другая запись
        t = t+1;
        System.out.println("t="+t);

        System.out.println("-------------minus 100-------------------------");
        int r = 8;
        System.out.println("r="+r);
        //новое значение r єто старое значение r -100 --> 8-100 = -92
        r = r-100;
        System.out.println("r="+r);
        //r--;
        r = r-1;
        System.out.println("r="+r);

        System.out.println("-------------* 2-------------------------");
        int p = 5;
        System.out.println("p="+p);
        p = p*2;
        System.out.println("p="+p);
        p=5;
        System.out.println("p="+p);

        System.out.println("-------------/ 2-------------------------");
        int m = 10;
        System.out.println("m="+m);
        m = m /2 ;
        System.out.println("m="+m);
        m = 10;
        System.out.println("m="+m);
    }


}

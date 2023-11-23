package vladproduction.com.operations_type;

public class Calc_Methods {
    public static void main(String[] args) {
        Calc_Methods calcMethods = new Calc_Methods();
        calcMethods.minus("14", "10");
        calcMethods.minus2("10", 5);
        calcMethods.minus3(10, 8);
        calcMethods.mul(2, 5);
        calcMethods.mul2(2, 2);
        calcMethods.mul3(2, "7");
        calcMethods.mul4("5", 2, "2");
        calcMethods.mul5("100", 2, "4");
        calcMethods.dev(2, 3);
        calcMethods.sub2("3", "1");
        calcMethods.add(2, 3);
        calcMethods.add("Real", "Madrid");
        calcMethods.add("2", "5");
        calcMethods.add("5", 5);
        calcMethods.add(1878, "  Manchester United");
        calcMethods.add2(2, "три");
        calcMethods.sub(7, 8);
        calcMethods.sub("fifth", "five");
        calcMethods.sub1("fifth", 4);
        calcMethods.sub2("12", "10");
        calcMethods.sub3("14", 10);
        calcMethods.dev1(100, 10);
        int rez = calcMethods.multi(3, 5);
        System.out.println(rez);
        String rez2 = calcMethods.multi2(2, 5);
        System.out.println(rez2);
        System.out.println("-------------------------------------------------------");
        calcMethods.dev2(2,3);
        calcMethods.dev3(2,"2");
        calcMethods.dev4("50",10,"2");



    }


    public int add(int a, int b) {
        System.out.println(String.format("add(int+int);a=%s,b=%s", a, b));
        int summa = a + b;
        System.out.println(summa);
        return summa;
    }

    public String add(String a, String b) {
        System.out.println(String.format("add(String+String);a=%s,b=%s", a, b));
        String summa = a + b;
        System.out.println(summa);
        return summa;
    }

    public int add(String a, int b) {
        System.out.println(String.format("add(String+int);a=%s,b=%s", a, b));
        int word = Integer.parseInt(a);
        int summa = word + b;
        System.out.println(summa);
        return summa;

    }

    public String add(int a, String b) {
        System.out.println(String.format("add(int+String);a=%s,b=%s", a, b));
        String integer = a + "";
        String summa = integer + b;
        System.out.println(summa);
        return summa;
    }

    public int add2(int a, String b) {
        System.out.println(String.format("add2(int+String{amount letters});a=%s,b=%s", a, b));
        int bLength = b.length();
        System.out.println(bLength);
        int summa = a + bLength;
        System.out.println(summa);
        return summa;
    }

    public int sub(int a, int b) {
        System.out.println(String.format("sub(int-int);a=%s,b=%s", a, b));
        int res = a - b;
        System.out.println(res);
        return res;
    }

    public void sub(String a, String b) {
        System.out.println(String.format("sub(String-String);a=%s,b=%s", a, b));
        int aLength = a.length();
        int bLength = b.length();
        int res = aLength - bLength;
        System.out.println(res);
    }

    public void sub1(String a, int b) {
        System.out.println(String.format("sub(String-int{String as amount of word length);a=%s,b=%s", a, b));
        int aLength = a.length();
        int res = aLength - b;
        System.out.println(res);
    }

    public int sub2(String a, String b) {
        System.out.println(String.format("sub2(String-String{String fields printed as integer});a=%s,b=%s", a, b));
        int aStr = Integer.parseInt(a);
        int bStr = Integer.parseInt(b);
        int res = aStr - bStr;
        System.out.println(res);
        return res;

    }

    public void sub3(String a, int b) {
        System.out.println(String.format("sub(String-int{String field printed as integer});a=%s,b=%s", a, b));
        int aStrInteger = Integer.parseInt(a);
        int res = aStrInteger - b;
        System.out.println(res);
        //return res;
    }

    public int multi(int a, int b) {
        int multiplyInteger = a * b;
        return multiplyInteger;
    }

    public String multi2(int a, int b) {
        int multiplyInteger = a * b;
        return "a*b=" + multiplyInteger;

    }

    public int dev1(int a, int b) {
        int rez = a / b;
        System.out.println(rez);
        return rez;
    }

    public String minus(String a, String b) {

        int aString = Integer.parseInt(a);
        int bString = Integer.parseInt(b);
        int c = aString - bString;
        String rez = c + "";
        System.out.println("method ---> minus");
        System.out.println(rez);
        return rez;
    }

    public int minus2(String a, int b) {
        int aString = Integer.parseInt(a);
        int rez = aString - b;
        System.out.println("method ---> minus2");
        System.out.println(rez);
        return rez;
    }

    public int minus3(int a, int b) {
        int c = a - b;
        String res = c + "";
        System.out.println("method ---> minus3");
        System.out.println(res);
        return c;

    }

    public int mul(int a, int b) {
        System.out.println("method ---> mul");
        return a * b;
    }

    public String mul2(int a, int b) {
        int c = a * b;
        String res = c + "";
        System.out.println("method ---> mul2");
        System.out.println(c);
        System.out.println(res);
        return res;
    }

    public int mul3(int a, String b) {
        int bInt = Integer.parseInt(b);
        int c = bInt * a;
        System.out.println("method ---> mul3");
        System.out.println(c);
        return c;

    }

    public int mul4(String d, int a, String b) {
        int bInt = Integer.parseInt(b);
        int dInt = Integer.parseInt(d);
        int c = dInt - (a * bInt);
        System.out.println("method ---> mul4");
        System.out.println(c);
        return c;

    }

    public String mul5(String d, int a, String b) {
        int bInt = Integer.parseInt(b);
        int dInt = Integer.parseInt(d);
        int c = dInt - (a * bInt);
        String res = c + "";
        System.out.println("method ---> mul5");
        System.out.println(c);
        return res;

    }

    public int dev(int a, int b) {
        int c = a / b;
        System.out.println("method ---> dev");
        System.out.println(c);
        return c;
    }

    public String dev2(int a, int b) {
        int c = a / b;
        String res = c + "";
        System.out.println("method ---> dev2");
        System.out.println(c);
        System.out.println(res);
        return res;
    }

    public int dev3(int a, String b) {
        int bInt = Integer.parseInt(b);
        int c = bInt / a;
        System.out.println("method ---> dev3");
        System.out.println(c);
        return c;

    }

    public String dev4(String d, int a, String b) {
        int bInt = Integer.parseInt(b);
        int dInt = Integer.parseInt(d);
        int c = dInt / (a / bInt);
        String res = c + "";
        System.out.println("method ---> dev4");
        System.out.println(c);
        return res;

    }
}

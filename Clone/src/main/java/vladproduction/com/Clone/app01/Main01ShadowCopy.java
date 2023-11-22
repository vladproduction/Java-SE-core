package vladproduction.com.Clone.app01;

public class Main01ShadowCopy {


    public static void main(String[] args) {
        MyTv a = new MyTv();
        a.setManufactory("LG");
        a.setPrice(1);
        System.out.println("a="+a);

        MyTv b =a;
        System.out.println("b="+b);
        System.out.println("a.hash="+a.hashCode());
        System.out.println("b.hash="+b.hashCode());
        System.out.println("a==b-->"+(a==b));
        System.out.println("a.eq(b)-->"+a.equals(b));
        System.out.println("---------update price----------");
        a.setPrice(2);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("---------update manufactory----------");
        b.setManufactory("SAMSUNG");
        System.out.println("a="+a);
        System.out.println("b="+b);
        //1 tv and 2 пульта
    }

}

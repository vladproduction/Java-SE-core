package vladproduction.com.Clone.app01;

public class Main02ShadowCopy {


    public static void main(String[] args) {
        MyTv a = new MyTv();
        a.setManufactory("LG");
        a.setPrice(1);
        System.out.println("a="+a);

        MyTv b =new MyTv();
        b.setManufactory("LG");
        b.setPrice(1);
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
       // now it is 2 different TV with it`s own remote control
    }

}

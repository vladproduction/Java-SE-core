package vladproduction.com.ch03;


import vladproduction.com.ch02.Player;

public class MainTV {

    public static void main(String[] args) {
        Tv lg = new Tv();
        lg.price=100;
        lg.model="lg";
        System.out.println("lg.hashCode="+lg.hashCode());

        Tv my = new Tv();
        my.price=100;
        my.model="my";
        System.out.println("my.hashCode="+my.hashCode());

        System.out.println("--------------");
        boolean isSame = my==lg;
        boolean isEquals = my.equals(lg);
        System.out.println("isSame="+isSame);
        System.out.println("isEquals="+isEquals);
        System.out.println("--------------------------");
        Player cafu = new Player();
        cafu.number=2;
        cafu.name="Cafu";
        boolean equalsResult = lg.equals(cafu);
        System.out.println("equalsResult="+equalsResult);
        System.out.println("------------------------------");

        Tv a = new Tv();
        Tv b = new Tv();

        a.model="samsung";
        a.price=2000;

        b.model="samsung";
        b.price=2000;

        int aHash = a.hashCode();
        int bHash = b.hashCode();
        boolean isEqualTv = a.equals(b);
        System.out.println("aHash="+aHash);
        System.out.println("bHash="+bHash);
        System.out.println("a.equals(b)="+isEqualTv);





    }

}


package vladproduction.com.Clone.app01.problem;

public class App01 {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyPhone a = new MyPhone();
        a.setPrice(1);
        a.setManufactory("LG");
        MyPhoneInfo info = new MyPhoneInfo();
        info.setColor("White");
        info.setSize(10);
        a.setMyPhoneInfo(info);
        System.out.println("a="+a);

        System.out.println("--------clone-----");
        //no problems
        MyPhone b = a.clone();
        System.out.println("b="+b);
        System.out.println("a.hash="+a.hashCode());
        System.out.println("b.hash="+b.hashCode());
        //problem
        MyPhoneInfo bInfo = b.getMyPhoneInfo();
        MyPhoneInfo aInfo = a.getMyPhoneInfo();
        System.out.println("bInfo.hash="+bInfo.hashCode());
        System.out.println("aInfo.hash="+aInfo.hashCode());

        System.out.println("----------update Color for b-----------");
        bInfo.setColor("RED");
        System.out.println("b="+b);
        System.out.println("a="+a);

    }
}


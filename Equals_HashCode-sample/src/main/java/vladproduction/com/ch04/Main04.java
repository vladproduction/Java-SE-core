package vladproduction.com.ch04;

public class Main04 {

    public static void main(String[] args) {
//        String a = new String("my text");
//        String b = new String("my text");
//        boolean isSame = (a==b);                     // -false
//        boolean isEquals = a.equals(b);              // -true
//        System.out.println("isSame="+isSame);
//        System.out.println("isEquals="+isEquals);
//        System.out.println("------------------");
//        String x = "my text";
//        String y = "my text";
//        boolean isSame = (x==y);                       // -true
//        boolean isEquals = x.equals(y);                // -true
//        System.out.println("isSame="+isSame);
//        System.out.println("isEquals="+isEquals);
//        System.out.println("------------------");
        String t1 = "test";
        String t2 = new String("test");
        boolean isSame = (t1==t2);                   // -false cause it`s reference to another object
        boolean isEquals = t1.equals(t2);            //-true (compare by object equivalence relation)
        System.out.println("isSame="+isSame);
        System.out.println("isEquals="+isEquals);
        System.out.println("t1.hash="+t1.hashCode());          // t1.hash=3556498
        System.out.println("t2.hash="+t2.hashCode());          // t2.hash=3556498

        boolean isEqualHasCode = t1.hashCode()==t2.hashCode();
        System.out.println("isEqualHasCode = "+isEqualHasCode);   // isEqualHasCode = true



    }

}

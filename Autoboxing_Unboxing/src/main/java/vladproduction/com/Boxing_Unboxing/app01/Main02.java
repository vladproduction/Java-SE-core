package Boxing_Unboxing.app01;

public class Main02 {
    public static void main(String[] args) {
        byte b = 1;
        m0(b);
        m1(b);
        m2(b);
        m3(b);

        short c = 450;
       // m0(c); short as byte no legal
        m1(c);
        m2(c);
        m3(c);

        int i = 450;
        //m0(i); int as byte no legal
        //m1(i); int as short no legal
        m2(i);
        m3(i);

        long l = 450;
        //m0(l); long as byte no legal
        //m1(l); long as short no legal
        //m2(l); long as int no legal
        m3(l);
    }
    public static void m0(byte qqq){
        System.out.println("qqq_byte="+qqq);
    }
    public static void m1(short qqq){
        System.out.println("qqq_short="+qqq);
    }
    public static void m2(int qqq){
        System.out.println("qqq_int="+qqq);
    }
    public static void m3(long qqq){
        System.out.println("qqq_long="+qqq);
    }
}

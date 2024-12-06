package vladproduction.com.ch02_enum_constructor;

public class Main {
    public static void main(String[] args) {
        MyDays2 x = MyDays2.MONDAY;
        int n = x.getN();
        System.out.println("n = " + n);

        MyDays2[] myDays2s = MyDays2.values();
        for (int i = 0;i < myDays2s.length; i++){
            MyDays2 item = myDays2s[i];
            System.out.println(item);
            String name = item.name();
            System.out.println("name = " + name);
        }
    }
}

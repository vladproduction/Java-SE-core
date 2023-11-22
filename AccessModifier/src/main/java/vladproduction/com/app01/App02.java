package vladproduction.com.app01;

public class App02 {


    public static void main(String[] args) {
        Phone p1 = new Phone();

        //private
        int price = p1.calculatePrice();
        System.out.println("price="+price);

        //default
        p1.weight=20;
        p1.printWeight();

        //protected
        p1.color="White";
        p1.printColor();

        p1.call();
        p1.sms();
        p1.makePhoto();
        //p1.alarm(); no access! "private method"







    }

}

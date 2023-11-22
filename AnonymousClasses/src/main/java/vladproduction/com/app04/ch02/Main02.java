package Anonim_class.ch02;

public class Main02 {
    public static void main(String[] args) {
        Computer c = new Computer() {
            @Override
            public void powerOFF() {
                System.out.println("switch OFF");
            }

            @Override
            public void powerON() {
                System.out.println("switch On");
            }
        };
        c.powerON();
        c.powerOFF();
    }
}

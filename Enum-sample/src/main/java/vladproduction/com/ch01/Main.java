package vladproduction.com.ch01;

public class Main {
    public static void main(String[] args) {
        MyDays x = MyDays.TUESDAY;
        switch (x){
            case MONDAY:
                System.out.println(1);
                break;
            case TUESDAY:
                System.out.println(2);
                break;
        }
        x.play();

    }
}

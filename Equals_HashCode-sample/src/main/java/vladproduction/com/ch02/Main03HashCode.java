package vladproduction.com.ch02;

public class Main03HashCode {

    public static void main(String[] args) {
        Player zidane = new Player();
        Player kaka = new Player();
        Player cafu = new Player();
        Player zidaneReal = zidane;

        System.out.println("zidaneReal.hashCode="+zidaneReal.hashCode());
        System.out.println("zidane.hashCode="+zidane.hashCode());
        System.out.println("kaka.hashCode="+kaka.hashCode());
        System.out.println("cafu.hashCode="+cafu.hashCode());



    }

}

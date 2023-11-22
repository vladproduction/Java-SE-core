package vladproduction.com.ch02;

public class Main02 {

    public static void main(String[] args) {
        Player zidane = new Player();
        zidane.number=21;
        zidane.name="Zidane";

        Player zidaneReal = zidane;
        //Player zidaneReal = zidane = new Player();

        System.out.println("zidane.number="+zidane.number);
        System.out.println("zidane.surname="+zidane.name);
        System.out.println("zidaneReal.number="+zidaneReal.number);
        System.out.println("zidaneReal.surname="+zidaneReal.name);
        System.out.println("-----------Update-----------------");
        zidaneReal.number=5;
        System.out.println("zidane.number="+zidane.number);
        System.out.println("zidane.surname="+zidane.name);
        System.out.println("zidaneReal.number="+zidaneReal.number);
        System.out.println("zidaneReal.surname="+zidaneReal.name);
        System.out.println("-----------------------------------");
        boolean isSame = (zidane==zidaneReal);
        boolean isEquals = zidane.equals(zidaneReal);
        System.out.println("isSame="+isSame);
        System.out.println("isEquals="+isEquals);




    }

}

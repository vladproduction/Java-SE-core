package vladproduction.com.app01;

public class Main04 {
    public static void main(String[] args) {

        String first = "first";
        System.out.println(first.hashCode()); //97440432

        first += "!";
        System.out.println(first.hashCode()); //-1274313871
        //different string - different hashCode;
    }
}

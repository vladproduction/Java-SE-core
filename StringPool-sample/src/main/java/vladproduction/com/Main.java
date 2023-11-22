package vladproduction.com;

public class Main {
    public static void main(String[] args) {
        String a = "text";
        String b = "text";

        System.out.println(a==b);
        System.out.println("----------------------------");

        String c = new String("text");
        System.out.println(a==c);
        // but equals value is same, text equals text

    }
}

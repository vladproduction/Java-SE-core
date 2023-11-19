package vladproduction.com.app05;

public class MutableExample {
    public static void main(String[] args) {
        StringBuilder mutableString = new StringBuilder("Hello");
        mutableString.append(", World!");
        System.out.println(mutableString);

    }
}

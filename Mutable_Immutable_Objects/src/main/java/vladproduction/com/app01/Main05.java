package vladproduction.com.app01;

public class Main05 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Object mutable?");
        int indexOfElement = sb.indexOf("?");
        System.out.println("indexOfElement = " + indexOfElement);

        sb.setCharAt(14, '!');
        System.out.println(sb);
    }
}

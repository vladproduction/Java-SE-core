package vladproduction.com.app02;

public class Main {
    public static void main(String[] args) {

        PrivateConstructor pc = PrivateConstructor.getInstance();
        PrivateConstructor pc1 = PrivateConstructor.getInstance();

        System.out.println(pc.equals(pc1)); //true

    }
}

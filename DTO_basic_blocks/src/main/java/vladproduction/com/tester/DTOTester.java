package vladproduction.com.tester;

import vladproduction.com.model.ImmutableLogin;
import vladproduction.com.model.MutableLogin;

public class DTOTester {
    public static void main(String[] args) {
        MutableLogin mutableLogin = new MutableLogin();
        mutableLogin.setName("John");
        System.out.println("--John-- expected");
        System.out.println("getter: " + mutableLogin.getName());

        mutableLogin.setName("David");
        System.out.println("--David-- expected");
        System.out.println("getter: " + mutableLogin.getName());


        ImmutableLogin immutableLogin = new ImmutableLogin("Name", "pass", 10L);
        System.out.println("--Name-- expected");
        //no way to change, setter does not exist
        System.out.println("getter: " + immutableLogin.getName());
        Long immutableLoginNumber = immutableLogin.getNumber();
        immutableLoginNumber++;
        System.out.println("getter number: " + immutableLogin.getNumber());
    }
}

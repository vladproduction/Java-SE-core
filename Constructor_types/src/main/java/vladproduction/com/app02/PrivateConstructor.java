package vladproduction.com.app02;

public class PrivateConstructor {

    private static PrivateConstructor pc;

    private PrivateConstructor() {
    }

    //creating public method to invoke private constructor:
    public static PrivateConstructor getInstance() {
        if (pc == null) {
            //creating a constructor of the class
            pc = new PrivateConstructor();
        }
        return pc;
    }
}

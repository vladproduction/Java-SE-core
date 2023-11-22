package vladproduction.com.ch03;

public class Bike {
    private final int speed=22; //in-line
    private final int sizeWheel; //in-it block
    private final String type;


    //initialisation block
    {
     sizeWheel=34;
    }

    //here can be constructor

    public Bike(String type) {

        this.type = type;
    }
}

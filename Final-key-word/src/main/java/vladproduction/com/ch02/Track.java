package vladproduction.com.ch02;

public class Track extends Car{
//    @Override
//    public void typeEngine() {  //not allowed
//        System.out.println("only Diesel");
//    }

    @Override
    public void amountWheels() {
        System.out.println("Track has 12 wheels");
    }
}

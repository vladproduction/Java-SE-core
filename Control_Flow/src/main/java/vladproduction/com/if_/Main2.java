package vladproduction.com.if_;

/**
 * Main class of the Java program.
 */

public class Main2 {

    public static void main(String[] args) {
        String weather = "sunny";
        if (weather.equals("rainy")) {
            System.out.println("It`s " + weather + ".");
            System.out.println("Don't forget to bring your umbrella.");
        } else if (weather.equals("sunny")) {
            System.out.println("It`s " + weather + ".");
            System.out.println("Don't forget your sunglasses.");
        } else if (weather.equals("windy")) {
            System.out.println("It`s " + weather + ".");
            System.out.println("Don't forget to bring your coat.");
        } else {
            System.out.println("It`s " + weather + ".");
            System.out.println("Enjoy the snow!");
        }
    }
    //output:
    /*It`s sunny.
    Don't forget your sunglasses.*/
}

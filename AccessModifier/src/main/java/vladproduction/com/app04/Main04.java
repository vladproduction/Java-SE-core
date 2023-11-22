package vladproduction.com.app04;

public class Main04 {
    public static void main(String[] args) {
        Football football = new Football();
        football.run(); //public method from same pack
        football.playBall();//default method from same pack
        football.rulesFootball(); //can`t use - it`s private method
                                  //or we can change access modifier to (public,default or protected)

        //been created Class Futsal extends Football. Has no own methods yet.
        Futsal futsal = new Futsal();
        futsal.run();
        futsal.playBall();
        futsal.rulesFootball();
        /*all methods are accessible as well as ofr Football instance
        * because we extends  */


    }
}

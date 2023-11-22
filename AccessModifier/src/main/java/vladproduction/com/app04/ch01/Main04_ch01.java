package vladproduction.com.app04.ch01;

/*
*now we create a new pack to demonstrate access to the class from another pack;
* ch01 was created;
* Class MiniFootball was created which extends from Football (another pack)
*
 */

public class Main04_ch01 {
    public static void main(String[] args) {
        MiniFootball miniFootball = new MiniFootball();
        miniFootball.run(); //available - because it`s public
        // no access to the default, private

        miniFootball.rulesFootball();
        // protected begun available only after overridden method

        miniFootball.ballSize(); //public void ballSize() overridden with it`s own logic
                                //and has been changed access modifier to public; so it`s wider
        miniFootball.ballSize(4); //same name of method but with other parameters, no problem as well
    }
}

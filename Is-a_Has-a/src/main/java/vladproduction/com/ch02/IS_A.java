package vladproduction.com.ch02;

public class IS_A {
    public static void main(String[] args) {
        //Parent class instance
        Sports_Ball sports_ball = new Sports_Ball();
        //Kids class (which are extends);
        Basketball basketball = new Basketball(); // new instance (reference on child class)
        Sports_Ball football = new Football(); //  new instance (reference on parent class)
        // no chances to create a child as a new instance of Sports_Ball(parent class)
        //Handball handball = new Sports_Ball();
        //the rule working to widing class, so we can say:
        Handball handball = new Handball();
        Sports_Ball handball2 = new Handball();
    }
}

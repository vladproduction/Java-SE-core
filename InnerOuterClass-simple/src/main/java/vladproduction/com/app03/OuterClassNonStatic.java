package vladproduction.com.app03;

//Non-static inner class:
public class OuterClassNonStatic {
    private int x;

    public class InnerClass {
        public void displayX() {
            System.out.println("Value of x: " + x);
        }
    }
}

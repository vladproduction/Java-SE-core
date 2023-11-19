package vladproduction.com.app03;

//Static inner class:
public class OuterClassStatic {
    private static int x;

    public static class InnerClass {
        public void displayX() {
            System.out.println("Value of x: " + x);
        }
    }
}

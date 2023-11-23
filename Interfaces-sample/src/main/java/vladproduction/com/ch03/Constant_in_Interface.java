package vladproduction.com.ch03;

public class Constant_in_Interface {
    public static void main(String[] args) {

        Water_Pipe pipe = new Water_Pipe();
        pipe.printState(1);

    }

    public interface Stateable{
        int OPEN = 1;
        int CLOSE = 0;

        void printState(int x);
    }

    static class Water_Pipe implements Stateable{
        @Override
        public void printState(int x) {
            if(x==OPEN){
                System.out.println("Water is OPEN");
            } else if (x==CLOSE) {
                System.out.println("Water is CLOSE");
            }else {
                System.out.println("System ERROR");
            }

        }
    }
}

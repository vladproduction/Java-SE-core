package vladproduction.com.ch03;

public class Engine_Process2 {
    public static void main(String[] args) {
        //have to do it with Java 9.0
    }

    class Calc implements Calculable{

    }


    public interface Calculable {
        default int sum(int a, int b) {
            return sumAll();
        }

        default int sum(int a, int b, int c) {
            return sumAll();
        }

        static int sumAll(int... values) {  //should be private method
            int result = 0;
            for (int n : values) {
                result += n;
            }
            return result;
        }
    }
}


